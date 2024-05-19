package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer>numsList= Arrays.asList(11,5,11,7,10,12,25,13,121,133,144,7);

        //List<Integer>primeNo=numsList.stream().filter(n->num%n==0).collect(Collectors.toList());
       // System.out.println(primeNo);
    }
}
