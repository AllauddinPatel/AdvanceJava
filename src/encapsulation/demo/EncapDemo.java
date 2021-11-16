package encapsulation.demo;

public class EncapDemo {
    private int age ;
    private String job;
    private String home;

    public void setAge(int age){
        this.age=age;
    }

    public void setJob(String job){
        this.job=job;
    }

    public void setHome(String home){
        this.home=home;
    }

    public int getAge(){
        return age;
    }
    public String getJob(){
        return job;
    }
    public String getHome(){
        return home;
    }


    public static void main(String[] args) {
        EncapDemo obj = new EncapDemo();
        obj.setAge(21);
        obj.setJob("IT");
        obj.setHome("Pune");

        System.out.println("Age= " +obj.getAge()+" Job= " +obj.getJob()+" Home= "+obj.getHome());
    }




}
