package task;

import java.util.Scanner;

public class TotalMarksOfSubject {
    public static void main(String[] args) {
        int sci,m1,chem,it,bio,eng,total;
       double per;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter The Marks Of Six Subject");
        sci=scanner.nextInt();
        m1=scanner.nextInt();
        chem=scanner.nextInt();
        it=scanner.nextInt();
        bio=scanner.nextInt();
        eng=scanner.nextInt();
      total=  sci+ m1+ chem + it + bio + eng ;
      per= (total/600.0)*100 ;
        System.out.println(" Total Marks Obtain In Six Subject:- " + total);
        System.out.println("The Total Percentage Obtain Is :-  "+ per);
    }
}
