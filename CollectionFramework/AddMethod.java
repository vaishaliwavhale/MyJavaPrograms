package CollectionFramework;

import java.util.LinkedList;

public class AddMethod {
    public static void main(String[] args) {

     LinkedList<String > list=new LinkedList<>();
        //******************************** create list********************************
        list.add("Vaishali");
        list.add("Huda");
        list.add("Sam");
        list.add("Tina");
        //System.out.println("elements in the list are:"+list);
        //*********************************Upadte list*********************************
        list.set(2,"Samruddhi");
        list.set(3,"priya");
       // System.out.println("elements in the new  list are:"+list);


        //**********************************Remove element *****************************
//        list.remove(2);
//        System.out.println("elements in the new  list are:"+list);

        //*********************************Iterating over element**********************
        // By using for loop
        for(int i=0;i>=3;i++){
           System.out.println("elements in the new  list are:"+list);

        }

        //********************************************************************************
        //by using for each loop
        //for(String str:list){
          //  System.out.println("elements in the new  list are:"+list);

        //}







    }
}
