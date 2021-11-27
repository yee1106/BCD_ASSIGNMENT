package util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.crypto.Cipher;
import java.security.*;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import org.apache.commons.lang3.ArrayUtils;
import util.KeyCreator.KeyAccess;

public class AsymmCrypto {
    //Q: Whats the API needed to support en/de-cryption?
    //A: Cipher
    private Cipher cipher;

    public AsymmCrypto() {
        try {
            cipher = Cipher.getInstance(Configuration.PUBLICKEY_ALGORITHM);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * encrypt(String, PublicKey)
     */
    public String encrypt( String input, String hashUserName) throws Exception{
        PublicKey key = KeyAccess.getPublicKey(hashUserName);
        String cipherText = null;
        cipher.init(Cipher.ENCRYPT_MODE, key);
        //encrypt
        byte[] enBytes = null;
        for (int i = 0; i < input.length(); i += 64) {  
          byte[] cipherBytes = cipher.doFinal(ArrayUtils.subarray(input.getBytes(), i,i + 64));  
          enBytes = ArrayUtils.addAll(enBytes, cipherBytes);  
        }
//        byte[] cipherBytes = cipher.doFinal( input.getBytes() );
        cipherText = Base64.getEncoder().encodeToString(enBytes);

//      StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < input.length(); i += 100) {
//              byte[] doFinal = cipher.doFinal(ArrayUtils.subarray(input.getBytes(), i,
//                  i + 100));
//				sb.append(new String(doFinal));
////				dataReturn = ArrayUtils.addAll(dataReturn, doFinal);
//        }
        return cipherText;
    }


    /**
     * decrypt(String, PrivateKey)
     */
    public String decrypt( String cipherText, String hashUserName ) throws Exception{
      PrivateKey key = KeyAccess.getPrivateKey(hashUserName);
      cipher.init(Cipher.DECRYPT_MODE, key);
      
      byte[] byteArray = Base64.getDecoder().decode( cipherText.getBytes() ) ;
      
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < byteArray.length; i += 128) {
          byte[] doFinal = cipher.doFinal(ArrayUtils.subarray(byteArray, i, i + 128));
          sb.append(new String(doFinal));
      }
      return sb.toString();
//      cipher.update( Base64.getDecoder().decode( cipherText.getBytes() ) );
//      byte[] dataBytes = cipher.doFinal();
//        return new String(dataBytes);
    }
}
