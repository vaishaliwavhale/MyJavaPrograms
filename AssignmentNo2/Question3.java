package AssignmentNo2;

import java.util.Scanner;

class Question3 {
     public static void main(String[]args){
         int a,b,c;
         Scanner sc=new Scanner(System.in);
         System.out.println("Write the first number here:");
         a=sc.nextInt();
         System.out.println("Write the 2nd number here:");
         b=sc.nextInt();
         System.out.println("Write the 3rd number here:");
         c=sc.nextInt();
         if(a>b && a>c){
             System.out.println("The number a is greater");
         }else if(b>c){
             System.out.println("The number b is greater");
         }else{
             System.out.println("The number c is greater");
         }
     }
}
