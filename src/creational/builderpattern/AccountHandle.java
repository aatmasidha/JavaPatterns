package creational.builderpattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountHandle {

    public static void main(String[] args) {

        String sDate1 = "31/12/2022";
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

            AccountDetails accountDetails = new AccountDetails("Aparna Atmasidha","12345",
                    date1, "Savings", 10000.00f);


        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        AccountDetails accDetails = new AccountDetailsBuilders().setAccountHolderName("Aparna Atmasidha").setAccountNumber("12345").
                setAccountType("Savings").setAccountBalance(10000.00f).setAccountBalance(10000.00f).getAccountDetails();



    }
}
