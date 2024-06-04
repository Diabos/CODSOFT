package TASK3;
import  java.util.*;
class BankAccount{
    private double balance ;
    public  BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public boolean withdraw(double amount){
        if (amount >0 && amount <= balance){
            balance -= amount;
            return true;
        }
        return  false;
    }
    public void deposit(double amount){
        if(amount > 0 ){
            balance += amount;
        }
    }
    public double getBalance(){
        return balance;
    }
}
class ATM{
    private BankAccount account;
    public ATM(BankAccount account){
        this.account = account;
    }
    public void withdraw(double amount){
        if(account.withdraw(amount)){
            System.out.println("withdraw successful. your new balance is:"+ account.getBalance());
        }
        else {
            System.out.println("withdrawal failed. insufficient funds.");
        }
    }
    public void deposit(double amount){
        account.deposit(amount);
        System.out.println("Deposit successful. your new balance is: "+account.getBalance());
    }
    public void checkbalance(){
        System.out.println("your current balance is:"+ account.getBalance());
    }
}
public class Main {
    public static void main(String[] args){
        BankAccount account = new BankAccount(1000.0);
        ATM atm = new ATM(account);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Welcome to the ATM. Please select an option");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.check balance");
            System.out.println("4.Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter your amount to withdraw");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkbalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    sc.close();
                    return;
                default:
                    System.out.println("invalid choice. please try again");
            }
        }
    }
}
