package ArrayBasics;

 class Array2 {
     public static void main(String[] args) {
         //Array initialize
         int arr[] = {10, 20, 30, 4, 0, 50};
         int index;
         int len = arr.length;
         int find_no = 0;
         //Find the  given no from array
         for (index = 0; index < len; index++) {
             if (arr[index] == find_no) {
                 System.out.println("The find no is present in the array");
             } else {
                 System.out.println("The find no is not present in the array");
             }
         }
     }
 }
