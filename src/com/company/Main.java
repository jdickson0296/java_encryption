package com.company;

public class Main {

    public static void main(String[] args) {

        String originalString = "Sulu123";

        String encryptedString = AES.encrypt(originalString) ;
        String decryptedString = AES.decrypt(encryptedString) ;

        System.out.println(originalString);
        System.out.println(encryptedString);
        System.out.println(decryptedString);

    }
}




