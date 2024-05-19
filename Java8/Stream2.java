package Java8;

import javax.xml.stream.StreamFilter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        Stream<Integer>numbers=Stream.of(1,2,3,4,5,6,7,8,9,10);

        //List<Integer>numbers=List.of();

       // List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);


        List<Integer>evennumber= numbers.filter(i ->i%2==0).collect(Collectors.toList());
        System.out.println(evennumber);
    }
}
