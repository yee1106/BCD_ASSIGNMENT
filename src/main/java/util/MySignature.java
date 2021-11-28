package util;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.util.Base64;
import util.KeyCreator.KeyAccess;

public class MySignature {


    private Signature signature;

    private KeyPair keyPair;

    public MySignature(String hashUsername) {
        try {
          keyPair = new KeyPair(KeyAccess.getPublicKey(hashUsername), KeyAccess.getPrivateKey(hashUsername));
          signature = Signature.getInstance( "SHA256WithRSA" );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * sign()
     */
    public String sign( String data ) {
        try {
            signature.initSign( keyPair.getPrivate() );
            signature.update( data.getBytes() );
            return Base64.getEncoder().encodeToString( signature.sign() );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * verify()
     */
    public boolean verify( String data, String signatureString ) {
        try {
            signature.initVerify(keyPair.getPublic());
            signature.update( data.getBytes() );
            return signature.verify( Base64.getDecoder().decode(signatureString) );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }




}
