package Java8;
interface sumation{
    int sumations(int a,int b);

}

public class SumOfNo {
    public static void main(String[] args) {
        sumation s1=(a,b)->a+b;
        int result=s1.sumations(3,7);
        System.out.println("sum of two numbers is:-- "+result);
    }

}
