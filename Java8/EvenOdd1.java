package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd1 {
    public static void main(String[] args) {
        List<Integer>listOfInt= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer>evenNum=listOfInt.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNum);

        List<Integer>oddNum=listOfInt.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(oddNum);
    }
}
