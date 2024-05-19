package AssignmentNo2;

import java.util.Scanner;

public class Question15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int table_no;
        System.out.println("Write the  Table number which you want to display:");
        table_no= sc.nextInt();
        for(int i=0;i<=table_no;i++){
            int table =i*table_no;
            System.out.println(table);
        }
    }
}
