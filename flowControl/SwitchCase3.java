package flowControl;

public class SwitchCase3 {
    public static void main(String[]args){
        int departmnet=1;
        switch (departmnet){
            case 1:
                System.out.println("Mechanical ");
                break;
            case 2:
                System.out.println("Computer");
                break;
            case 3:
                System.out.println("Electrical");
                break;
            case 4:
                System.out.println("Chemical");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
