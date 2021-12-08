package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //how hashmap work internally
        //why key is unique==because it use hashset.

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Pune");//put use to add value
        map.put(2,"Mumbai");
        map.put(2,"Mumbai");
        map.put(3,"Pune");


        Map<String,String> map1 = new HashMap<>();
        map1.put("Shivajinagar","Pune");//put use to add value
        map1.put("Navi mumbai","Mumbai");
        map1.put("Ghatkopar","Mumbai");
        map1.put("Kothrud","Pune");
        map1.put("Kothrud","Codekul");
//

//        //output by for each loop
//        map.forEach((k,v)->{
//            System.out.println("Key ="+k+" Value=>"+v);
//        });
//

        //Enhance For loop
        for (Map.Entry<String,String> m: map1.entrySet()){
            System.out.println("Key=> "+m.getKey()+" Value=>"+m.getValue());
        }

        System.out.println(map1.hashCode());
    }
}
//It does not take duplicate key
//most use part of collection