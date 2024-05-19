package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        List<String> names=List.of("Vaishali","tina","mina","mina","Vaishali");
        List<String>uniquenames=names.stream().distinct().collect(Collectors.toList());
        System.out.println(uniquenames);

    }
}
