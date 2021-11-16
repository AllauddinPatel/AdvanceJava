package statickeyword;

public class StaticKeywordDemo {
    int empId;
    String empName;
    static String empCompany = "ABC";

    //Static Method
    public static void display(){
        System.out.println("It is static methos");

    }

    public StaticKeywordDemo(int empId, String empName){
        this.empId=empId;
        this.empName=empName;

        System.out.println("ID= "+empId+ " Name= "+empName+" Company "+empCompany );
    }

    public static void main(String[] args) {
        StaticKeywordDemo obj = new StaticKeywordDemo(1,"Allu");
        StaticKeywordDemo obj1 = new StaticKeywordDemo(2,"Anil");
        StaticKeywordDemo obj2 = new StaticKeywordDemo(3,"Rahul");
        display();
    }
}
