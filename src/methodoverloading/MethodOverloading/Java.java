package methodoverloading.MethodOverloading;

class Clacy {
    public void add(int a, int b) {
        System.out.println(a + b);
    }


    public void add(int a, int b, int c) {
        System.out.println(a + b);
        System.out.println(a + b + c);
    }
}

public class Java {
    public static void main(String[] args) {
        Clacy obj = new Clacy();
        obj.add(30, 29);



        obj.add(30, 29, 50);
    }
}
