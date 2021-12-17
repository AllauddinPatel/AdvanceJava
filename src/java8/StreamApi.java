package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Stream Api->
 *
 */

public class StreamApi {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Function<Integer,Integer> function= f->f*2;
        Stream<Integer> stream=list.stream().map(function);

        stream.forEach(System.out::println);




        List<String>list1=Arrays.asList("java","is","language");
        Function<String,String>function1=s->s.toUpperCase();
        list1.stream()
                .map(function1)
                .forEach(System.out::println);

    }
}
