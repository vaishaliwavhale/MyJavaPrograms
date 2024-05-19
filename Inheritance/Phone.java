package Inheritance;

 class Phone {
    int warranty=1;
    double price=10000;
    String comp_name="RealMe";
    void showDetails(){
        System.out.println("Name of Comapny:-"+comp_name+"\nPrice of company"+price+"\nwarranty of phone:-"+warranty);
    }
}
class Android extends Phone{
     void dialNo(){
         System.out.println("Number dial ny using touch pad");
     }
}
class Telephone {
     public static void main(String[]args){
         Android a1=new Android();
         a1.showDetails();
         a1.dialNo();
    }
}
