package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfInteger {
    public static void main(String[] args) {
        List<Integer>num_list= Arrays.asList(1,3,4,8,9,5,6,3,2,15,4,7,8,9,8,5,2,6,5,5,5,4,1,23,6,6,6,5,4,12);
        Map<Integer,Long> list=num_list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(list);
    }
}

