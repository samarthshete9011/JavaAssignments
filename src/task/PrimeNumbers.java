package task;

public class PrimeNumbers {

    public static void main(String[] args) {
        int i,j,k;
        System.out.println("These are the Prime Number's From 1 To 100 :- ");

        for (i = 2;i<=100;i++)
        {
            k = 0;
            for (j = 2; j <= i / 2; j++) {

                if (i % j == 0) {    // % means mode
                    k = 1;
                    break;
                }
            }
            if (k==0)
            System.out.print(i + " ");
            }
        }
    }

