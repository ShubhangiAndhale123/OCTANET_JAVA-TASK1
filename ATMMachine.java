
import java .util.*;

class ATM{

    float balance;
    int PIN = 5676;
    public void checkpin(){
         System.out.println("Enter your pin: ");
         Scanner sc = new Scanner(System.in);
         int enteredpin = sc.nextInt();
         if(enteredpin==PIN){
            menu();
         }
         else{
            System.out.println("Enter a valid pin");
            checkpin();
         }
    }

    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1.check A/C Balnce");
        System.out.println("2.Withdraw money");
        System.out.println("3.Deposite Money");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1){
            checkbalance();
        }
        else if(opt == 2){
            WithdrawMoney();
        }
        else if(opt == 3){
            depositMoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("enter a valid choice");
        }
    }

     public void checkbalance(){
        System.out.println("balance: " + balance);
        menu();
     }

     public void WithdrawMoney(){
        System.out.println("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > balance){
            System.out.println("insufficient balance");
        }
        else{
            balance = balance - amount;
            System.out.println("money withdraw successfuly");
        }
        menu();
     }

     public void depositMoney(){
        System.out.println("enter the amount");
        Scanner sc = new Scanner(System.in);
        float amount1 = sc.nextFloat();
        balance = balance + amount1;
        System.out.println("Money diposited succussfuly");
        menu();
     }
}
public class ATMMachine{
      public static void main(String[] args) {

         ATM obj = new ATM();
         obj.checkpin();

      }
}