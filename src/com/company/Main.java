package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        String password = "password123";
        AESFileEncryption.Encrypt("plainfile.txt", password);
        AESFileDecryption.Decrypt("encryptedfile.des", "txt", password);
    }
}




