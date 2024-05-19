package Exception_Handling;

import java.io.File;
import java.io.IOException;

//***********************************************************File not found Exception8*******************************************************************
public class CheckedException2 {
    public static void main(String[]args) {
       // File f1=new File("Test1.txt");
        //f1.createNewFile();
        try {
            //File f1=new File("Test1.txt");
            File f1=new File("Test7.txt");
            f1.createNewFile();

            System.out.println("Block execute");


//            if (f1.createNewFile()) {
//                System.out.println("The file is not exist before this ,it will get create here");
//            }

        }
        catch(IOException fnf){
           System.out.println("The catch block get execute");
           //throw IOException;
        }
System.out.println("The file is already exist so this line get print");
    }
}
