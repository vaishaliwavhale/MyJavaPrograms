package AssignmentNo2;

import java.util.Scanner;

public class Question11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int terms;
        int sum=0;
        System.out.println("Write the number of terms");
        terms=sc.nextInt();
        for(int i=1;i<=terms;i++){
           sum=sum+i;

        } System.out.println("here is the sum of all the no:"+sum);
    }
}
