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

    public void deposit(double amount){

    if (amount > 0) {
        setBalance(balance += amount);

        System.out.println('\n' + "***New Balance: " + getBalance() + "***");

        System.out.println('\n' + "Money deposited successful!");

    }else{

        System.out.println("Invalid Amount. Enter correct amount!!!");

    }

    }

    public void withdraw(double amount){

     if(amount <= getBalance()){

     setBalance(balance -= amount);

         System.out.println('\n' + "***New balance: " + getBalance() + "***");

         System.out.println('\n' + "Money deposited successful!");

     } else{

         System.out.println("Insufficient amount");

     }

    }

    public abstract void interestRate(double interestMoney);




}
