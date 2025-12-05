package Bank;

public class NoticeAccount extends Account {

    private double accountInterestRate = 0.063;

    public NoticeAccount(String accountNumber, double balance, String idNumber, String name) {
        super(accountNumber, balance, idNumber, name);
    }

    @Override
    public void interestRate() {

    double interestMoney = getBalance() * accountInterestRate;

    System.out.println("Account Balance: " + getBalance());

    System.out.println("Interest will earn monthly: " + interestMoney);

    }
}
