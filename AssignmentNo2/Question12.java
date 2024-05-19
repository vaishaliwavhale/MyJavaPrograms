package AssignmentNo2;

import java.util.Scanner;

public class Question12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter no");
       int n = 5; //n= sc.nextInt();

        int sum=0;
         int average=0;
        for(int i=1;i<=n;i++){
            System.out.println("Write the  "+ i+" numbers here");
           int num= sc.nextInt();
            sum=sum+num;

        }
        System.out.println( "The sum of given number is"+sum);
        //sum=sum+i;
       average=sum/n;
        System.out.println("The average of given no is:"+average);
    }
}
