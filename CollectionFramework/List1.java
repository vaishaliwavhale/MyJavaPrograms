package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {
    public static void main(String[] args) {


        // method in ArrayList:---1.add 2. remove 3.
        //create empty ArrayList
        List<String> name = new ArrayList<>();
        name.add("vaishali");
        name.add("Divya");
        name.add("sam");
        name.add("Pratiksha");
        name.add("Aarti");

        // to add element
       // System.out.println("the list od name:---"+ name);

        // to remove element as per the index
        name.remove(2);

        // to set element at perticualr index
        name.set(2, "Samruddhi");
        //System.out.println("the list od name:---"+ name);

        // to check the elements in the give list
        ;
        System.out.println("the list od name:---"+ name.contains("Aarti"));


        //Iterarte in different ways:-
        //1.for loop
//        for (int i=0;i< name.size();i++){
//            System.out.println(" the element is:->"+name.get(i));
//        }

        //2.for each loop
//        for(String str: name){
//            System.out.println(" the element is:->"+str);

            //3.Iterator
            Iterator<String> it =name.iterator();
            while(it.hasNext()){
                System.out.println("the elements are:->"+it.next());
            }
        }

    }

