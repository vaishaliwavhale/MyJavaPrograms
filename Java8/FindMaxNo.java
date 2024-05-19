package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaxNo {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,5,4,6,5,8,7,5,5,4,5,5,10,11,16,45);
      /* Optional<Integer> list= numbers.stream().filter(c->c%2==0).max(Comparator.naturalOrder());
        System.out.println(list);*/
       Map<Integer,Long> list= numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(list);
    }
}
