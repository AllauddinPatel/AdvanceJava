package java8;

import java.util.Locale;
import java.util.Optional;

public class OptionalDemo  {
    public static void main(String[] args) throws Exception {
        Employee obj = new Employee(1,"Allu",null);

        if (obj.getEmail()!=null){
            System.out.println(obj.getEmail().toLowerCase());
        }else {
            System.out.println("Email is Null");
        }

        Optional<Employee>optional=Optional.empty();//empty Optional

        Employee obj1 = new Employee(1,"Allu",null);
//        Optional<String>optional1 = Optional.of(obj1.Email);//return Exception when email is null
//        System.out.println(optional1);


//        Optional<String>optional2= Optional.ofNullable(obj.getEmail());//return Empty when optional is null
//        System.out.println(optional2);
//
//        Optional<String>optional3= Optional.ofNullable(obj.getEmail());
//        System.out.println(optional3.orElse("Optional is null"));
//
//        Optional<String>optional4= Optional.ofNullable(obj.getEmail());
//        System.out.println(optional4.orElseGet(()->{
//            return "Optional is null";
//        }));
//
//        Optional<String>optional5= Optional.ofNullable(obj.getEmail());
//        System.out.println(optional5.orElseThrow(()->{
//            return new Exception("Exception");
//        }));

        Optional<String>optional6= Optional.ofNullable(obj.getEmail());
        System.out.println(optional6.orElseThrow());







    }
}


class Employee{
    int id ;
    String name;
    String Email;

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        Email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}