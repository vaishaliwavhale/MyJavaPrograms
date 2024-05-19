package AssignmentNo2;

import java.util.Scanner;

 class Question6 {
     public static void main(String[]args){
         double num1,num2;
         Scanner sc=new Scanner(System.in);
         System.out.println("Write the 1st number here:");
         num1=sc.nextDouble();
         System.out.println("Write the 2nd number here:");
         num2=sc.nextDouble();
         if(num1==num2){
             System.out.println("The given number is same");
         }else{
             System.out.println("The given number is  not same");
         }
     }
}
