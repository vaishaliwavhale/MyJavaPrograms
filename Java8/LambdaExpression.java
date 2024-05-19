package Java8;
@FunctionalInterface
 interface ABC{
     void show();
    /* static void show1(){
         System.out.println("this is static method");
     }*/
 }
 public class LambdaExpression {
     /*  @Override
       public void show(){
           System.out.println("this is the  abstract method  in class");
       }*/
     public static void main(String[] args) {
         ABC l1 = () -> {
             System.out.println("this is lambda expression");

         };
         l1.show();
     }
 }