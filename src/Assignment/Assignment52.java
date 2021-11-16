package Assignment;

public class Assignment52 {
    int roll_no;
    String name;
    long contact;
    int mark;

    public void show(int roll_no, String name, long contact, int mark) {
        this.roll_no = roll_no;
        this.name = name;
        this.contact = contact;
        this.mark = mark;

    }
    public void display(){
        System.out.println("Roll No "+roll_no+" Name "+name+" Contact "+contact+" Mark "+mark);

    }
}
