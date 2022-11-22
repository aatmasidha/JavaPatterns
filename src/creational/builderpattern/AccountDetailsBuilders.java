package creational.builderpattern;

import java.util.Date;

public class AccountDetailsBuilders {
    private String accountHolderName;
    private String accountNumber;
    private Date openingDate;
    private String accountType;
    private float accountBalance;

    public AccountDetailsBuilders setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return  this;
    }

    public AccountDetailsBuilders setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public AccountDetailsBuilders setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
        return this;
    }

    public AccountDetailsBuilders setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    public AccountDetailsBuilders setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }

    public AccountDetails getAccountDetails(){
        return new AccountDetails(accountHolderName, accountNumber, openingDate,
                accountType, accountBalance);
    }
}
