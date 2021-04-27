package com.company.Banking;
import java.util.Random;

public class PassGen {
    public static String generate(int length){
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*()_+";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for(int i = 0; i < length; ++i){
            password.append(combinedChars.charAt(random.nextInt(combinedChars.length())));
        }
        return password.toString();
    }
}
