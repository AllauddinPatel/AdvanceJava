package Assignment;

import java.util.Scanner;

public class AccountManagement {
   String acc_no;
   String name;
   String acc_type;
   long bal;

    Scanner scanner=new Scanner(System.in);

   //1)method to insert data
    public void insert(){

        System.out.println("Enter Account Number");
        acc_no=scanner.next();
        System.out.println("Enter Account Name");
        name=scanner.next();
        System.out.println("Enter Account Type");
        acc_type=scanner.next();
        System.out.println("Enter Account Balance");
        bal=scanner.nextLong();
    }


    //2)Display Data
    public void display(){
        System.out.println("Name of Account holder "+name);
        System.out.println("Account Number "+acc_no);
        System.out.println("Account Type "+acc_type);
        System.out.println("Account Balance "+bal);
    }

    //3)Deposit Ammount
    public void deposit(){
        long amt;
        System.out.println("Enter the Amount To deposit");
        amt=scanner.nextLong();
        bal=bal+amt;
        System.out.println("Net Balance is "+bal);
    }

    //4)withdraw Amount
    public void withdraw(){
        long amt;
        System.out.println("Enter amount to withdraw");
        amt= scanner.nextLong();

        if (amt>bal){
            System.out.println("Insufficient Fund");
        }
        else {
            System.out.println("You have withdraw "+amt+ " Your net Balance "+(bal-amt));
        }
    }



    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);

        AccountManagement obj = new AccountManagement();
        obj.insert();
        System.out.println("********BANK ACCOUNT**********");
        System.out.println("1.Show detail\n2.Deposit Ammount\n3.Withdraw\n4.Balance Enquiry");
        System.out.println("Enter the Number");
        int i;
        i= scanner1.nextInt();
        switch (i){
            case 1:
                obj.display();
                break;

            case 2:
                obj.deposit();
                break;

            case 3:
                obj.withdraw();
                break;

            case 4:
                System.out.println(obj.bal);

            default:
                System.out.println("Enter valid amount");

        }


    }
}



