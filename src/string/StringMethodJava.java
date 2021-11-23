package string;

public class StringMethodJava {
    public static void main(String[] args) {
        String str = new String("Pune");//2 obj
        String str1 = "Pune";//0
        String str2="pune";//1
        String str3 = new String("    Pune   ");//1
        String str4 = new String("Pune");//1
        String str5 = new String("Allauddin");//2


        System.out.println("charAt for checking char  "+str.charAt(1));

        System.out.println();
        System.out.println("codepointAt Return the UniCode  "+str.codePointAt(0));
        System.out.println("codepointBefore Return the UniCode "+str.codePointBefore(1));

        System.out.println();
        System.out.println("Compare String "+str.compareTo(str5));//Return 0 because strings are equal
        System.out.println("Compares two strings  ignoring case differences "+str.compareToIgnoreCase(str2));

        System.out.println();
        System.out.println("Equal "+str.equals(str2));
        System.out.println("Equal Ignore Case "+str.equalsIgnoreCase(str2));

        System.out.println();
        System.out.println("Concat joining two String "+str3.concat(str4));

        System.out.println();
        System.out.println("Trim method remove the WhiteSpace "+str3.trim());
        System.out.println("Trim.length get Exact length of String "+str3.trim().length());//for particular String

        System.out.println();
        System.out.println("Hashcode "+str.hashCode());
        System.out.println("isEmpty "+str.isEmpty());

        System.out.println();
        System.out.println("to  == " +str==str1);

    }
}
