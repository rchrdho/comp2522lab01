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
        balanceUsd -= amountUsd;
        System.out.println("-" + amountUsd + " Withdrawn\nNew Balance: " + balanceUsd);
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
            returnString.append("and is still open");
        }
        else
        {
            returnString.append(" and closed " + accountClosedDate.getDayOfTheWeek() + " " + client.getMonthName(accountClosedDate.getMonth()) + accountClosedDate.getMonth() + " " + accountClosedDate.getDay() + ", " + accountClosedDate.getYear());
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