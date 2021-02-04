package task;

import java.util.Scanner;

public class PositiveNegtiveNumber {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value:-");
        num = scanner.nextInt();



        if (num > 0) {
            System.out.println("Number is POSITIVE");
        } else if (num < 0) {
            System.out.println("Number is NEGATIVE");
        } else {
            System.out.println("Number is ZERO");
        }


    }


}

