package Constructor;

class Employee {
    //There are two types of constructor.
    //1.Default Constructor    2. Parameter Constructor
    public  Employee(){
        System.out.println("Print default constructor");     // Constructor  first line is Super class default constructor called.

    }
    public Employee(String a){
        System.out.println("This is parameterised constructor"+a);
    }
}
class Admin extends Employee{
    public Admin(){
        System.out.println("This is Constructor of Admin class");
    }
}
class Demo {
    public static void main(String[] args) {
        Admin a1 = new Admin();
    }
}