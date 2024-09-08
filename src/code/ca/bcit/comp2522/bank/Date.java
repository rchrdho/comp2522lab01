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
    final static int MIN_NUM_YEARS = 1800;
    final static int CURRENT_YEAR = 2024;
    final static int MIN_NUM_MONTHS = 1;
    final static int MAX_NUM_MONTHS = 12;
    final static int MIN_NUM_DAYS = 1;
    final static int MAX_NUM_DAYS = 31;
    final static int THIRTY = 30;
    final static int TWENTY_NINE = 29;
    final static int TWENTY_EIGHT = 28;
    final static int NINETEEN_HUNDREDS = 1900;
    final static int TWO_THOUSANDS = 2000;
    final static int FOUR = 4;
    final static int DAYS_IN_WEEK = 7;
    final static int ZERO = 0;
    final static int HUNDRED = 100;
    final static int FOUR_HUNDRED = 400;
    final static int SIX = 6;
    final static int TWO = 2;

    private final static int SATURDAY = 0;
    private final static int SUNDAY = 1;
    private final static int MONDAY = 2;
    private final static int TUESDAY = 3;
    private final static int WEDNESDAY = 4;
    private final static int THURSDAY = 5;
    private final static int FRIDAY = 6;

    private final static int JANUARY = 1;
    private final static int FEBRUARY = 2;
    private final static int MARCH = 3;
    private final static int APRIL = 4;
    private final static int MAY = 5;
    private final static int JUNE = 6;
    private final static int JULY = 7;
    private final static int AUGUST = 8;
    private final static int SEPTEMBER = 9;
    private final static int OCTOBER = 10;
    private final static int NOVEMBER = 11;
    private final static int DECEMBER = 12;

    private final static int JANUARY_CODE = 1;
    private final static int FEBRUARY_CODE = 4;
    private final static int MARCH_CODE = 4;
    private final static int APRIL_CODE = 0;
    private final static int MAY_CODE = 2;
    private final static int JUNE_CODE = 5;
    private final static int JULY_CODE = 0;
    private final static int AUGUST_CODE = 3;
    private final static int SEPTEMBER_CODE = 6;
    private final static int OCTOBER_CODE = 1;
    private final static int NOVEMBER_CODE = 4;
    private final static int DECEMBER_CODE = 6;

    private final int year;
    private final int month;
    private final int day;

    /**
     * Constructs the date object.
     *
     * @param year  between 1 and current year
     * @param month between 1 and 12
     * @param day   between 1 and max number of days for tht month
     */
    public Date(final int year, final int month, final int day)
    {
        validateYear(year);
        validateMonth(month);
        validateDay(day, month, year);

        this.year = year;
        this.month = month;
        this.day = day;
    }

    private static void validateYear(final int year)
    {
        if (year < MIN_NUM_YEARS || year > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Invalid year entry: " + year);
        }
    }

    private static void validateMonth(final int month)
    {
        if (month < MIN_NUM_MONTHS || month > MAX_NUM_MONTHS)
        {
            throw new IllegalArgumentException("Invalid month entry: " + month);
        }
    }

    private static void validateDay(final int day, final int month, final int year)
    {
        final int maxDay = getMaxDaysInMonth(month, year);
        if (day < MIN_NUM_DAYS || day > maxDay)
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
        switch (month)
        {
            case FEBRUARY:
                return isLeapYear(year) ? TWENTY_NINE : TWENTY_EIGHT;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER:
                return THIRTY;
            default:
                return MAX_NUM_DAYS;
        }
    }

    /**
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
        int yearsSinceBaseCentury;
        final int centuryOffset;
        final int baseCaseSum;
        final int numOfTwelves;
        final int remainderDates;
        final int numOfFours;
        final int totalSumWithDays;
        final int sumWithMonthCode;

        // remaining years of base century
        yearsSinceBaseCentury = year % HUNDRED;
        centuryOffset = getCenturyOffset(year);

        // if year is a leap year and months align, add 6 before calculation.
        if (isLeapYear(year) && (month == JANUARY || month == FEBRUARY))
        {
            yearsSinceBaseCentury += SIX;
        }

        // add centuryOffset to remaining years
        baseCaseSum = yearsSinceBaseCentury + centuryOffset;

        numOfTwelves = baseCaseSum / MAX_NUM_MONTHS;
        remainderDates = baseCaseSum - (MAX_NUM_MONTHS * numOfTwelves);
        numOfFours = remainderDates / FOUR;
        // adds total sum of calculations with day from date
        totalSumWithDays = day + numOfTwelves + remainderDates + numOfFours;
        sumWithMonthCode = totalSumWithDays + getMonthCode(month);

        switch (sumWithMonthCode % DAYS_IN_WEEK)
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

    /**
     * returns values that correlate to base year
     */
    private static int getCenturyOffset(final int year)
    {
        if (year >= TWO_THOUSANDS)
        {
            return SIX;
        }
        else if (year < NINETEEN_HUNDREDS)
        {
            return TWO;
        }
        return ZERO;
    }

    // helper method that returns the month code
    private static int getMonthCode(final int month)
    {
        switch (month)
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

    // Test
    public static void main(final String[] args)
    {
        Date date = new Date(1977, 10, 31);
        System.out.println(date.getYYYYMMDD());

    }
}