package Exception_Handling;
//import java.io.CheckedException11;

//***************************************class not found exception********************************************
public class CheckedException {
    public static void main(String[] args) {
        try {

            Class c1=Class.forName("CheckedException1");
            CheckedException1 c=(CheckedException1)c1.newInstance();
            c.test();
            //c1.test();
        }
        catch(Exception e) {
            System.out.println("Program execute");

        }
        System.out.println("Class not found exception will occur");

    }

}
