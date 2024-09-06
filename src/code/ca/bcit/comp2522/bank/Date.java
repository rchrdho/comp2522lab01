package ca.bcit.comp2522.bank;

/**
 * Date class that must allow only years between 1 - current year; months 1 - 12, and days 1 - 31(or 30, or 29).
 * This class has methods that will return you a formatted Date such as 2024-09-30 as well as each of those dates
 * individually. A method that can calculate the exact day of the week, ie: Wednesday.
 */
public class Date
{

    final static int MAX_NUM_YEARS = 1;
    final static int CURRENT_YEAR = 2024;
    final static int MIN_NUM_MONTHS = 1;
    final static int MAX_NUM_MONTHS = 12;
    final static int MIN_NUM_DAYS = 1;
    final static int MAX_NUM_DAYS = 31;
    final static int NINETEEN_HUNDREDS = 1900;
    final static int NUM_OF_FOURS = 4;
    final static int DAYS_IN_WEEK = 7;
    final static int[] monthCode = {1,4,4,0,2,5,0,3,6,1,4,6};
    final static String[] days = {"SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"};

    private final int year;
    private final int month;
    private final int day;

    /**
     * Constructs the date object.
     *
     * @param year between 1 and current year
     * @param month between 1 and 12
     * @param day between 1 and 31
     */
    public Date(final int year, final int month, final int day)
    {
        validateYear(year);
        validateMonth(month);
        validateDay(day);

        this.year = year;
        this.month = month;
        this.day = day;
    }

    private static void validateYear(final int year)
    {
        if (year < MAX_NUM_YEARS || year > CURRENT_YEAR)
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

    private static void validateDay(final int day)
    {
        if (day < MIN_NUM_DAYS || day > MAX_NUM_DAYS)
        {
            throw new IllegalArgumentException("Invalid day entry: " + day);
        }
    }

    /**
     * Accessor for day.
     * @return the day
     */
    public int getDay()
    {
        return day;
    }

    /**
     * Accessor for month.
     * @return the month
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Accessor for the Year.
     * @return the year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Accessor for the full date formatted in Year to month to day.
     * @return fullDate an integer
     */
    public String getYYYYMMDD()
    {
        final String fullDate;

        fullDate = String.format("%04d-%02d-%02d", year, month, day);
        return fullDate;
    }

    /**
     * Accessor for the day of the week.
     * @return day of the week
     */
    public String getDayOfTheWeek()
    {
        final int datesInNinetys;
        final int numOfTwelves;
        final int remainderDates;
        final int numOfFours;
        final int totalSumWithDays;
        final int sumWithMonthCode;
        final int dayOfWeek;

        datesInNinetys = year - NINETEEN_HUNDREDS;
        numOfTwelves = datesInNinetys / MAX_NUM_MONTHS;
        remainderDates = datesInNinetys - (MAX_NUM_MONTHS * numOfTwelves);
        numOfFours = remainderDates / NUM_OF_FOURS;
        totalSumWithDays = MAX_NUM_DAYS + numOfTwelves + remainderDates + numOfFours;
        sumWithMonthCode = totalSumWithDays + monthCode[month + 1];
        dayOfWeek = sumWithMonthCode % DAYS_IN_WEEK;
        return days[dayOfWeek];
    }

//    // Test
//    public static void main (final String [] args)
//    {
//        Date date = new Date(1977, 10, 31);
//        System.out.println(date.getDayOfTheWeek());
//
//    }

}

