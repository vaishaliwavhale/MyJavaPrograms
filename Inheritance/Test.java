package Inheritance;

 class Test {
    String components="Tube";
    void showResult(){
        System.out.println("The  test shows ... result");
    }
}
class Blood_Test extends Test{

}
class Circuit_Test{
     public static void main(String[]args){
         Blood_Test b1=new Blood_Test();
         b1.showResult();
     }
}