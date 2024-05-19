package CollectionFramework;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[]args){
//        String name[]=new String[4];
//        name[1]="vaishali";
//        name[2]="huda";
//        name[3]="Arti";

        //Dynamically size of this arry will get change.
        //We can add duplicate values in list.
       ArrayList<String> stud_name=new ArrayList<String>();
       stud_name.add("Vaishali");
        stud_name.add("Huda");
        stud_name.add("Arti");
            System.out.println("Here is the list of all student:"+stud_name);

    }
}
