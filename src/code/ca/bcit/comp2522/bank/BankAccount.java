package ca.bcit.comp2522.bank;

public class BankAccount
{
    double balanceUsd;

    private final BankClient client;
    private final String accountNumber;
    private final Date accountOpenedDate;
    private final Date accountClosedDate;
    private final int pin;

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
     * @param amountUsd
     */
    public void withdraw(final double amountUsd)
    {
        // subtract the given amount from the current balance
        balanceUsd -= amountUsd;
        System.out.println("-" + amountUsd + " Withdrawn\nNew Balance: " + balanceUsd + "\n"); // print the transaction
    }

    /**
     * Withdraws the given amount USD from the clients bank account
     * Requires that a pin be input to verify transaction
     *
     * @param amountUsd  Amount to withdraw from account
     * @param pinToMatch The clients pin
     */
    public void withdraw(final double amountUsd, final int pinToMatch)
    {
        // if pin does not match the recorded pin throw illegal argument exception
        if (pinToMatch != pin)
        {
            throw new IllegalArgumentException("Invalid pin");
        }
        // subtract amount given from current balance
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
        // String builder instantiation
        StringBuilder returnString = new StringBuilder();
        // add client full name, their current balance, account number, and date account opened
        returnString.append(client.getName().getFullName() + " had $" + balanceUsd + " in account " + accountNumber + " which " + "they" + " opened on " + accountOpenedDate.getDayOfTheWeek() + " " + client.getMonthName(accountOpenedDate.getMonth()) + " " + accountOpenedDate.getDay() + ", " + accountOpenedDate.getYear());

        // if the account does not have a close date append it is still open
        if (accountClosedDate == null)
        {
            returnString.append(" and is still open");
        }
        // else append the date closed
        else
        {
            returnString.append(" and closed " + accountClosedDate.getDayOfTheWeek() + " " + client.getMonthName(accountClosedDate.getMonth()) + " " + accountClosedDate.getDay() + ", " + accountClosedDate.getYear());
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