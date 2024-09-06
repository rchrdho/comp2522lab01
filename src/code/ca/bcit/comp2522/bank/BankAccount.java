package ca.bcit.comp2522.bank;

public class BankAccount {

    private final String client;

    private final String accountNumber;

    private final Date accountOpened;

    private final Date accountClosed;

    public BankAccount(String client, String accountNumber, Date accountOpened, Date accountClosed) {
        this.client = client;
        this.accountNumber = accountNumber;
        this.accountOpened = accountOpened;
        this.accountClosed = accountClosed;
    }

    /**
     *  Withdraws the given amount USD from the clients bank account
     * @param amountUsd
     */
    public void withdraw(final double amountUsd) {

    }

    /**
     * Withdraws the given amount USD from the clients bank account
     * Requires that a pin be input to verify transaction
     * @param amountUsd Amount to withdraw from account
     * @param pinToMatch The clients pin
     */
    public void withdraw(final double amountUsd, final int pinToMatch) {

    }

    /**
     * Gives the details of the client
     * @return NAME had BALANCE in account accountNumber which
     * he opened in DAY, MONTH DATE, YEAR and closed DAY, MONTH DATE, YEAR
     */
    public String getDetails() {
        return "";
    }
}
