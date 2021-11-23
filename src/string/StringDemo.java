package string;

public class StringDemo {
    public static void main(String[] args) {

        String str = new String("Pune");//2 obj
        String str1 = "Pune";//0
        String str2="Pune";//0
        String str3 = new String("Pune");//1
        String str4 = new String("Pune");//1

        System.out.println(str==str1);//check reference address of string

        System.out.println(str.equals(str1));//check content of string

        System.out.println(str.equalsIgnoreCase(str1));//check content of string ignores upper and lower class
    }
}
