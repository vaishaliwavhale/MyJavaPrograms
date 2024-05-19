package AssignmentNo2;

import java.util.Scanner;

class Question4 {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int num;
         System.out.println("Write the first number here:");
         num=sc.nextInt();
         if (num==0){
             System.out.println("The number is zero");
         }else if (num>0){
             System.out.println("The number is Positive");
         }else{
             System.out.println("The number is Negative");
         }
     }
}
