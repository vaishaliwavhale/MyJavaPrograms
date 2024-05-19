package Inheritance;

 class Drink_Machine {
     double quantity=11.1;
     String material="Tea powder";
     void showDetails(){
         System.out.println("The details of Material:-"+"\nThe material required:-"+material+"\nthe quantities of material:-"+"quantity");
     }
}
class Tea_Machine extends Drink_Machine{
    void showDetails1(){
        System.out.println("\nThe material required:-"+material+"the quantities of material:-"+"quantity");
    }
}
class Coffee_Machine{
     public static void main(String[]args){
         Tea_Machine t1=new  Tea_Machine();
         t1.showDetails();
         t1.showDetails1();
     }
}