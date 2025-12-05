public class NoticeAccount extends Account {

    private double accountInterestRate = 0.063;

    public NoticeAccount(String accountNumber, double balance, String idNumber, String name) {
        super(accountNumber, balance, idNumber, name);
    }

    @Override
    public void interestRate(double interestMoney) {

    interestMoney = getBalance() * accountInterestRate;

    setBalance(getBalance() + interestMoney);

    System.out.println("Interest Added: " + interestMoney);

    }
}
