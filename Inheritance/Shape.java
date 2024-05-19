package Inheritance;
 class Shape {
   String name="circle";
   void showShape(){
       System.out.println("The shape drawn");
   }
}
class Circle extends Shape{
     void drawShape(){
         System.out.println("The circle is drawn");
     }
}
class Triangle{
     public static void main(String[]args){
         Circle c1=new Circle();
         c1.drawShape();
         c1.showShape();
    }
}