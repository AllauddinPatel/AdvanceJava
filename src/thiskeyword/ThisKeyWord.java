package thiskeyword;

public class ThisKeyWord {
    int age;
    String name;
    String city;

    public void show(int age , String name , String city){
        this.age=age;
        this.name=name;
        this.city=city;
        System.out.println(+age+name+city);

    }

}

class B extends ThisKeyWord{
    public static void main(String[] args) {
        B obj = new B();
        obj.show(12,"Allu","Pune");
    }
}