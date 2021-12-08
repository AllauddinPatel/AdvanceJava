package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapArray {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Pune");
        map.put(2, "Mumbai");
        map.put(3, "Pune");

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Nagpur");
        map1.put(2, "Mumbai");
        map1.put(3, "Nagar");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Satara");
        map2.put(2, "Goa");
        map2.put(3, "Pune");

        List<Map<Integer, String>> list = new ArrayList<>();
        list.add(map);
        list.add(map1);
        list.add(map2);

        //for each loop
        list.forEach(s -> {
            s.forEach((k, v) -> {
                System.out.println("Key =" + k + " Value=>" + v);
            });
        });


//        //Enhance Loop
//        for (int i=0;i< list.size();i++){
//            for (Map.Entry<Integer,String> m: list.get(i).entrySet()){
//                System.out.println("Key=> "+m.getKey()+" Value=>"+m.getValue());
//            }
//        }
    }
}
