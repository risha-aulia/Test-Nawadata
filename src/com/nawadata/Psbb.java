package com.nawadata;

import java.util.Scanner;

public class Psbb {
    public static void main(String[] args) {

        //2. PSSBB

        Scanner scanner = new Scanner(System.in);
        int numberFamilies;
        int[] numberMembers;
        System.out.println("input the number of families : ");
        numberFamilies = scanner.nextInt();

        numberMembers = new int[numberFamilies];

        System.out.println("Input the number of members in the family ");
        System.out.println("separated by a space : ");
        for (int i = 0; i < numberFamilies; i++){
            numberMembers[i] = scanner.nextInt();
        }

        int totalMembers = 0;
        for (int i = 0; i < numberFamilies; i++){
            totalMembers += numberMembers[i];
        }
        int capacity = (int) Math.ceil((double) totalMembers / 4);

        if (totalMembers != numberFamilies * 4){
            System.out.println("Minimum bus required is : " + capacity);
        }
        else{
            System.out.println("Input must be equal with count of family");
        }
    }
}
