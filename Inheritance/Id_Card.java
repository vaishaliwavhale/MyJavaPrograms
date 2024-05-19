package Inheritance;

 class Id_Card {
     String name="Vaishali";
      double mob_no=16613665;
      String blood_group="AB+";
      void showDetails(){
          System.out.println("The name of person:-"+name+"\nMobile no of person:-"+mob_no+"\n Blood group of person:-"+blood_group);
      }
}
class Student_Id extends Id_Card{

}
class Employee_Id{
     public static void main(String[]args){
         Student_Id s1=new Student_Id();
         s1.showDetails();
     }
}