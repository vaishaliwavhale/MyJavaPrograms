package AssignmentOperator;

 class UnaryOperator {
    public static void main(String[]args){
        //pre Increment operator
        int num=10;
        System.out.println("Output is :"+num++);        //  This is pre increment operator that's y first assign the original value
        System.out.println("Output is :"+ ++num);        // After that increment value  will get assign to new value but this is also
                                                           // pre increment value  that y this value will get assign to the
        System.out.println("Output is :"+ num);

    }
}
