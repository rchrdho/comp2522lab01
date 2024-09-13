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
    private final Date   signupDate;
    private final String clientID;

    private static final int MIN_CLIENTID_CHARACTER_LENGTH = 6;
    private static final int MAX_CLIENTID_CHARACTER_LENGTH = 7;

    /**
     * Constructor for BankClient.
     *
     * @param signupDate a Date this Client signed up on
     * @param clientID   a String that represents this Client
     */
    public BankClient(final Date signupDate, final String clientID, final Person person)
    {
        // Person object constructor call
        super(person.getName(), person.getBirthDate(), person.getDeathDate());

        // validate client id length and assign variables
        validateClientID(clientID);
        this.signupDate = signupDate;
        this.clientID   = clientID;
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

    /*
     * Validates that the clientID is between MIN_CLIENTID_CHARACTER_LENGTH and MAX_CLIENTID_CHARACTER_LENGTH
     *
     * @param clientID a String for ClientID
     *
     * @throws IllegalArgumentException if ClientID is invalid
     */
    private void validateClientID(final String clientID)
    {
        // if client id length is less than MIN_CLIENTID_CHARACTER_LENGTH or longer than MAX_CLIENTID_CHARACTER_LENGTH
        // throw
        // illegal argument exception
        if(clientID.length() < MIN_CLIENTID_CHARACTER_LENGTH || clientID.length() > MAX_CLIENTID_CHARACTER_LENGTH)
        {
            throw new IllegalArgumentException("Invalid Client ID");
        }
    }
}