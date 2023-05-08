//program for ATM interface
import java.util.Scanner;

class ATM{
    float balance=20000,withdraw,deposit,transfer,num; //consider balance=20000.
    int pin=3011; //consider pin
    String user_id="Komal"; //consider userid

    //method to check details of userid and pin
    public void CheckDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your pin");
        int atm_pin=sc.nextInt();
        System.out.println("Enter your user id");
        String id=sc.next();

        if(atm_pin==pin && id.equals(user_id)){
            menu();
        }else{
            System.out.println("Enter valid user id and pin");
        }
    }

    //method to operate actual functionalities of atm
    public void menu(){
        while(true){
            System.out.println("Enter your choice");
            System.out.println("1.Transaction History");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Transfer");
            System.out.println("5.Quit");
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            switch(num){
                case 1:
                    System.out.println("Previous Transaction History");
                    System.out.println("The last transaction is made on Date- DD/MM/YYYY at Time- HH/MM/SS by "+user_id);
                    System.out.println("Account Number- xxxxxxxxxx");
                    System.out.println("Your current balance is "+balance);
                    break;
                case 2:
                    System.out.println("Enter amount to be withdraw");
                    withdraw=sc.nextInt();
                    if(balance>=withdraw)
                    {
                        balance=balance-withdraw;
                        System.out.println("Balance amount is: "+balance);
                        System.out.println("Please collect money.");
                    }else{
                        System.out.println("You don't have enough money for withdraw.");
                    }
                    break;
                case 3:
                    System.out.println("Enter amount to deposit");
                    deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("Balance amount is: "+balance);
                    System.out.println("Money has been deposited successfully.");
                    break;
                case 4:
                    System.out.println("Enter amount to be transfer");
                    transfer=sc.nextInt();
                    balance=balance-transfer;
                    System.out.println("Balance amount is: "+balance);
                    System.out.println("Money has been transferred successfully.");
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }
}

public class ATM_Interface {
    public static void main(String [] args){
        ATM obj=new ATM();
        obj.CheckDetails();
    }
}