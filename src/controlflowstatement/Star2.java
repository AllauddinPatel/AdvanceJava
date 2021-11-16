package controlflowstatement;

public class Star2 {
    public static void main(String[] args) {
       for (int i = 1;i<=3;i++){
           for(int j=1;j<=3;j++){
               if(i==1||i==3||
                       j==1||j==3){
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
               System.out.println();
           }
      }








        for (int i = 1; i<=4; i++){
            for (int j= 1 ; j<=4 ; j++){
                if(j==2&&i==2||j==2&&i==3
                    ||j==3&&i==2||j==3&&i==3){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        System.out.println();
        for (int i = 1; i<=3; i++){
            for (int j= 1 ; j<=3 ; j++){
                if(j==1&&i==1||i==1&&j==3||i==3&&j==2){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        System.out.println();
        for (int i = 1; i<=3; i++){
            for (int j= 1 ; j<=3 ; j++){
                if(j==3&&i==1||i==2&&j==2||i==3&&j==3){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
