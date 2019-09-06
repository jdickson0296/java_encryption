package com.company;

public class Main {

    public static void main(String[] args) {

        final String secretKey = "ssshhhhhhhhhhh!!!!";

        String originalString = "Jonathan123";
        String encryptedString = AES.encrypt(originalString, secretKey) ;
        String decryptedString = AES.decrypt(encryptedString, secretKey) ;

        System.out.println(originalString);
        System.out.println(encryptedString);
        System.out.println(decryptedString);

    }
}




