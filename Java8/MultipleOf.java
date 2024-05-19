package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOf {
    public static void main(String[] args) {
        List<Integer> num_list= Arrays.asList(1,5,3,2,10,25,30,40,4,6,9,8,7,5,4,5);
        List<Integer>multiple_list=num_list.stream().filter(n->n%5==0).collect(Collectors.toList());
        System.out.println(multiple_list);

        //Multiply each number in the list by 5;
        List<Integer>num_multi=num_list.stream().map(i->i*5).collect(Collectors.toList());
        System.out.println(num_multi);
    }
}
