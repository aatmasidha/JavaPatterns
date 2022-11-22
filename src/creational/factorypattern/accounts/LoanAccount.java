package creational.factorypattern.accounts;

public class LoanAccount  implements BankAccount{
    @Override
    public void getAccountNumber() {
        System.out.println("LoanAccount::getAccountNumber");
    }
}
