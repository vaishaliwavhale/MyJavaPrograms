package Inheritance;

 class Vehical {
    int warranty=1;     // instance variable
    double price=22332.1;
    double speed=22.1;
    void showDetails(){
        System.out.println("Vehical shows details");
    }
}
class Bike extends Vehical{
    void showDetails(){  // there is no need to declare variables which is already  exits in super class
        int capacity=2;   // local variable
        System.out.println("Vehical shows details warranty of bike:-"+ warranty+"\nCapacity of person:-"+capacity+"\nPrice of bike is:-"+price+"\nSpeed of bike is:-"+speed);
    }

        }
         class Demo1{
     public static void main(String[]args){
         Bike b1=new Bike();
         b1.showDetails();
     }
         }