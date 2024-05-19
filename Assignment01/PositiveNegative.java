package Assignment01;

import java.util.Scanner;

class PositiveNegative {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Write the number here:");
        int num= sc.nextInt();
        if(num>0){
            System.out.println("The given number is positive number");
        }else{
            System.out.println("The given number is Negative number");

        }
    }
}
