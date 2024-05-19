package Assignment01;

import java.util.Scanner;

class Divisible5 {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Write the number here you wan't:");
         int num=sc.nextInt();
         if(num%5==0 && num%11==0){
             System.out.println("The given number is divisible by 5 and 11");
         }else{
             System.out.println("The given number is not 1divisible by 5 and 11");
         }
         //if (num%11==0){
           //  System.out.println("The given number is divisible by 11");
         //}

     }

}
