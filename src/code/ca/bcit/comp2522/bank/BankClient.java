package ca.bcit.comp2522.bank;

public class BankClient extends Person
{

    /**
     * Date that client signed up
     */
    private final Date signupDate;

    /**
     * Client ID; must be 6 or 7 digits long
     */
    private final String clientID;

    /**
     * Minimum length that a clientID may be
     */
    private static final int MIN_CLIENTID_LENGTH = 6;
    /**
     * Maximum length that a clientID may be
     */
    private static final int MAX_CLIENTID_LENGTH = 7;

    /**
     * Constructor for BankClient
     *
     * @param signupDate
     * @param clientID
     */
    public BankClient(final Date signupDate, final String clientID, final Person person)
    {
        // Person object constructor call
        super(person.getName(), person.getBirthDate(), person.getDeathDate());

        // validate client id length and assign variables
        validateClientID(clientID);
        this.signupDate = signupDate;
        this.clientID = clientID;
    }

    /**
     * Gets the details of the client
     *
     * @return A string in the format Full Name client #12345 (alive / not alive) joined the bank on
     * DAY, MONTH DATE, YEAR
     */
    public String getDetails()
    {
        return super.getDetails();
    }

    /**
     * Validates that the clientID is between 6 and 7 digits long
     *
     * @param clientID
     */
    private void validateClientID(String clientID)
    {
        // if client id length is less than the minimum client id length or longer than the maximum length throw
        // illegal argument exception
        if (clientID.length() < MIN_CLIENTID_LENGTH || clientID.length() > MAX_CLIENTID_LENGTH)
        {
            throw new IllegalArgumentException("Invalid Client ID");
        }
    }
}