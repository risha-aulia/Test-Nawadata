package com.nawadata;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        RISHA AULIA
//1. Problem : Sort Character

        Scanner input = new Scanner(System.in);
        System.out.println("Input one line of words (S) : ");
        String kata = input.nextLine().toLowerCase();

        char[] vowel = new char[0];
        char[] consonant = new char[0];

        String vowels = "aeiou";
        String vowelCharacters = "";
        String consonantCharacters = "";

        for (int i = 0; i < kata.length(); i++) {
            char c = kata.charAt(i);
            if (Character.isLetter(c)) {
                if (vowels.indexOf(Character.toLowerCase(c)) != -1) {
                    vowelCharacters += c;
                } else {
                    consonantCharacters += c;
                }
            }
        }

        System.out.println("Vowel Characters :");
        System.out.println(vowelCharacters);
        System.out.println("Consonant Characters :");
        System.out.println(consonantCharacters);
    }
}







