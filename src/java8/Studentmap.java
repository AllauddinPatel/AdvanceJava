package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Studentmap {
    String name;
    int marks;

    public Studentmap(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Studentmap studentmap = new Studentmap("Allu",34);
        Studentmap studentmap1=new Studentmap("mayur",54);
        Studentmap studentmap2=new Studentmap("dhaval",34);
        Studentmap studentmap3=new Studentmap("pankaj",67);


        List<Studentmap>list=new ArrayList<>();
        list.add(studentmap);
        list.add(studentmap1);
        list.add(studentmap2);
        list.add(studentmap3);



        list.stream().filter(p->p.marks==34).map(pm->pm.marks+1).forEach(System.out::println);

        list.forEach(s->{
            System.out.println(s.name+" "+s.marks);
        });



//        Function<Integer,Integer>function=new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                if()
//                return null;
//            }
//        };
//
//
//        Integer i=34;
//        Predicate<Integer> predicate = p->p==34;
//       System.out.println(predicate.test(list.size());
//
//
//        Stream<Studentmap> stream=list.stream().filter(studentmap4 -> predicate.test(list.size()));
//        stream.forEach(System.out::println);
    }

}
