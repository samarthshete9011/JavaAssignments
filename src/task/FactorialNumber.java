package task;

import java.util.Scanner;

public class FactorialNumber {
    private static Scanner sc;
    public static void main(String[] args) {
        int i, Number;
        long Factorial = 1;
        sc = new Scanner(System.in);
        System.out.println(" Please Enter any number to Find Factorial: ");
        Number = sc.nextInt();

        for (i = 1; i <= Number; i++)  {
            Factorial = Factorial * i;
        }
        System.out.format("Factorial of %d = %d", Number, Factorial);
    }
}
