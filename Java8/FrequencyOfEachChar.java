package Java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
       /* List<String> name=List.of("Vaishali","Vishal","deepali");
        List<String>frequencyOfChar=name.stream().filter().(Collectors.toList());
*/
        String collegeName="jawaharlala beharu engineering college";
       // Map<Character,Long>charCount=collegeName.chars().mapToObj(e->(char) e).collect(Collectors);
        Map<Character,Long> map = collegeName.chars()//Use the chars() method to convert the string into an IntStream of Unicode code points.
                .mapToObj(e -> (char) e)//Use the mapToObj() method to convert each integer code point to its corresponding character representation.
                .collect(Collectors.groupingBy(Function.identity()//Use the Collectors.groupingBy() collector to group the characters by their frequency.
                        ,Collectors.counting()));//Collectors.counting() downstream collector to count the occurrences of each character.
        System.out.println(map);//iterate through the map and print the frequency of each character.
    }
    
}