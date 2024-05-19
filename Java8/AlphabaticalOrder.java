package Java8;

import java.util.Arrays;
import java.util.List;

public class AlphabaticalOrder {
    public static void main(String[] args) {
        List<String>fruits= Arrays.asList("Mango","Apple","Grapes","Custerdapple");

        for(String str: fruits){
            System.out.println("the list of fruits before filter:- "+str);
        }
        fruits.sort((str1,str2)->str1.compareToIgnoreCase(str2));
        System.out.println("the list of fruits after filter:- "+fruits);
    }
}
