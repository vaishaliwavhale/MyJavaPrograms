package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
//       ArrayList<String>name=new ArrayList<>();
//       name.add("vaishali");
//        name.add("vishal");
//        name.add("vishakha");
//        System.out.println(name);
//    }
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(11);
        list.add(12);
        list.add(13);
       // System.out.println(list);
        // when we wan to add value on perticular index.
       // list.add(2,100);

        //We wan't to add all new list in old list.
//        List<Integer> newList =new ArrayList();
//        newList.addAll(list);
        //This will remove the value from the list

//
        // ***************Remove method overload here.........Remove perticular Method*****************************
        list.remove(Integer.valueOf(13));
         System.out.println(list);
    }
}
