package Java8;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChar1 {
    public static void main(String[] args) {
       // List<String> list= Arrays.asList("vaishali","arati","pratiksha","samruddhi","vaishanvi");
        String name="Huda is  multi-talented girl";
        Map<Character, Long> charCount=name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCount);
    }
}
