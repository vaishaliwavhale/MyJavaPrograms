package Inheritance;
 class Construction {
     int No_employee=20;
     double material_price=2;
     int  material_quantity=10;
     void showDetails(){
         System.out.println("Construction Details:-"+"\nNumber of Employee Required:-"+No_employee+"Material price is:-"+material_price);
     }
}
class Home_Construction extends Construction{

}
class Road_Construction{
      public static void main(String[]args){
           Home_Construction h1=new Home_Construction();
           h1.showDetails();
      }
}