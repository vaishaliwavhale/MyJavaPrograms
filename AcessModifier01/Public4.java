package AcessModifier01;

public class Public4 {
    public void show(){
        System.out.println("This is superclass method");
    }
}
 class Public5 extends Public4{
     public void show(){
         System.out.println("This is superclass method");
     }
}
class  Public6{   // Non subclass
    public void show(){
        System.out.println("This is superclass method");
    }
}
