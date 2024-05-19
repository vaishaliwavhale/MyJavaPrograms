package Inheritance;

 class Employee {
    double salary = 40000.12;
    int experience = 2;
    String name = "vaishali";

    void CalSalary() {
        System.out.println("Basic salary of Employee is:-15000");
    }

    void showDetails() {
        System.out.println("\nName of Employee:-" + "Vaishali" + "\nSalary of Employee:-" + "400000.12");
    }
}
     class Admin extends Employee {
         Void calSalary1() {
             System.out.println("Basic salary of Employee is:-15000");
             return null;
         }
     }
     class Demo2{
         public static void main(String[]args){
             Admin a1=new Admin();
             a1.calSalary1();
             a1.showDetails();
         }
     }



