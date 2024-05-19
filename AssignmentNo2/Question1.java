package AssignmentNo2;

import java.util.Scanner;
 class Question1 {
     public static void main(String[]args){
         //1. Write a Java program to get a number from the user and print whether it is positive or negative.
         Scanner sc=new Scanner(System.in);
         System.out.println("Write the number here which you want:");
         int num=sc.nextInt();
         if(num>=0){
             System.out.println("The given number is positive");
         }else{
             System.out.println("The given number is negative");
         }
     }
}
