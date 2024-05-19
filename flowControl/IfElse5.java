package flowControl;

import java.util.Scanner;

class IfElse5 {
     public static void main(String[]args){
         String result;
         System.out.println("Write down the Result here:");
         Scanner sc=new Scanner(System.in);

         result=sc.nextLine();

String s= "P";
         if(result.equals(s) ){
             System.out.println("The student clear the interview");
         }else
         {
             System.out.println("The student not able to clear the interview");
         }
     }
}
