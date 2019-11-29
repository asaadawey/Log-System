/* 
 * 
 * Â® All rights reserved 2019 , By Ahmed Saadawey
 * 
 */
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Ahmed Saadawey
 * 2019 All Rights Reserved
 */
public class EncryptionDemo {
 public static String encrypt(String strClearText,String strKey) throws Exception{
        byte[] encryptArray = Base64.encodeBase64(strClearText.getBytes());        
     String encstr = new String(encryptArray,"UTF-8");  
   
   return encstr;
}
 public static String decrypt(String strEncrypted,String strKey) throws Exception{
     byte[] dectryptArray = strEncrypted.getBytes();
     byte[] decarray = Base64.decodeBase64(dectryptArray);
     String decstr = new String(decarray,"UTF-8"); 
   return decstr;
   // return strData;
}
}