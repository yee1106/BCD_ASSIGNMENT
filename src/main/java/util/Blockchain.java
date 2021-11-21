package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;

import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Blockchain {

    //master-binary-filename
    private static final String CHAIN_FILE 		= 	"master/blockchain.bin";

    //data-structure
    public static LinkedList<Block> DB 	= 	new LinkedList<>();

    //ledger-filename
    private static final String LEDGER_FILE		=	"ledger.txt";

    //nextBlock() : append the block to the chain
    public static void nextBlock( Block newBlock ) {
        DB.add(newBlock);
        persist();
    }

    //persist() : write the chain to the master-file
    public static void persist() {
        /**
         * Helper classes for persisting the object (LinkedList) to the binary-file
         * 	1) FileOutputStream; 2) ObjectOutputStream
         */
        Path path = Paths.get(CHAIN_FILE);
        try {
          Files.createDirectories(path.getParent());
          if( !Files.exists(path))
              Files.createFile(path);
        } catch (IOException ex) {
          System.out.println("BlockChain file doen't exist!!");
        }
        try(
          FileOutputStream fos = new FileOutputStream( new File(CHAIN_FILE));
          ObjectOutputStream out = new ObjectOutputStream( fos );
        ) {
            out.writeObject( DB );
            System.out.println( ">>> Master file updated!" );
        } catch (IOException e) {
            System.out.println("BlockChain file doen't exist!!");
        }
    }

    //get() : retrieve the chain from the master-file
    public static LinkedList<Block> get(){
        /**
         * Helper classes for reading the object (LinkedList) from the binary-file
         * 	1) FileInputStream; 2) ObjectInputStream
         */
        try(
                FileInputStream fis = new FileInputStream( CHAIN_FILE );
                ObjectInputStream in = new ObjectInputStream( fis );
        ) {
          DB = (LinkedList<Block>) in.readObject();
        } 
        catch(FileNotFoundException e){
          if(DB.size() == 0){
            Block genesis = new Block( "0" );
            Blockchain.nextBlock(genesis);  
            Blockchain.distribute();
          }
        }catch(Exception ex){}
        
        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson( DB ));
        
        return DB;
    }

    //distribute() : printout the ledger records (demo)
    public static void distribute() {
        /**
         * convert the chain to the text form using Gson API
         */
        String chain = new GsonBuilder().setPrettyPrinting().create().toJson( DB );
        System.out.println( chain );
        try {
            Files.write(
                    Paths.get( LEDGER_FILE ),
                    chain.getBytes(),
                    StandardOpenOption.CREATE);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
