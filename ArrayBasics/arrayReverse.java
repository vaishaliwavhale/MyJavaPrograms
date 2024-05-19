package ArrayBasics;

 class arrayReverse {
     public static void main(String[] args) {
         //Give an array , store it in temp array in reverse way , and the print it in again .

         int arr[] = {10, 9, 8, 7, 6, 5, 4};
         int len = arr.length;
         int [] revArr =new int[len];
         int index=0;
         //int tempArray[] = new int[len];

         for (int i = len - 1; i >= 0; i--) {
             revArr[i] = arr[i];

             System.out.println("Here is the reverse array" +revArr[i]);
         }
     }
 }