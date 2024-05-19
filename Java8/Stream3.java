package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        List<Integer> evenNo = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenNo);

        List<Integer>oddNumber=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(oddNumber);
    }
}
