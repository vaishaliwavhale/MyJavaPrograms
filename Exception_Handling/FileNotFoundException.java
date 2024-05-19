package Exception_Handling;


//import java.util.Scanner;
import javax.sound.sampled.Line;
import java.util.Scanner;
import java.io.*;

public class FileNotFoundException {
    void show(){
    }

    public static void main(String[]args){
        File f1=new File("Line.text");
        System.out.println(f1.exists());
        //Scanner sc=new Scanner(new File("mraks.sub"));
        Scanner sc=new Scanner("Line.text");

    }
}
