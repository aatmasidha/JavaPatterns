package creational.factorypattern;

import creational.factorypattern.accounts.BankAccount;
import creational.factorypattern.accounts.LoanAccount;
import creational.factorypattern.accounts.OverDraftAccount;
import creational.factorypattern.accounts.SavingAccount;

public class AccountsFactory {
    public BankAccount getInstance(String accountType){
            if(accountType.equalsIgnoreCase("Saving")){
                return new SavingAccount();
            } else if (accountType.equalsIgnoreCase("Loan")) {
                return new LoanAccount();
            }else {
                return new OverDraftAccount();
            }
    }
}
