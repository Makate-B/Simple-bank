package Bank;

import Exceptions.DepositFundsException;
import Exceptions.InsufficientFundsException;

public abstract class Account {

    private String name;
    private String accountNumber;
    private String idNumber;
    private double balance;

    public Account(String accountNumber, double balance, String idNumber, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.idNumber = idNumber;
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) throws DepositFundsException {

    if (amount < 0){

        throw new DepositFundsException("Incorrect Amount. Amount must positive!!!");

    }

    setBalance(balance += amount);

    System.out.println("Amount deposited Successful | New balance: " + getBalance()) ;

    }

    public void withdraw(double amount) throws InsufficientFundsException {

     if (amount > balance){

         throw new InsufficientFundsException(" Balance: " + getBalance());

     }

     if (amount < 0 ){

      throw new InsufficientFundsException("Amount must positive");

     }

     setBalance(balance -= amount);

     System.out.println("Amount Withdrew Successful: " + amount + " | New balance: " + getBalance()) ;

    }

    public abstract void interestRate(double interestMoney);

}
