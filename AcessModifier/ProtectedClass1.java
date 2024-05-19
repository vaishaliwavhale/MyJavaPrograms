package AcessModifier;



public class ProtectedClass1 {
   protected void run(){

   }
}
class Demo1 {
   // ProtectedClass1 p2=new ProtectedClass1();
    //p2.run();
}
class Test1 extends ProtectedClass1{
     void check(){
         ProtectedClass1 p1 = new ProtectedClass1();
         p1.run();
     }
    public static void main(String[]args){

        Demo1 d1=new Demo1();
        //d1.run();
    }

}