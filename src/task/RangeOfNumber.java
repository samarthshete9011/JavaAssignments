package task;

import jdk.nashorn.internal.parser.JSONParser;

import javax.xml.soap.SOAPPart;
import java.util.Scanner;



public class  RangeOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter x Value:-");
        x = scanner.nextInt();
        System.out.println("Enter y Value:-");
        y = scanner.nextInt();
        System.out.println("Enter z Value:-");
        z = scanner.nextInt();

        Condition condition = new Condition();
        condition.GreaterValue(x,y,z);
    }

}

class Condition {
    public void GreaterValue(int x, int y, int z) {
        if (x > y && x > z)
            System.out.println("X Value Is Greater ");
        else if (y > x && y > z)
            System.out.println("Y Value IsGreater ");
        else if (z > x && z > y)
            System.out.println("Z Value Is Greater ");
        else
            System.out.println("Sir Ki Jay Ho ");
    }
}




