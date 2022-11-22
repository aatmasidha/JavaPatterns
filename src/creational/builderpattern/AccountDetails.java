package creational.builderpattern;

import java.util.Date;

public class AccountDetails {
    private String accountHolderName;
    private String accountNumber;
    private Date openingDate;
    private String accountType;
    private float accountBalance;

    public AccountDetails(String accountHolderName, String accountNumber, Date openingDate, String accountType, float accountBalance) {
        super();
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.openingDate = openingDate;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "AccountDetails{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", openingDate=" + openingDate +
                ", accountType='" + accountType + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
