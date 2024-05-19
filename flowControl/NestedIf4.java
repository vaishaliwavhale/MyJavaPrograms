package flowControl;

 class NestedIf4 {
     public static void main(String[]args){
         int credit=2;
         if(credit>3){
             if(credit<15){
             System.out.println("The person is eligible for loan");
         }
     }else{
         System.out.println("The person is not eligible for loan");
     }
     }
}
