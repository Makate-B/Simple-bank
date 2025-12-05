import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Account> accountDetails = new ArrayList<>();

        System.out.println("Welcome to bank");

        while (true) {

            System.out.println('\n' + "1. Create Notice Account" + '\n' + "2. Create a Saving Account" + '\n' + "3. Deposit" + '\n' + "4. Withdrawal" + '\n' + "5. Check Balance" + '\n' + "6. Exit");

            System.out.print('\n' + "Option: ");

            int option = input.nextInt();

            input.nextLine();

            switch (option) {

                case 1:

                    System.out.println('\n' + "----------NOTICE ACCOUNT----------" + '\n');

                    System.out.print("Enter full names: ");
                    String fullNames = input.nextLine();

                    System.out.print("Enter ID number: ");
                    String IDnumber = input.nextLine();

                    System.out.print("Create Account Number: ");
                    String accountNumber1 = input.nextLine();

                    System.out.println('\n' + "Account created Successful!");

                    System.out.println('\n' + "-----------------------------------");

                    accountDetails.add(new NoticeAccount(accountNumber1, 0, IDnumber, fullNames));

                    break;

                case 2:

                    System.out.println('\n' + "----------SAVINGS ACCOUNT----------" + '\n');

                    System.out.print("Enter full names: ");
                    String fullNames2 = input.nextLine();

                    System.out.print("Enter ID number: ");
                    String IDnumber2 = input.nextLine();

                    System.out.print("Create Account Number: ");
                    String accountNumber2 = input.nextLine();

                    System.out.println('\n' + "Account created Successful!");

                    System.out.println('\n' + "-----------------------------------");

                    accountDetails.add(new SavingsAccount(accountNumber2, 0, IDnumber2, fullNames2));

                    break;

                case 3:

                    System.out.println('\n' + "----------DEPOSIT----------" + '\n');

                    System.out.print("Enter account number:");
                    String enteredAccountNo = input.nextLine();

                    boolean found = false;

                 for (Account acc : accountDetails){

                 if (acc.getAccountNumber().equals(enteredAccountNo)){

                     System.out.print('\n' + "Enter the Amount: ");
                     double depAmount = input.nextDouble();

                     acc.deposit(depAmount);

                     System.out.println('\n' + "------------------------------");

                     found = true;

                     break;

                 }

                 }if (!found){

                    System.out.println("Incorrect account number. Please try again");

                }

                case 4:

                    System.out.println('\n' + "----------WITHDRAW----------" + '\n');

                    System.out.print("Enter Account number: " );
                    String enteredAccountNumber2 = input.nextLine();

                    boolean found2 = false;

                    for (Account acc2 : accountDetails){

                     if (acc2.getAccountNumber().equals(enteredAccountNumber2)){

                         System.out.print("Enter Amount: ");
                         double witAmount = input.nextDouble();

                         acc2.withdraw(witAmount);

                         found2 = true;

                         break;

                     }

                    }if (!found2){

                    System.out.println("No account found");


                }

                case 5:

                    System.out.println('\n' + "----------BALANCE----------" + '\n');

                    System.out.print("Enter Account number: ");
                    String enteredAccountNumber3 = input.nextLine();

                    boolean found3 = false;

                    for (Account acc3 : accountDetails){

                        if (acc3.getAccountNumber().equals(enteredAccountNumber3)) {

                            System.out.println("Balance: " + acc3.getBalance());

                            found3 = true;

                            break;


                        }

                    }

                    if(!found3){

                        System.out.println("wrong account number");

                    }

                case 6:

                    System.out.println("Existing...");

                    System.exit(0);



                    break;

                default:

                    System.out.println("Incorrect option");

            }

        }

    }

}
