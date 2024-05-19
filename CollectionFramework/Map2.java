package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        //Create empty hashMap
        Map<String,Integer> students=new HashMap<>();
        students.put("Vaishali",1);
        students.put("Vaishnavii",2);
        students.put("Vishal",3);
        students.put("Vaibhavi",4);
        students.put("Vishakha",5);


        //prints this elements
        System.out.println("the list of student is:- " +"\n" + students);

        // System.out.println("Collection.sort(students)");
    }




}
