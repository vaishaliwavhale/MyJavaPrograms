package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("vaishali");
        name.add("Teena");
        name.add("Meena");
        name.add("Reena");

      /*  Stream<List> emptystream=Stream.empty();
        System.out.println(emptystream.count());
*/
        Stream<String> stream = name.stream();
        Stream<String> stream1= Stream.of("vaishali", "java","python");
    }
}
