package creational.factorypattern.accounts;

public class OverDraftAccount implements BankAccount{
    @Override
    public void getAccountNumber() {
        System.out.println("OverDraftAccount::getAccountNumber");
    }
}
