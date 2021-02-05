package task;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number Of Row's You Needed :- ");

        int rows = scanner.nextInt();
        for ( int i=1; i<=rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
