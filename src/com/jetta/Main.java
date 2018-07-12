package com.jetta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello here is what i do:");
        System.out.println("To execute a fibbonacci sequence type 1");
        System.out.println("To see the box max variables type 2");
        System.out.println("To see the box sets type 3");
        System.out.println("To see the box group type 4");
        System.out.println("To process the data type 5");

        int option = input.nextInt();
        Box box1 = new Box(210, 0.253,0.608, 0.518);
        Box box2 = new Box(200, 0.263, 0.480, 0.323);
        Box box3 = new Box(200, 0.203, 0.403, 0.413);
        Box box4 = new Box(200, 0.170, 0.530, 0.380);
        Box box5 = new Box(140, 0.285, 0.435, 0.255);
        Box container = new Box(1, 2.48, 10, 3.28);
        Box[] boxArray = new Box[] {box1, box2, box3, box4, box5};

        switch(option) {
            case 1:
                System.out.print("Type the number of elements that you want me to calculate: ");
                int number = input.nextInt();
                Util.fibonacci(number);
                break;
            case 2:
                Util.getBoxMax(boxArray, container);
                break;
        }
    }
}
