package Java8;

import java.util.Arrays;
import java.util.List;

public class AvarageDouble {
    public static void main(String[] args) {
        List<Double>doubleNo= Arrays.asList(10.1,11.2,12.3,14.4,15.5,16.6,17.7);
        for(Double num: doubleNo){
            System.out.println(num);
        }
       // Double avrage=doubleNo.stream().mapToDouble().reduce()

    }
}
