package org.example.fundamentals;

public class Exercise11 {
    public static void main(String[] args) {
//        Write an encryption and decryption mechanism using the Caesar cipher
        String text="ALINA ARE MERE";
        int next= 3;

        String encryptionText=encrypt(text,next);
        System.out.println("Text criptat: "+encryptionText);

        String decryptionText=decrypt(encryptionText,next);
        System.out.println("Text decriptat: "+decryptionText);


    }

    public static String encrypt(String text, int next){
        StringBuilder cryptText= new StringBuilder();

        for (int i = 0; i<text.length(); i++){
            char character= text.charAt(i);

            if (Character.isLetter(character)){
                char base= Character.isUpperCase(character) ? 'A':'a';
                character= (char) ((character-base+next)%26+base);
            }
            cryptText.append(character);
        }
     return  cryptText.toString();
    }

    public static String decrypt(String text, int next){
        return encrypt(text, 26-next);
    }

}
