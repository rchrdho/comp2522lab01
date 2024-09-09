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
     * @param amountUsd Amount to withdraw from account
     */
    public void withdraw(final double amountUsd)
    {
        balanceUsd -= amountUsd;
        System.out.println("-" + amountUsd + " Withdrawn\nNew Balance: " + balanceUsd);
    }

    /**
     * Withdraws the given amount USD from the clients bank account
     * Requires that a pin be input to verify transaction
     *
     * @param amountUsd  Amount to withdraw from account
     * @param pinToMatch The clients pin
     *
     * @throws IllegalArgumentException Invalid pin if pin does not match
     */
    public void withdraw(final double amountUsd, final int pinToMatch)
    {
        if (pinToMatch != pin)
        {
            throw new IllegalArgumentException("Invalid pin");
        }
        balanceUsd -= amountUsd;
        System.out.println("-" + amountUsd + " Withdrawn\nNew Balance: " + balanceUsd);
    }

    /**
     * Gives the details of the client
     *
     * @return NAME had BALANCE in account accountNumber which
     * he opened in DAY, MONTH DATE, YEAR and closed DAY, MONTH DATE, YEAR
     */
    public String getDetails()
    {
        StringBuilder returnString = new StringBuilder();
        returnString.append(client.getName().getFullName() + " had $" + balanceUsd + " in account " + accountNumber + " which " + "they" + " opened on " + accountOpenedDate.getDayOfTheWeek() + " " + client.getMonthName(accountOpenedDate.getMonth()) + " " + accountOpenedDate.getDay() + ", " + accountOpenedDate.getYear());

        if (accountClosedDate == null)
        {
            returnString.append(" and is still open");
        }
        else
        {
            returnString.append(" and closed " + accountClosedDate.getDayOfTheWeek() + " " + client.getMonthName(accountClosedDate.getMonth()) + " " + accountClosedDate.getDay() + ", " + accountClosedDate.getYear());
        }
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