package CatingTypes;

public class DownCasting {
    void run(){
        System.out.println("This is parent class method");
    }
}
class DownCasting1 extends DownCasting{
    public static void main(String[]args){
        DownCasting1 d= (DownCasting1) new DownCasting();    //
        d.run();                                            //Down casting does not support by java
                                                            // it will compile but at run time it wil shows exception

    }
}
