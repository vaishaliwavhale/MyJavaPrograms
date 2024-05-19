package CollectionFramework;

import java.util.Arrays;
import java.util.LinkedList;

public class ToArray1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);



        //System.out.println("listing "+ Arrays.toString(list.toArray()));
        Object[] arr = new String[]{list.toString()};
       // for (Object element : list);
        //Object[] a = list.toArray();
        System.out.println("list" + list);
    }
}