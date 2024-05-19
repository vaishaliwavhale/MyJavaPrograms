package Assignment01;

import java.util.Scanner;

class Question8 {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Write the year here:");
         int year=sc.nextInt();
         System.out.println("Write the month number here:");
         int month_no=sc.nextInt();
         int number = 0;
         //System.out.println("Enter the case number here:");
          //number= sc.nextInt();
         switch(month_no){
             case 1:
                 System.out.println("Here is:"+"January"+" " +year +" "+"has 30th days");
                 break;
             case 2:
                 System.out.println("Here is:"+"February"+" " +year + " " +"has 28 or 29th days");
                 break;
             case 3:
                 System.out.println("Here is:"+"March"+" " +year + " "+"has 30 days");
                 break;
             case 4:
                 System.out.println("Here is:"+"April"+" " +year +" "+"has 31 days");
                 break;
             case 5:
                 System.out.println("Here is:"+"May"+" " +year + " "+"has 30 days");
                 break;
             case 6:
                 System.out.println("Here is:"+"June"+" " +year + " "+"has 31 days");
                 break;
             case 7:
                 System.out.println("Here is:"+"July"+" " +year +"has 30 days");
                 break;
             case 8:
                 System.out.println("Here is:"+"August"+" " +year +"has 31 days");
                 break;
             case 9:
                 System.out.println("Here is:"+"September"+" " +year +"has 30 days");
                 break;
             case 10:
                 System.out.println("Here is:"+"October " +" "+ year+"has 31 days");
                 break;
             case 11:
                 System.out.println("Here is:"+"November"+" " +year +"has 30 days");
                 break;
             case 12:
                 System.out.println("Here is:"+"December"+" " +year +"has 31 days");
                 break;
             default:
                 System.out.println("You inter invalid choice");

         }

     }
}
