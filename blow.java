import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.*;

public class blow{
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);

        System.out.print("Enter text:");
        String message = s.nextLine();

        System.out.print("Enter key:");
        String keyInput = s.nextLine();
        byte[] keybytes = keyInput.getBytes("UTF-8");

        SecretKeySpec key = new SecretKeySpec(keybytes,"Blowfish");

        Cipher cipher = Cipher.getInstance("Blowfish");

        cipher.init(Cipher.ENCRYPT_MODE,key);
        byte[] encrypted = cipher.doFinal(message.getBytes("UTF-8"));
        String enctext = Base64.getEncoder().encodeToString(encrypted);

        cipher.init(Cipher.DECRYPT_MODE,key);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(enctext));
        String dectext =  new String(decrypted,"UTF-8");

        System.out.println("Original:"+message);
        System.out.println("Encrypted:"+enctext);
        System.out.println("Decrypted:"+dectext);
    }
}