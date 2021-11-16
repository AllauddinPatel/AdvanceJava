package operator;

public class OperatorsDemo {

    public static void main(String[] args) {
        int i = 10;
        int k = 10;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);

        System.out.println(i--);
        System.out.println(i);

        int j = 3;
        System.out.println(i / j);
        System.out.println(i % j);

        //shift Oprator
        System.out.println(k << 2);
        System.out.println(k >> 2);

        //Logical Operator
        System.out.println(k & j);
        System.out.println(k | j);

        if (k == 10 && j == 4) {
            System.out.println("Pass");
        } else{ System.out.println("fail");
    }

    }
}
