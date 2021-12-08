package collection;

import java.util.*;

public class Employee implements Comparable<Employee>{

    int id;
    String name;
    long salary;

    public Employee(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
            Employee obj=new Employee(3,"Allu",9898L);
            Employee obj1=new Employee(4,"Dhaval",9898L);
            Employee obj2=new Employee(2,"Mayur",9898L);
            Employee obj3=new Employee(1,"Pankaj",9898L);

        List<Employee> list=new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        Collections.sort(list);
//
//        for (int i=0 ;i<list.size();i++){
//            System.out.println(list.get(i).id+" "+list.get(i).name+" "+list.get(i).salary);
//        }

        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.salary);
        });

    }
//for integer Value
    @Override
    public int compareTo(Employee o) {
        if (this.id==o.id){
            return 0;
        }else if (this.id>o.id){
            return 1;
        }else
            return -1;
    }


//    //for String Compare
//    @Override
//    public int compareTo(Employee o) {
//        return this.name.compareTo(o.name);
//    }
}
