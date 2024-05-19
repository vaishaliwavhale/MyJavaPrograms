package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueValue {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,5,36,7,4,5,6,2,1,3,2,5,5,54,5,1,12,6,5,4,5,44,4,4);
        int i = 0;
        List<Integer> uniqueVal= new ArrayList<> ();
                nums.stream().distinct().forEach(uniqueVal::add);
        System.out.println("Unique Valuse are:- "+uniqueVal);
    }
}
