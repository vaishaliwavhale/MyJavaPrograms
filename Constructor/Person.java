package Constructor;

 class Person {
     public Person(){
         System.out.println("This is default constructor");
     }
}
class Student extends Person{
     public Student (){
         System.out.println("This is default constructor of Student class");
     }
}
class Employee1 extends Student {
     public Employee1 (){
         System.out.println("This is default constructor of Employee class");
     }
        }
 class Demo2{
     public static void main(String[]args){
         Employee1 e1=new Employee1();
     }
 }