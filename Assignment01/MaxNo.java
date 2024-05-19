package Assignment01;

import java.util.Scanner;

class MaxNo {
     public static void main(String[]args){
         int a,b;

          Scanner sc=new Scanner(System.in);
         System.out.println("Write down the 1st number you want:");
        // System.out.println();
          a= sc.nextInt();
         System.out.println("Write down the 2nd number you want:");
         b= sc.nextInt();
         if(a>b){
             System.out.println("The given no is greater"+a);
         }else if(a<b){
             System.out.println("The given no is greater"+b);
         }

     }
}
