package controlflowstatement;

public class whileloop {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }


        System.out.println();
        //Do While
        do{
            System.out.println(i);
            i++;
        }while (i<=10);

        //infinite Loop
        while (true){
            System.out.println(i);
        }
    }
}
