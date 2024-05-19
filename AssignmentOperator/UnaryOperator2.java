package AssignmentOperator;
class UnaryOperator2 {
    public static void main(String[] args) {
        int a = 10;
        //We using post increment operator so first same value assign to a and then it will get increase to the next veriable
        int b = a++;
        System.out.println("The value of b is :"+b);
    }
}