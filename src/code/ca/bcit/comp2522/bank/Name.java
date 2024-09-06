package ca.bcit.comp2522.bank;
import org.apache.commons.lang3.StringUtils;

/**
 *  Name class that must not be null or blank, and cannot be more than 45 characters.
 *  This class contains methods that will return the initials, full name and reverse
 *  the name input.
 *
 * @author Richard Ho and Jayden
 * @version 1.0
 */
public class Name
{
    private final String first;
    private final String last;
    private static final int MAX_STRING_SIZE = 45;

    /**
     * Constructor for the Name class.
     * @param first a string that takes first name
     * @param last a string that takes last name
     */
    public Name(final String first, final String last) {
        validateFirstName(first);
        validateLastName(last);

        this.first = first;
        this.last = last;
    }

    private static void validateFirstName(final String first)
    {
        if(first == null || first.isBlank() || first.length() > MAX_STRING_SIZE || first.toLowerCase().contains("admin"))
        {
            throw new IllegalArgumentException("Invalid first name entry");
        }
    }

    private static void validateLastName(final String last)
    {
        if(last == null || last.isBlank() || last.length() > MAX_STRING_SIZE || last.toLowerCase().contains("admin"))
        {
            throw new IllegalArgumentException("Invalid last name entry");
        }
    }

    /**
     * Accessor for first name.
     * @return first a String
     */
    public String getFirst()
    {
        return first;
    }

    /**
     * Accessor for last name.
     * @return last a String
     */
    public String getLast()
    {
        return last;
    }

    /**
     * Method that converts the first and last name to their initials capitalized.
     * @return initials a String
     */
    public String getInitials()
    {
        final StringBuilder initials;

        initials = new StringBuilder();
        initials.append(first.toUpperCase().charAt(0));
        initials.append(".");
        initials.append(last.toUpperCase().charAt(0));
        initials.append(".");

        return initials.toString();
    }

    /**
     * Method that concatenates both the first and last name input.
     * @return Full name concatenated
     */
    public String getFullName()
    {
        final StringBuilder fullName;

        fullName = new StringBuilder();
        fullName.append(first);
        fullName.append(" ");
        fullName.append(last);

        return fullName.toString();
    }

    /**
     * Method that will reverse a full name.
     * @return reversed
     */
    public String getReverseName()
    {
        final StringBuilder reversedName;

        reversedName = new StringBuilder();
        reversedName.append(StringUtils.reverse(first));
        reversedName.append(" ");
        reversedName.append(StringUtils.reverse(last));

        return reversedName.toString();

    }

}
