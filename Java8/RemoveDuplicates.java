package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,5,4,6,2,13,6,5,1,2,6,5,4,1,5,5,5,4,1,4,5,6,8,7);
        List<Integer>uniqueVal=nums.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueVal);
    }
}
