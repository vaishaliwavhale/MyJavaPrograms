package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxNo {
    public static void main(String[] args) {
        List<Integer> num_list = Arrays.asList(1, 5, 3, 2, 10, 25, 30, 40, 4, 6, 9, 8, 7, 5, 4, 5);
        Optional<Integer> max=num_list.stream().max(Comparator.naturalOrder());
        System.out.println(max);

        Optional<Integer>min=num_list.stream().min(Comparator.naturalOrder());
        System.out.println(min);
    }
}
