package ca.bcit.comp2522.bank;

/**
 * BankClient Class.
 * Provides sign up date, client ID, and Person details.
 * it extends the Person Class and overrides the Person Class' getDetails() to a formatted output.
 *
 * @author Jayden Hutchinson
 * @author Richard Ho
 * @version 1.0
 */
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
     * Constructor for BankClient.
     *
     * @param signupDate a Date this Client signed up on
     * @param clientID   a String that represents this Client
     */
    public BankClient(final Date signupDate, final String clientID, final Person person)
    {
        super(person.getName(), person.getBirthDate(), person.getDeathDate());

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
     * @param clientID a String for ClientID
     *
     * @throws IllegalArgumentException if ClientID is invalid
     */
    private void validateClientID(String clientID)
    {
        if (clientID.length() < MIN_CLIENTID_LENGTH || clientID.length() > MAX_CLIENTID_LENGTH)
        {
            throw new IllegalArgumentException("Invalid Client ID");
        }
    }
}