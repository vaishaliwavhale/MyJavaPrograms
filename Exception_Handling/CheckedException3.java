package Exception_Handling;

public class CheckedException3 {
    public static void main(String[]args) {
        try{
        int a=100,c,b=0;
        c=a/b;
        }catch(ArithmeticException a){
            System.out.println("We can not divided by zero");
            //a.getStackTrace();
        }

        catch(Exception e){
            System.out.println("We can not divide by 0" );
        }

    }
}
