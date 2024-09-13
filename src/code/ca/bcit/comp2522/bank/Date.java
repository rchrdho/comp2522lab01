package ca.bcit.comp2522.bank;

/**
 * Date class that must allow only years between 1 - current year; months 1 - 12, and days 1 - 31(or 30, or 29).
 * This class has methods that will return you a formatted Date such as 2024-09-30 as well as each of those dates
 * individually. A method that can calculate the exact day of the week, ie: Wednesday. Helper methods are implemented
 * to determine a leap year to calculate the number of days for the month
 *
 * @author Richard Ho
 * @author Jayden Hutchinson
 * @version 2.0
 */
public class Date
{
    // symbolic constants
    static final int MIN_NUM_YEARS = 1800;
    static final int CURRENT_YEAR = 2024;
    static final int MIN_NUM_MONTHS = 1;
    static final int MAX_NUM_MONTHS = 12;
    static final int MIN_NUM_DAYS = 1;
    static final int MAX_NUM_DAYS = 31;
    static final int THIRTY = 30;
    static final int TWENTY_NINE = 29;
    static final int TWENTY_EIGHT = 28;
    static final int NINETEEN_HUNDREDS = 1900;
    static final int TWO_THOUSANDS = 2000;
    static final int FOUR = 4;
    static final int DAYS_IN_WEEK = 7;
    static final int ZERO = 0;
    static final int HUNDRED = 100;
    static final int FOUR_HUNDRED = 400;
    static final int SIX = 6;
    static final int TWO = 2;

    private static final int SATURDAY = 0;
    private static final int SUNDAY = 1;
    private static final int MONDAY = 2;
    private static final int TUESDAY = 3;
    private static final int WEDNESDAY = 4;
    private static final int THURSDAY = 5;
    private static final int FRIDAY = 6;

    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;
    private static final int APRIL = 4;
    private static final int MAY = 5;
    private static final int JUNE = 6;
    private static final int JULY = 7;
    private static final int AUGUST = 8;
    private static final int SEPTEMBER = 9;
    private static final int OCTOBER = 10;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;

    private static final int JANUARY_CODE = 1;
    private static final int FEBRUARY_CODE = 4;
    private static final int MARCH_CODE = 4;
    private static final int APRIL_CODE = 0;
    private static final int MAY_CODE = 2;
    private static final int JUNE_CODE = 5;
    private static final int JULY_CODE = 0;
    private static final int AUGUST_CODE = 3;
    private static final int SEPTEMBER_CODE = 6;
    private static final int OCTOBER_CODE = 1;
    private static final int NOVEMBER_CODE = 4;
    private static final int DECEMBER_CODE = 6;

    private final int year;
    private final int month;
    private final int day;

    /**
     * Constructs the date object.
     *
     * @param year  between 1 and current year
     * @param month between JANUARY and DECEMBER
     * @param day   between 1 and max number of days for tht month
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
        final int daysInTheMonth = getMaxDaysInMonth(month, year);
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
                return isLeapYear(year) ? TWENTY_NINE : TWENTY_EIGHT;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER:
                return THIRTY;
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
        return (year % FOUR == ZERO && year % HUNDRED != ZERO) || (year % FOUR_HUNDRED == ZERO);
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
     * Accessor for the full date formatted in Year-Month-Day.
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
     * Accessor for the day of the week, calculated in 7 steps.
     * Step 0 calculates the number of the years past in the given century since its base century
     * Step 1 the number of twelves in the number of years < current century, Step 2 the remainder from the first step,
     * Step 3 calculate the number of fours in step 2's result, Step 4 add day of the month to each step results,
     * Step 5 add the month code assigned of the month to the sum total, Step 6 mod the sum of Step 5,
     * Step 7 Result of step 6 represents the current day of the week
     *
     * @return day of the week a String
     */
    public String getDayOfTheWeek()
    {
        int       yearsSinceBaseCentury;
        final int centuryOffset;
        final int baseCaseSum;
        final int numOfTwelves;
        final int remainderDates;
        final int numOfFours;
        final int totalSumWithDays;
        final int sumWithMonthCode;

        // remaining years of base century
        yearsSinceBaseCentury = year % HUNDRED;
        centuryOffset         = getCenturyOffset(year);

        // if year is a leap year and months align, add 6 before calculation.
        if(isLeapYear(year) && (month == JANUARY || month == FEBRUARY))
        {
            yearsSinceBaseCentury += SIX;
        }

        // add centuryOffset to remaining years
        baseCaseSum = yearsSinceBaseCentury + centuryOffset;

        numOfTwelves   = baseCaseSum / MAX_NUM_MONTHS;
        remainderDates = baseCaseSum - (MAX_NUM_MONTHS * numOfTwelves);
        numOfFours     = remainderDates / FOUR;
        // adds total sum of calculations with day from date
        totalSumWithDays = day + numOfTwelves + remainderDates + numOfFours;
        sumWithMonthCode = totalSumWithDays + getMonthCode(month);

        switch(sumWithMonthCode % DAYS_IN_WEEK)
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
     * returns values that correlate to base year. (base year being 18XX 19XX 20XX
     */
    private static int getCenturyOffset(final int year)
    {
        // year is greater than or equal to 2000 return 6
        if(year >= TWO_THOUSANDS)
        {
            return SIX;
        }
        // else if year is less than 1900 return 2
        else if(year < NINETEEN_HUNDREDS)
        {
            return TWO;
        }
        return ZERO;
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
        Date date = new Date(1977, 10, 31);

        System.out.println(date);
        System.out.println(date.getYYYYMMDD());
        System.out.println(date.getDayOfTheWeek());
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());

    }
}