package collection;

import java.util.ArrayList;
import java.util.List;

public class Arraymulti {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(7);
        list1.add(8);
        int j=list1.size()-1;

        for (int i=0;i<=list.size()-1;i++){

            System.out.println(list.get(i)*list1.get(j));
            j--;
            }
        }


    }

