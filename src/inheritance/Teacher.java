package inheritance;

public class Teacher {

    int id ;
    String name;
    String address;
}

class MathTeacher extends Teacher {
    public void  show(){
        System.out.println("In Math Teacher Class");
    }

    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.id = 1;
        mathTeacher.name= "Sachin";
        mathTeacher.address="Nagpur";

        mathTeacher.show();

        System.out.println(" Id= " +mathTeacher.id  + " Name= " +mathTeacher.name +  " Address= "+ mathTeacher.address ) ;
    }
}

class ChemesrtyTeacher extends Teacher{
    public static void main(String[] args) {
        ChemesrtyTeacher obj = new ChemesrtyTeacher();
        obj.id= 2;
        obj.name="Rahul";
        obj.address="Pune";

        System.out.println(" Id= "+obj.id + " Name= "+obj.name + " Address= "+obj.address);
    }
}