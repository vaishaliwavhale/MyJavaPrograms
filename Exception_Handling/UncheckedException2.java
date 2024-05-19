package Exception_Handling;

public class UncheckedException2 {
    public static void main(String[] args) {
        try {
            int a = 100, b = 1, c;
            c = a / b;
            int[] arr = new int[7];
            arr[10] = 10;
        } catch (ArithmeticException a) {
            System.out.println("We can not divided by zero");
            //a.getStackTrace();
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Array index is out of limit");
        } catch (Exception e) {
            System.out.println("It handle both exception");
        }
    }
}
