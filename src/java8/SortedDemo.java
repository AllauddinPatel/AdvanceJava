package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 3235, 56, 87, 66, 52434, 870, 87, 6562, 13);


        System.out.println("Sorted Array");
        list.stream()
                .sorted()
                .forEach(System.out::println);


        System.out.println("Reverse Order");
        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
