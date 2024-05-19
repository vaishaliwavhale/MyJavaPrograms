package AssignmentNo2;

import java.util.Scanner;

class Question7 {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         //int month_no;
         int days=0;
         System.out.println("write here which month of days you want to knows:");
         days= sc.nextInt();
        if(days>30 && days<=31){
            System.out.println(" Following are the months of 31  month\nApril\n June\nAugust\nOctober\nDecember");
        }if(days>29 && days<=30) {
            System.out.println("Follwing are the months of 30 days :\n March\nMay\nJuly\nSeptember\nNovember");
        } if(days>27 && days<=29){
            System.out.println("The month is: February");
        }else{
            System.out.println("user enter  incorrect days.");
        }
}
}