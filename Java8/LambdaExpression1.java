package Java8;

interface A{
    //abstract method with two parameters.
    void Display(int a,int b);
}

public class LambdaExpression1 {
    public static void main(String[] args) {
        A a1=(int a,int b)->{
            System.out.println("the sum of  numbers is:-"+ (a+b));
        };
        a1.Display(10,20);
    }
}
