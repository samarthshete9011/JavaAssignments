package task;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter The Year :- ");
        int year = scanner.nextInt();

        if(year%4==0)
        {
            System.out.println(year + " Is a Leap Year ");
        }
        else {
            System.out.println(year+" This Not A Leap Year");
        }


    }

}
