package flowControl;

 class NestedIf {
     public static void main(String[]args) {
         int num = 9;
         if (num % 1 == 0) {
             if (num % 3 == 0) {
                 System.out.println("The number is divisible by 3");
             }
         else{
             System.out.println("The number is  not divisible by 3");
         }
     }
     }}