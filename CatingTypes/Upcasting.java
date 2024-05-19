package CatingTypes;
//There are two types of casting:- 1.Widening casting :-lower to higher/implicitly/happens naturally
// 2.Narrow casting:-Higher to lower/Explicitly/Java doesn't support this type of casting/manually
public class Upcasting {
    void show(){
        System.out.println("This is parent class method");
    }
}
class Upcasting1 extends Upcasting {
    // @Override
//    void show(){
//        System.out.println("This is child  class method");
//    }



        public static void main(String[] args) {
            //Upcasting1 a= (Upcasting1) new Upcasting();
            Upcasting a = new Upcasting1();
            a.show();
        }

}