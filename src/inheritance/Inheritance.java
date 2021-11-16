package inheritance;

public class Inheritance {
    int empId;
    String empName;

}

class codekul extends  Inheritance{
    int age;
    String city;

    public static void main(String[] args) {
        codekul obj = new codekul();
        obj.empId=1;
        obj.empName="Allu";
        System.out.println("ID=> "+obj.empId+" Name=> "+obj.empName);

    }
}

class Update extends codekul{
    public static void main(String[] args) {
        Update obj1 = new Update();
        obj1.age=21;
        obj1.city="Pune";
        System.out.println("ID=> "+obj1.empId+" Name=> "+obj1.empName +" Age=> "+obj1.age+" City=> "+obj1.city);
    }
}