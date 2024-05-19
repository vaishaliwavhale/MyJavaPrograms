package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreeMaxMin {
    public static void main(String[] args) {
        List<Integer>nums= Arrays.asList(2,6,8,7,4,3,6,2,1,5,6,10);
        List<Integer>maxNum=nums.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(maxNum);

        List<Integer>minNum =nums.stream().sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList());
        System.out.println(minNum);
    }
}
