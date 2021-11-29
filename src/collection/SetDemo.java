package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    //Dosent maintain insertion value
    //dose not take duplicate value
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        Set<Integer>set1= new LinkedHashSet<>();//Linked hash set maintain insertion order
        set1.add(10);
        set1.add(20);

        set.containsAll(set1);
        System.out.println(set);
        System.out.println(set.containsAll(set1));




        Set<Integer> set2= new TreeSet<>();//TreeSet give output in Ascending Order
        set2.add(80);
        set2.add(110);
        set2.add(30);
        set2.add(10);

        System.out.println(set2);

    }
}
