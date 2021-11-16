package encapsulation;

public class Encapsulation1 {
    private int id;
    private String name;
    private String address;


    public void setId(int id){
        if (id>0) {
            this.id = id;
        }else {
            System.out.println("Enter Id value above 0");
        }
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name =name;
    }
    public  String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }

    public static void main(String[] args) {
        Encapsulation1 objt = new Encapsulation1();
        objt.setId(2);
        objt.setName("Anil");
        objt.setAddress("Thane");

        System.out.println(objt.getId()+" "+objt.getName()+" "+objt.getAddress());
    }

}
