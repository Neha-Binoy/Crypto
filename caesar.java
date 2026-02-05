import java.util.*;
public class caesar{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter text:");
        String text = s.nextLine();
        System.out.print("Enter shift:");
        int shift=s.nextInt();
        StringBuilder enctext = new StringBuilder();
        StringBuilder dectext = new StringBuilder();    
        for(char c: text.toCharArray()){
            if(Character.isLetter(c)){
                char base = Character.isUpperCase(c)?'A':'a';
                enctext.append((char)(((c-base+shift)%26)+base));
            }
            else{
                enctext.append(c);
            }

        }
        for(char c: enctext.toString().toCharArray()){
            if(Character.isLetter(c)){
                char base = Character.isUpperCase(c)?'A':'a';
                dectext.append((char)(((c-base-shift+26)%26)+base));
            }
            else{
                dectext.append(c);
            }
        }
        System.out.println("Encrypted text:"+enctext);
        System.out.println("Decrypted text:"+dectext);
    }
}