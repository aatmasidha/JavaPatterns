package creational.factorypattern.accounts;

public class SavingAccount implements BankAccount{

    @Override
    public void getAccountNumber() {
        System.out.println("SavingAccount::getAccountNumber");
    }
}
