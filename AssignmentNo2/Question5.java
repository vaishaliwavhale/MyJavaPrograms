package AssignmentNo2;

import java.util.Scanner;

class Question5 {

     public static void main(String[]args) {
         int day_No;
         Scanner sc = new Scanner(System.in);
         System.out.println("Write the  number of days here:");
         day_No = sc.nextInt();
         //String day_No;
         switch (day_No) {
             case 1:
                 System.out.println("Monday");
                 break;
             case 2:
                 System.out.println("Tuesday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             case 7:
                 System.out.println("Sunday");
                 break;

             default:
                 System.out.println("Invalid choice");

         }

     }
}
