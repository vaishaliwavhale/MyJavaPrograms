package Java8;

import java.util.function.LongUnaryOperator;

public class Factorial {
    public static void main(String[] args) {
        LongUnaryOperator factorial= n->{
            long result=1;
            for(int i=1;i<=n;i++){
                result=result * 1;

            }
            return result;
        };
        long n=8;
        long factorial_result= factorial.applyAsLong(n);
        System.out.println(factorial_result);
    }
}
