package AssignmentNo2;

import java.util.Scanner;

public class Question14 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int i, num;
        System.out.println("Write the  range of number");
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            int cube = i * i * i;
            System.out.println("Number is " + i + "and the cube of"+" " + i + "is"+" " + cube);
        }
    }
}
