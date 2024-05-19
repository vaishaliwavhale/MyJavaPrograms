package Java8;

interface Student {
     void study();

}
interface Employee{
    void study();
    /*default void study(){
        System.out.println("Employee learn here");
    }*/
}
class DiamondProb implements Student,Employee {
   @Override
    public void study() {
        System.out.println("student learn here");
        //Student.super.study();
    }


   /* @Override
    public void study () {
        Student.super.study();
        Employee.super.study();
    }*/
    public static void main(String[] args){
            DiamondProb v1 = new DiamondProb();
            v1.study();

        }
    }

