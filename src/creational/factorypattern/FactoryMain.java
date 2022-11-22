package creational.factorypattern;

import creational.factorypattern.accounts.BankAccount;
import creational.factorypattern.accounts.SavingAccount;

public class FactoryMain {


    public static void main(String[] args) {
//        Without Using the Factory Pattern
//        Here the code is tightly coupled
        BankAccount bankAccount = new SavingAccount();
        bankAccount.getAccountNumber();

//        With Factory Pattern
        AccountsFactory accountsFactory = new AccountsFactory();
        BankAccount bankAccountByFactory = accountsFactory.getInstance(args[0]);
    }

}
