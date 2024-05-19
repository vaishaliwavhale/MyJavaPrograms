package Java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramString {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
       //  str1= Stream.of(Arrays.stream(str1.split("")).map(String::toUpperCase)).sorted().collect(Collectors.joining());
      //  String str22=Stream.of(str2.split(" ").map(String::toUpperCase).sorted().collect(Collectors.joining()));
    }
}
