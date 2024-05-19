package Java8;


import java.util.function.Predicate;

public class EmptyString {
    public static void main(String[] args) {

        Predicate<String> p1 = str -> str.isEmpty();
         String str1="";
        String str2="Vaishai";

        System.out.println("string 1st is empty   " +p1.test(str1));
        System.out.println("string 2nd is empty   "  +p1.test(str2));
   
    }

}
