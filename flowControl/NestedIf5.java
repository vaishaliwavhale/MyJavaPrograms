package flowControl;

 class NestedIf5 {
     public static void main(String[]args){
         int house_no=10;
         String house_colour="Blue";
         if(house_no%2==0){
             if(house_colour.equals ("Blue")){
                 System.out.println("House is eligible for construction");
             }
         }else{
             System.out.println("House is not eligible for construction");
         }
     }
}
