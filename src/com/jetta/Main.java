package com.jetta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello here is what i do:");
        System.out.println("To execute a fibbonacci sequence type 1");

        int option = input.nextInt();

        switch(option) {
            case 1:
                System.out.print("Type the number of elements that you want me to calculate: ");
                int number = input.nextInt();
                Util.fibonacci(number);
                break;
            case 2:
                System.out.println("To be implemented");
                break;
        }
    }
}
