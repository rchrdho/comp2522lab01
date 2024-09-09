package ca.bcit.comp2522.bank;

/**
 * BankAccount Class.
 * Provides Bank Client, Account Number, Pin, account balance, Date account opened,
 * and Date account closed[can be null]
 * Has Methods to withdraw from bank balance.
 *
 * @author Jayden Hutchinson
 * @author Richard Ho
 * @version 1.0
 */
public class BankAccount
{
    double balanceUsd;

    private final BankClient client;
    private final String accountNumber;
    private final Date accountOpenedDate;
    private final Date accountClosedDate;
    private final int pin;

    /**
     * Constructs the BankAccount object.
     *
     * @param client            a BankClient
     * @param accountNumber     a String assigned the persons account
     * @param pin               an Integer that unlocks account for use
     * @param balanceUsd        an Integer for the persons balance
     * @param accountOpenedDate a Date this person opened account
     * @param accountClosedDate a Date this person closed account
     */
    public BankAccount(final BankClient client, final String accountNumber, final int pin, final int balanceUsd, final Date accountOpenedDate, final Date accountClosedDate)
    {
        // assign variables
        this.client = client;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.accountOpenedDate = accountOpenedDate;
        this.accountClosedDate = accountClosedDate;
        this.balanceUsd = balanceUsd;
    }

    /**
     * Withdraws the given amount USD from the clients bank account
     *
     * @param amountToWithdrawUsd Amount to withdraw from account
     */
    public void withdraw(final double amountToWithdrawUsd)
    {
        // subtract the given amount from the current balance
        balanceUsd -= amountToWithdrawUsd;
        // print the transaction
        System.out.println("-" + amountToWithdrawUsd + " Withdrawn\nNew Balance: " + balanceUsd + "\n");
    }

    /**
     * Withdraws the given amount USD from the clients bank account
     * Requires that a pin be input to verify transaction
     *
     * @param amountToWithdrawUsd Amount to withdraw from account
     * @param pinToMatch          The clients pin
     *
     * @throws IllegalArgumentException Invalid pin if pin does not match
     */
    public void withdraw(final double amountToWithdrawUsd, final int pinToMatch)
    {
        // if pin does not match the recorded pin throw illegal argument exception
        if (pinToMatch != pin)
        {
            throw new IllegalArgumentException("Invalid pin");
        }
        // subtract amount given from current balance
        balanceUsd -= amountToWithdrawUsd;
        System.out.println("-" + amountToWithdrawUsd + " Withdrawn\nNew Balance: " + balanceUsd);
    }

    /**
     * Gives the details of the client
     *
     * @return NAME had BALANCE in account accountNumber which
     * he opened in DAY, MONTH DATE, YEAR and closed DAY, MONTH DATE, YEAR
     */
    public String getDetails()
    {
        // String builder instantiation
        StringBuilder returnString = new StringBuilder();
        // add client full name, their current balance, account number, and date account opened
        returnString.append(client.getName().getFullName()).append(" had $").append(balanceUsd).append(" in account ").append(accountNumber).append(" which ").append("they").append(" opened on ").append(accountOpenedDate.getDayOfTheWeek()).append(" ").append(client.getMonthName(accountOpenedDate.getMonth())).append(" ").append(accountOpenedDate.getDay()).append(", ").append(accountOpenedDate.getYear());

        // if the account does not have a close date append it is still open
        if (accountClosedDate == null)
        {
            returnString.append(" and is still open");
        }
        // else append the date closed
        else
        {
            returnString.append(" and closed ").append(accountClosedDate.getDayOfTheWeek()).append(" ").append(client.getMonthName(accountClosedDate.getMonth())).append(" ").append(accountClosedDate.getDay()).append(", ").append(accountClosedDate.getYear());
        }
        // return the full string
        return returnString.toString();
    }

    /**
     * Getter for client
     *
     * @return this BankClient Object
     */
    public BankClient getClient()
    {
        return client;
    }
}