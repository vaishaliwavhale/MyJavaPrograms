package AssignmentNo2;

import java.util.Scanner;

public class Question16 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of terms:");
        int terms= sc.nextInt();
        int sum=0;
        for(int i=0;i<=terms;i++){
            if(i%2!=0){
                System.out.println("The odd numbers are:"+i);
                //sum=sum+i;
                //System.out.println("The sum of all the odd number is:"+sum);
            }sum=sum+i;
        } System.out.println("The sum of all the odd number is:"+sum);
    }
}
