package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StudentSet {
    int id;
    String name;
    String address;

    public StudentSet(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
/*
* If set are allowing the duplicate file the creation of hash code are then pass to set it will
* not allow the duplication
* */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentSet that = (StudentSet) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {
        StudentSet obj = new StudentSet(1,"rahul","Pune");
        StudentSet obj1 = new StudentSet(1,"rahul","Pune");
        StudentSet obj2 = new StudentSet(1,"rahul","Pune");


        Set<StudentSet> set=new HashSet<>();
        set.add(obj);
        set.add(obj1);
        set.add(obj2);

        set.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });
    }
}
