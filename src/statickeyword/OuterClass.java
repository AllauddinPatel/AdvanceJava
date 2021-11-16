package statickeyword;

public class OuterClass {
    int i = 80;

    //STATIC CLASS
    static private class InnerClass{
        int i=10;

        public static void main(String[] args) {
            InnerClass obj = new InnerClass();
            System.out.println(obj.i);
        }
    }

    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        System.out.println(obj.i);


        //for calling inner class parameter
        OuterClass.InnerClass obj1 = new OuterClass.InnerClass();
        System.out.println(obj1.i);

        //for calling static method in other class
        StaticKeywordDemo.display();

    }
}
