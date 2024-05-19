package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        //Creating empty hashMap
        Map<String, Integer> map=new HashMap<>();
        map.put("vaishali",1);
        map.put("sonali",2);
        map.put("Teju",3);
        // put method internally run like as:
        //insertion-> hashMap() method call-> we get hash code->we put this index  and table length in  index for method-> indexfor() method->
        // put for null-> if key is not null

        for(Map.Entry<String, Integer> e :map.entrySet()){
            System.out.println("list is here:-"+map);
        }
    }
}
