package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAlpha {
    public static void main(String[] args) {
        List<String> list_of_strings = Arrays.asList("vaishali", "vikas", "akash", "vikasssss");
      /* List<String> list_of_Sorted_strings = list_of_strings.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(list_of_Sorted_strings);


        String s=list_of_strings.stream().sorted(Comparator.naturalOrder()).skip(2).findFirst().get();
        System.out.println(s);*/
    }
}