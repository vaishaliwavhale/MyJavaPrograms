package Exception_Handling;

public class UncheckedException3 {
    public static void main(String[]args){
    //String name=null;
    //int a=name.length;
    try{
        String name=null;
        int a=name.length();
    System.out.println("length of given string:"+a);
    }
    catch (NullPointerException e1) {
        System.out.println("assign null  value to name");
    }catch (Exception e) {
        System.out.println("It handle both exception");
    }
}
}
