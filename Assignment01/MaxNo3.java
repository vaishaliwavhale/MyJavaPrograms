package Assignment01;

import java.util.Scanner;

class MaxNo3 {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);

         System.out.println("Write the 1st number here:");
         int a=sc.nextInt();
         System.out.println("Write the 2nd number here:");
         int b=sc.nextInt();
         System.out.println("Write the 3rd number here:");
         int c=sc.nextInt();
         if (a>b && a>c){
             System.out.println("The 1st number is greater"+a);
         }else if(b>c){
             System.out.println("The 2nd number is greater"+b);
         }
        else{
             System.out.println("The 3rd number is greater"+c);
         }

     }
 }
