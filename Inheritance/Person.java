package Inheritance;

class Person {
    double hight = 5.1;
    double weight = 40.15;
    String name = "vaishali";
    void showDetails(){
        System.out.println("Show Details:-"+"\nName of person:-"+name+
                "\nHight of person:-"+hight+"\nWeight of person:-"+weight);
    }

}
class Student extends Person{
    int roll_no=01;
    //+"Student Roll Number:-"+roll_no
    void doStudy(){
        System.out.println("Student  do study");
    }

}
class Demo{
    public static void main(String[]args){
        Student s1=new Student();
        s1.showDetails();
        s1.doStudy();

    }
}