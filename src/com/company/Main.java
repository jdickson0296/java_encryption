package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        String encrypted = AESFileEncryption.Encrypt("plainfile.txt");
        System.out.println(encrypted);

        String decrypted = AESFileDecryption.Decrypt("encryptedfile.des", "txt");
        System.out.println(decrypted);

    }
}




