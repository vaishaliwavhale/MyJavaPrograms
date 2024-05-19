package Java8;

import java.util.Arrays;
import java.util.List;



public class ToUpperCase {
    public static <string> void main(String[] args) {


        List<String> list = Arrays.asList("Vaishali", "samruddhi", "aditi");

        for (String s : list) {
            System.out.println(s);
        }
       list.replaceAll(s->s.toUpperCase());
        for( String s1: list )
        System.out.println(s1);
    }
}