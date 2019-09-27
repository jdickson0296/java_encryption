package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

//        String originalString = "Sulu123";
//        String encryptedString = AES.encrypt(originalString) ;
//        String decryptedString = AES.decrypt(encryptedString) ;
//        System.out.println(originalString);
//        System.out.println(encryptedString);
//        System.out.println(decryptedString);

        String encrypted = AESFileEncryption.Encrypt("Paper1.edited.docx");
        System.out.println(encrypted);

        String decrypted = AESFileDecryption.Decrypt("encryptedfile.des");
        System.out.println(decrypted);

    }
}




