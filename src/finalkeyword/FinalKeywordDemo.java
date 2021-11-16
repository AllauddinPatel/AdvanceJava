package finalkeyword;

public final class FinalKeywordDemo {
    final int  i ;//constant

    public FinalKeywordDemo(){
        i=10;
    }

    public void display(){

    }

    public static void main(String[] args) {
        FinalKeywordDemo obj = new FinalKeywordDemo();
        obj.display();
        System.out.println(obj.i);
    }
}

//class Test extends FinalKeywordDemo{}
