package hierarchicalinheritance;

class first{
    int a, b;
    public void numbers(int x, int y) {

           a = x;
           b = y;
    }
}

class second extends first{
    int add(){
        return (a+b);
    }
    public void showAdd(){
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("Sum = "+add());
    }
}


class three extends first{

    int multiplication() {
        return (a*b);
    }

    int substraction() {
        return (a-b);
    }

    public void showMultiplication(){
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("Multiplication= "+multiplication());
    }


    public void showSubstraction(){
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("Substraction= "+substraction());

    }
}

public class Java {
    public static void main(String[] args) {

        second objs = new second();
        objs.numbers(50,50);
        objs.showAdd();


       three objd = new three();
        objd.numbers(50,50);
        objd.showMultiplication();
        objd.showSubstraction();

    }
}
