package ca.bcit.comp2522.bank;

import org.apache.commons.lang3.StringUtils;

/**
 * Name class.
 * must not be null or blank,
 * cannot be more than 45 characters.
 * <p>
 * Contains methods that will return the initials, full name and reverse
 * the name input.
 *
 * @author Richard Ho and Jayden Hutchinson
 * @version 1.0
 */
public class Name
{
    // instance variables
    private final String first;
    private final String last;

    // symbolic constants
    private static final int MAX_NAME_LENGTH_CHARS = 45;
    private static final int FIRST_CHAR = 0;
    private static final int SECOND_CHAR = 1;
    private static final String ADMIN = "admin";

    /**
     * Constructor for the Name class.
     *
     * @param first String that takes first name
     * @param last  String that takes last name
     *
     * @throws IllegalArgumentException first or last name is null, bank, or less than the maximum name length in
     *                                  characters
     */
    public Name(final String first, final String last)
    {
        // validate Inputs
        validateFirstName(first);
        validateLastName(last);

        // assign Variables
        this.first = first;
        this.last = last;
    }

    /*
     * Validator method to check if firstname is within 45 characters, not "admin", null or blank
     */
    private static void validateFirstName(final String first)
    {
        // if first is null, blank, or less than maximum length, throw exception
        if (first == null || first.isBlank() || first.length() > MAX_NAME_LENGTH_CHARS || first.equalsIgnoreCase(ADMIN))
        {
            throw new IllegalArgumentException("Invalid first name entry");
        }
    }

    /*
     * Validator method to check if lastname is within 45 characters, not "admin", null or blank
     */
    private static void validateLastName(final String last)
    {
        // if last is null, blank, or less than maximum length, throw exception
        if (last == null || last.isBlank() || last.length() > MAX_NAME_LENGTH_CHARS || last.equalsIgnoreCase(ADMIN))
        {
            throw new IllegalArgumentException("Invalid last name entry");
        }
    }

    /**
     * Accessor for first name.
     *
     * @return first name
     */
    public String getFirst()
    {
        return first;
    }

    /**
     * Accessor for last name.
     *
     * @return last name
     */
    public String getLast()
    {
        return last;
    }

    /**
     * Converts the first and last name to their initials capitalized.
     *
     * @return initials a String
     */
    public String getInitials()
    {
        // initials string builder initialization
        final StringBuilder initials;
        initials = new StringBuilder();

        initials.append(first.toUpperCase().charAt(FIRST_CHAR));// append Capital First Initial
        initials.append("."); // append period
        initials.append(last.toUpperCase().charAt(FIRST_CHAR)); // append Capital Last Initial
        initials.append("."); // append period

        return initials.toString(); // return initials
    }

    /**
     * Concatenates both the first and last name input.
     *
     * @return Full name concatenated
     */
    public String getFullName()
    {
        // full name string builder initialization
        final StringBuilder fullName;
        fullName = new StringBuilder();

        // creates a string of the first and last name with capital first letter and lower case for the rest
        fullName.append(first.substring(FIRST_CHAR, SECOND_CHAR).toUpperCase() + first.substring(SECOND_CHAR, first.length()).toLowerCase()); // append first name with capital first letter and lower rest
        fullName.append(" "); // append space
        fullName.append(last.substring(FIRST_CHAR, SECOND_CHAR).toUpperCase() + last.substring(SECOND_CHAR, last.length()).toLowerCase()); // append last name with capital first letter and lower rest

        return fullName.toString(); // return first and last name
    }

    /**
     * Method that will reverse a full name.
     *
     * @return Full name reversed
     */
    public String getReverseName()
    {
        // reversed name string builder initialization
        final StringBuilder reversedName;
        reversedName = new StringBuilder();

        reversedName.append(StringUtils.reverse(last)); // append last name
        reversedName.append(" "); // append a space
        reversedName.append(StringUtils.reverse(first)); // append first name

        return reversedName.toString(); // return full reversed name
    }
}