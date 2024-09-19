package ca.bcit.comp2522.bank;

/**
 * Date class that must allow only years between
 * <pre>
 * MIN_NUM_YEARS - CURRENT_YEAR; MIN_NUM_MONTHS - MAX_NUM_MONTHS, and MIN_NUM_DAYS - MAX_NUM_DAYS.
 * </pre>
 * This class has methods that will return you a formatted Date such as 2024-09-30 as well as each of those dates
 * individually. A method that can calculate the exact day of the week, ie: WEDNESDAY. Helper methods are implemented
 * to determine a leap year to calculate the number of days for the month
 *
 * @author Richard Ho
 * @author Jayden Hutchinson
 * @version 2.0
 */
public class Date
{
    // symbolic constants
    static final int MIN_NUM_YEARS             = 1800;
    static final int CURRENT_YEAR              = 2024;
    static final int MIN_NUM_MONTHS            = 1;
    static final int MAX_NUM_MONTHS            = 12;
    static final int MIN_NUM_DAYS              = 1;
    static final int MAX_NUM_DAYS              = 31;
    static final int DAYS_IN_WEEK              = 7;
    static final int DAYS_IN_OTHER_MONTHS      = 30; // days in April, June, September, November
    static final int DAYS_IN_LONGER_FEBRUARY   = 29;
    static final int DAYS_IN_SHORTER_FEBRUARY  = 28;
    static final int YEAR_NINETEEN_HUNDREDS    = 1900;
    static final int YEAR_TWO_THOUSANDS        = 2000;
    static final int LEAP_YEAR_DIVISOR         = 4;
    static final int NO_REMAINDER              = 0;
    static final int CENTURY_DIVISOR           = 100;
    static final int LEAP_YEAR_SPECIAL_DIVISOR = 400;
    static final int CENTURY_OFFSET_MODIFIER   = 6;
    static final int PRE_19TH_CENTURY_OFFSET   = 2;
    static final int TWELVE_YEAR_PERIOD        = 12;
    static final int FOUR_YEAR_PERIOD          = 4;

    private static final int SATURDAY  = 0;
    private static final int SUNDAY    = 1;
    private static final int MONDAY    = 2;
    private static final int TUESDAY   = 3;
    private static final int WEDNESDAY = 4;
    private static final int THURSDAY  = 5;
    private static final int FRIDAY    = 6;

    private static final int JANUARY   = 1;
    private static final int FEBRUARY  = 2;
    private static final int MARCH     = 3;
    private static final int APRIL     = 4;
    private static final int MAY       = 5;
    private static final int JUNE      = 6;
    private static final int JULY      = 7;
    private static final int AUGUST    = 8;
    private static final int SEPTEMBER = 9;
    private static final int OCTOBER   = 10;
    private static final int NOVEMBER  = 11;
    private static final int DECEMBER  = 12;

    private static final int JANUARY_CODE   = 1;
    private static final int FEBRUARY_CODE  = 4;
    private static final int MARCH_CODE     = 4;
    private static final int APRIL_CODE     = 0;
    private static final int MAY_CODE       = 2;
    private static final int JUNE_CODE      = 5;
    private static final int JULY_CODE      = 0;
    private static final int AUGUST_CODE    = 3;
    private static final int SEPTEMBER_CODE = 6;
    private static final int OCTOBER_CODE   = 1;
    private static final int NOVEMBER_CODE  = 4;
    private static final int DECEMBER_CODE  = 6;

    private final int year;
    private final int month;
    private final int day;

    /**
     * Constructs the date object.
     *
     * @param year  between MIN_NUM_YEARS and CURRENT_YEAR
     * @param month between MIN_NUM_MONTHS and CURRENT_MONTH
     * @param day   between MIN_NUM_DAYS and getMaxDaysInMonth
     */
    public Date(final int year, final int month, final int day)
    {
        // validate inputs
        validateYear(year);
        validateMonth(month);
        validateDay(day, month, year);

        // initialization
        this.year  = year;
        this.month = month;
        this.day   = day;
    }

    /*
     * Validator method that checks if year is within the given range of years
     */
    private static void validateYear(final int year)
    {
        // if year is less than minimum number of years or greater than current year throw illegal argument exception
        if(year < MIN_NUM_YEARS || year > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Invalid year entry: " + year);
        }
    }

    /*
     * Validator method to check if month is within the range of max months in a year
     */
    private static void validateMonth(final int month)
    {
        // if month is less than minimum number of month or greater than maximum number of months throw illegal
        // argument exception
        if(month < MIN_NUM_MONTHS || month > MAX_NUM_MONTHS)
        {
            throw new IllegalArgumentException("Invalid month entry: " + month);
        }
    }

    /*
     * validator method that checks if day is within the maximum amount of days in that month
     * Also uses helper method to check maximum days in that year
     */
    private static void validateDay(final int day, final int month, final int year)
    {
        // get days in month based on which month it is
        final int daysInTheMonth;
        daysInTheMonth = getMaxDaysInMonth(month, year);
        // if day is less than minimum number of days or maximum number of days throw illegal argument exception
        if(day < MIN_NUM_DAYS || day > daysInTheMonth)
        {
            throw new IllegalArgumentException("Invalid day entry: " + day);
        }
    }

    /**
     * Uses isLeapYear to validate and check for maximum number of days in the month with conditional logic.
     *
     * @param month a Integer
     * @param year  a Integer
     *
     * @return The number of total days in the month with leap year considered
     */
    private static int getMaxDaysInMonth(final int month, final int year)
    {
        // returns the days in the month given the current date and if it is a leap year
        switch(month)
        {
            case FEBRUARY:
                return isLeapYear(year) ? DAYS_IN_LONGER_FEBRUARY : DAYS_IN_SHORTER_FEBRUARY;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER:
                return DAYS_IN_OTHER_MONTHS;
            default:
                return MAX_NUM_DAYS;
        }
    }

    /*
     * Conditional to return true if the calculated year is a leap year, false if not.
     * Calculation for this found off of Google
     *
     * @param year an integer
     *
     * @return a boolean value
     */
    private static boolean isLeapYear(final int year)
    {
        return (year % LEAP_YEAR_DIVISOR == NO_REMAINDER && year % CENTURY_DIVISOR != NO_REMAINDER) || (year % LEAP_YEAR_SPECIAL_DIVISOR == NO_REMAINDER);
    }

    /**
     * Accessor for day.
     *
     * @return the day
     */
    public int getDay()
    {
        return day;
    }

    /**
     * Accessor for month.
     *
     * @return the month
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Accessor for the Year.
     *
     * @return the year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Accessor for the formatted full date in Year-Month-Day.
     *
     * @return a formatted date String (e.g. 2024-09-07)
     */
    public String getYYYYMMDD()
    {
        final String fullDate;

        fullDate = String.format("%04d-%02d-%02d", year, month, day);
        return fullDate;
    }

    /**
     * Calculates and returns the day of the week for the current date using a standard
     * algorithm, broken down into several logical steps.
     * <p>
     * Steps:
     * <ul>
     *     <li>Step 0: Calculate yearsSinceBaseCentury by year modulo the {@code CENTURY_DIVISOR}.
     *     Then Calculate baseCaseSum by adding centuryOffset to {@code yearsSinceBaseCentury}.</li>
     *     <li>Step 1: Calculate numOfTwelves by dividing the baseCaseSum by TWELVE_YEAR_PERIOD.</li>
     *     <li>Step 2: Calculate remainderDates by finding the MAX_NUM_MONTHS multiplied by numOfTwelves then subtract
     *     the result from baseCaseSum; to handle partial years.</li>
     *     <li>Step 3: Calculate numOfFours by dividing remainderDates by {@code FOUR_YEAR_PERIOD}.</li>
     *     <li>Step 4: Calculate totalSumWithDays by adding day, sumOfTwelves, remainderDates and numOfFours.</li>
     *     <li>Step 5: Calculate sumWithMonthCode by adding monthCode to totalSumWithDays.</li>
     *     <li>Step 6: Calculate the dayOfWeekCode by sumWithMonthCode modulo {@code DAYS_IN_WEEK}.</li>
     *     <li>Step 7: Insert dayOfWeekCode into switch case to{@code getDayOfTheWeek}. </li>
     * </ul>
     * <p>
     * Leap year adjustments: If the year is a leap year and the month is either January or February,
     * an additional {@code CENTURY_OFFSET_MODIFIER} is added to the calculation to account for
     * the shortened months in leap years.
     *
     * @return the day of the week as a string (e.g., "Monday", "Tuesday").
     */
    public String getDayOfTheWeek()
    {
        int yearsSinceBaseCentury;

        final int     centuryOffset;
        final int     baseCaseSum;
        final int     numOfTwelves;
        final int     remainderDates;
        final int     numOfFours;
        final int     totalSumWithDays;
        final int     sumWithMonthCode;
        final int     dayOfWeekCode;
        final int     monthCode;
        final boolean leapYear;

        // remaining years of base century
        yearsSinceBaseCentury = year % CENTURY_DIVISOR;
        centuryOffset         = getCenturyOffset(year);
        leapYear              = isLeapYear(year);
        monthCode             = getMonthCode(month);

        // if year isLeapYear and month is JANUARY or FEBRUARY, add CENTURY_OFFSET_MODIFIER before calculation.
        if(leapYear && (month == JANUARY || month == FEBRUARY))
        {
            yearsSinceBaseCentury += CENTURY_OFFSET_MODIFIER;
        }

        // add centuryOffset to yearsSinceBaseCentury
        baseCaseSum    = yearsSinceBaseCentury + centuryOffset;
        numOfTwelves   = baseCaseSum / TWELVE_YEAR_PERIOD;
        remainderDates = baseCaseSum - (MAX_NUM_MONTHS * numOfTwelves);
        numOfFours     = remainderDates / FOUR_YEAR_PERIOD;
        // adds total sum of calculations with day from date
        totalSumWithDays = day + numOfTwelves + remainderDates + numOfFours;
        sumWithMonthCode = totalSumWithDays + monthCode;
        dayOfWeekCode    = sumWithMonthCode % DAYS_IN_WEEK;

        switch(dayOfWeekCode)
        {
            case SATURDAY:
                return "Saturday";
            case SUNDAY:
                return "Sunday";
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";
            case WEDNESDAY:
                return "Wednesday";
            case THURSDAY:
                return "Thursday";
            case FRIDAY:
                return "Friday";
            default:
                return "Unknown";
        }
    }

    /*
     * returns values that correlate to base year. (base year being 18XX 19XX 20XX)
     */
    private static int getCenturyOffset(final int year)
    {
        // year is greater than or equal to YEAR_TWO_THOUSAND return CENTURY_OFFSET_MODIFIER
        if(year >= YEAR_TWO_THOUSANDS)
        {
            return CENTURY_OFFSET_MODIFIER;
        }
        // else if year is less than YEAR_NINETEEN_HUNDREDS return PRE_19TH_CENTURY_OFFSET
        else if(year < YEAR_NINETEEN_HUNDREDS)
        {
            return PRE_19TH_CENTURY_OFFSET;
        }
        return NO_REMAINDER;
    }

    /*
     * helper method that returns the month code
     */
    private static int getMonthCode(final int month)
    {
        switch(month)
        {
            case JANUARY:
                return JANUARY_CODE;
            case FEBRUARY:
                return FEBRUARY_CODE;
            case MARCH:
                return MARCH_CODE;
            case APRIL:
                return APRIL_CODE;
            case MAY:
                return MAY_CODE;
            case JUNE:
                return JUNE_CODE;
            case JULY:
                return JULY_CODE;
            case AUGUST:
                return AUGUST_CODE;
            case SEPTEMBER:
                return SEPTEMBER_CODE;
            case OCTOBER:
                return OCTOBER_CODE;
            case NOVEMBER:
                return NOVEMBER_CODE;
            case DECEMBER:
                return DECEMBER_CODE;
            default:
                throw new IllegalArgumentException("Invalid month entry");
        }
    }

    /**
     * Main method used to test all methods made in Date Class.
     *
     * @param args unused
     */
    public static void main(final String[] args)
    {
        Date date;
        date = new Date(1977, 10, 31);

        System.out.println(date);
        System.out.println(date.getYYYYMMDD());
        System.out.println(date.getDayOfTheWeek());
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());

    }
}