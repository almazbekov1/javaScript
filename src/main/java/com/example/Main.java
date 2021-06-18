package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a two numbers:    ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a < b) {
            if(a % 2 != 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
