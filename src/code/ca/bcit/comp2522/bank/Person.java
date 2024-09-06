package ca.bcit.comp2522.bank;

/**
 *
 */
public class Person
{
    private final Name name;
    private final Date birthDate;
    private final Date deathDate;

    private static final String ALIVE_STATUS = "alive";
    private static final String DIED_STATUS = "died";

    /**
     * Constructor for person class.
     * @param name a Name
     * @param birthDate a Date
     * @param deathDate a Date
     */
    public Person(final Name name, final Date birthDate, final Date deathDate)
    {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }

    /**
     * Gets the details of the client in format
     * @return Full Name (alive/died + date) was born DAY, MONTH DATE, YEAR
     */
    public String getDetails()
    {
        final String status = (deathDate == null) ? ALIVE_STATUS : DIED_STATUS + " " + deathDate.getDayOfTheWeek();
        return String.format("%s (%s) was born on %s, %s %02d, %d", name.getFullName(), status,
                birthDate.getDayOfTheWeek(), getMonthName(birthDate.getMonth()), birthDate.getDay(),
                birthDate.getYear());
    }

    public String getMonthName(int month)
    {
        final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October","November", "December"};
        return months[month + 1];
    }

}
