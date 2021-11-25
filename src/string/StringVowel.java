package string;

import java.util.Locale;

public class StringVowel {
    public static void main(String[] args) {
        String str = "This is Codekul Classes";
        str.toLowerCase(Locale.ROOT);
        int count = 0;
        int e = 0;
        int j = 0;
        int o = 0;
        int u = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
            if (str.charAt(i) == 'e') {
                e++;
            }
            if (str.charAt(i) == 'i') {
                j++;
            }
            if (str.charAt(i) == 'o') {
                o++;
            }
            if (str.charAt(i) == 'u') {
                u++;
            }


        }
        System.out.println("Total Number of A are " + count);
        System.out.println("Total Number of E are " +e);
        System.out.println("Total Number of I are " +j);
        System.out.println("Total Number of O are " +o);
        System.out.println("Total Number of U are " +u);
        System.out.println("Total Number of vowels are " +(count+e+j+o+u));
    }
}
