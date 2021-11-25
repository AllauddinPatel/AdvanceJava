package string;

public class BufferStringDemo {
    public static void main(String[] args) {
        String str2=new String("Pune");
        str2.concat("City");
        System.out.println(str2);

        StringBuffer str = new StringBuffer("Pune");
        str.append("city");
        System.out.println(str);

        StringBuilder str1 = new StringBuilder("Pune");
        str1.append("City1");
        System.out.println(str1);

        StringBuilder str3 = new StringBuilder("Welcome");
        str3.reverse();
        System.out.println(str3);

        String str4 = "Welcome";
        for (int i=str4.length()-1;i>=0;i--){
            System.out.print(str4.charAt(i));
        }

        System.out.println();
        StringBuilder str5 = new StringBuilder("abbccdde");
        for (int i=0;i<str5.length();i++){
            for (int j=i+1;j<str5.length();j++){
                if (str5.charAt(i)==str5.charAt(j)){
                    str5.deleteCharAt(i);
                }
            }
        }
        System.out.println(str5);

    }
}
/*
* BufferString is mutable.
* */