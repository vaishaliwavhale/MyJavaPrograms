package ArrayBasics;
import java.util.Scanner;

 class ArrayProgram1 {
     public static void main(String[] args) {
         //Two types of array declaration
         //1.declare    2.assign
         int index;
         int[] marks = new int[5];
         Scanner sc = new Scanner(System.in);

         // int num = sc.nextInt();
         int num;

             for (index = 0; index < 5; index++) {
                 System.out.println("Write value you wan't to add in Array:");
                 num = sc.nextInt();

                 System.out.println("The array index is :" + index + "\n Index value is:" + num);
             }


     }
 }
