package Inheritance;

 class Payment_Mode {
    double amount=20.50;
    void payAmount(){
        System.out.println(" payment successful");
    }
}
class Cash extends Payment_Mode {
    void payBill() {
        System.out.println("Payment done by cash");
    }
}
class Online_Mode{
     public static void main(String[]args){
         Cash c1=new Cash();

         c1.payAmount();
         c1.payBill();

     }
}