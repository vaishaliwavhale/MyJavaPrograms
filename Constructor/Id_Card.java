package Constructor;

 class Id_Card {
     public Id_Card(){
         System.out.println("This is default constructor");
     }
}
class Employee_Id extends Id_Card{
     public Employee_Id(){
     System.out.println("This is default constructor of Employee_Id class");
     }
}
class Student_Id extends Employee_Id{
     public Student_Id(){
         System.out.println("This is default constructor of Student_Id class");
     }
     public Student_Id(String name,int roll_no){
         System.out.println("This is  parameterised constructor of Student_Id class "+"\nStudent name is:"+name+"\nRoll no is:"+roll_no);
     }
}
class Demo1{
     public static void main(String[]args){
         Student_Id sd=new Student_Id("vaishali",1);

     }
}