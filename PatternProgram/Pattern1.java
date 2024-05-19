package PatternProgram;

public class Pattern1 {
    public static void main(String[]args){
        int i,j;
        for(i=1;i<=5;i++){
            //Outer loop is equals to no of rows.
            for(j=1;j<=i;j++){
                //which elements you want to print
                System.out.print(" *");
            }
            //for new line
            System.out.println();
        }
    }
}
/*

*
* *
* * *
* * * *
* * * * *

 */
