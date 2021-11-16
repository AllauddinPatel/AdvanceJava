package controlflowdemo;

public class fordemo {

    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;

        //Traditional for loop
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        //Simple for loop
        for (int i = 1; i<=10;i++){
            System.out.print(i);
        }

        //enhance for loop
        for (int i:arr) {
            System.out.println(i);
        }

        //Reverse Array
        for (int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
}
