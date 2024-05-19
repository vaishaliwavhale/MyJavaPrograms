package AcessModifier;


public class OverridingRuleNo82{
//    @Override
//    public  void methodPublic(){
//        System.out.println("This is public method");
//    }
//    @Override
//    protected void methodProtected(){
//        System.out.println("This is protected method");
//    }
//    @Override
//    void methodDefault(){
//        System.out.println("This is Default method");
//    }
//   @Override
//    private  void methodPrivate() {
//
//        System.out.println("This is  parents  private method");
//    }


}





    class test    extends OverridingRuleNo82 {

    public  void methodPublic(){
        System.out.println("This is public method");
    }

    protected void methodProtected(){
        System.out.println("This is protected method");
    }

    void methodDefault(){
        System.out.println("This is Default method");
    }

    private  void methodPrivate() {

        System.out.println("This is private method");
    }

    public static void main (String[]args){

    }
}
