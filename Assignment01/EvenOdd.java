package Assignment01;

import java.util.Scanner;

class EvenOdd {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Write the number here you wan't:");
         int num= sc.nextInt();
         if(num%2==0){
             System.out.println("The given number is Even number");
         }else
         { System.out.println("The given number is odd number");

         }
     }
}
