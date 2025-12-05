package Bank;

public class SavingsAccount extends Account {

    private double accountInterestRate1 = 0.02;

    public SavingsAccount(String accountNumber, double balance, String idNumber, String name) {
        super(accountNumber, balance, idNumber, name);
    }

    @Override
    public void interestRate() {

        double interestMoney = getBalance() * accountInterestRate1;

        System.out.println("Account Balance: " + getBalance());

        System.out.println("Interest will earn monthly: " + interestMoney);

    }
}
