package flowControl;

import java.util.Scanner;

class IfElse4 {
     public static void main(String[]args){
         int age;
         Scanner sc=new Scanner(System.in);

         System.out.println("Write the age of person:");
         age=sc.nextInt();
         if (age>=65){
             System.out.println("The person is senior citizen");
         }else {
             System.out.println("The person is Adult");
         }
     }
}
