
package com.mycompany.aplicatia6;

/**
 *
 * @author Mihai Munteanu
 */
 
public class Aplicatia6{
    
    // Encrypts text using a shift od s
    public static StringBuffer encrypt(String text, int step)
    {
        StringBuffer result = new StringBuffer();
 
        // For each character.
        for (int i=0; i<text.length(); i++)
        {
            // Check range if uppercase
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + step - 65) % 26 + 65);
                result.append(ch);
            }
            // or is lowercase.
            else if (Character.isLowerCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + step - 97) % 26 + 97);
                result.append(ch);
            }
            // If it's neither, it can be treated as an exception so we won't encrypt.
            else {
                result.append(text.charAt(i));
            }
        }
        // Return the result.
        return result;
    }
    
    
    // Encrypts text using a shift od s
    public static StringBuffer decrypt(String text, int step)
    {
        StringBuffer result = new StringBuffer();
 
        // For each character.
        for (int i=0; i<text.length(); i++)
        {
            // Check range if uppercase
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) - step + 65) % 26 + 65);
                result.append(ch);
            }
            // or is lowercase.
            else if (Character.isLowerCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) - step + 97) % 26 + 97);
                result.append(ch);
            }
            // If it's neither, it can be treated as an exception so we won't encrypt.
            else {
                result.append(text.charAt(i));
            }
        }
        // Return the result.
        return result;
    }
 
//    Main Function.
    public static void main(String[] args)
    {
        // String to apply the function on.
        String text = "TI PA";
        // Step.
        int step = 13;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + step);
        
        String encrypted = encrypt(text,step).toString();
        System.out.println("Cipher: " + encrypted);
        
        String decrypted = decrypt(encrypted,step).toString();
        System.out.println("Decrypted: " + decrypted);
        
        
    }
}