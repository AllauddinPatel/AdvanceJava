package collection;

public class CountZeoOne {

    public static void main(String[] args) {
        int i[]={0,0,1,0,1,1,1,1,0};
        int countzero = 0;
        int countone = 0;

        for (int j = 0; j < i.length; j++) {
          if (i[j]==0){
              countzero++;{

              }

          }
          else {
              countone++;
          }

        }
        System.out.println("Zero"+countzero);
        System.out.println("One "+countone);

    }
}