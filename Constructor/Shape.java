package Constructor;

 class Shape {
        public Shape(){
            System.out.println("This is Default constructor of parent class");
        }
}
class Circle extends Shape{
    public Circle() {
        System.out.println("This is Default constructor of child class");
    }
}
class Demo4{
    public static void main(String[]args){
        Circle c1=new Circle();
    }
}

