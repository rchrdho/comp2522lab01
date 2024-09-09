package ca.bcit.comp2522.bank;

/**
 * Main Class.
 * Creates BankAccount objects and displays practical use of the classes and methods created for this bank.
 *
 * @author Jayden Hutchinson
 * @author Richard Ho
 * @version 1.0
 */
public class Main
{
    /**
     * Main method.
     * Runs the program
     *
     * @param args unused
     */
    public static void main(String[] args)
    {

        // person object Albert Einstein (March 14, 1879 - April 18, 1955)
        // bank account object #abc123: signed up January 1, 1900 and closed October 14, 1950
        // pin 3141
        // balance $1000

        // Albert Einstein
        // VARIABLES
        final Person albertEinstein;
        final Name albertEinsteinName;
        final Date albertEinsteinBirthDate;
        final Date albertEinsteinDeathDate;
        final Date albertEinsteinAccountOpenedDate;
        final Date albertEinsteinAccountClosedDate;
        final BankClient albertEinsteinBankClient;
        final BankAccount albertEinsteinBankAccount;
        // birthday
        final int ALBERT_EINSTEIN_BIRTH_DAY; // day
        final int ALBERT_EINSTEIN_BIRTH_MONTH; // month
        final int ALBERT_EINSTEIN_BIRTH_YEAR; // year
        // deathday
        final int ALBERT_EINSTEIN_DEATH_DAY; // day
        final int ALBERT_EINSTEIN_DEATH_MONTH; // month
        final int ALBERT_EINSTEIN_DEATH_YEAR; // year
        // bank account
        final String ALBERT_EINSTEIN_BANK_ACCOUNT_NUMBER; // account number
        final int ALBERT_EINSTEIN_BANK_PIN; // pin
        final int ALBERT_EINSTEIN_BANK_BALANCE_USD; // balance
        final int ALBERT_EINSTEIN_WITHDRAWAL_AMOUNT_USD; // withdrawal amount
        // date opened
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_DAY; // day
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_MONTH; // month
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_YEAR; // year
        // date closed
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_DAY; // day
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_MONTH; // month
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_YEAR; // year

        // Birth Date
        ALBERT_EINSTEIN_BIRTH_DAY = 14; // day
        ALBERT_EINSTEIN_BIRTH_MONTH = 3; // month
        ALBERT_EINSTEIN_BIRTH_YEAR = 1879; // year

        // Death Date
        ALBERT_EINSTEIN_DEATH_DAY = 18; // day
        ALBERT_EINSTEIN_DEATH_MONTH = 4; // month
        ALBERT_EINSTEIN_DEATH_YEAR = 1955; // year

        // Bank Account
        ALBERT_EINSTEIN_BANK_ACCOUNT_NUMBER = "#abc123"; // account number
        ALBERT_EINSTEIN_BANK_PIN = 3141; // pin

        // Balance
        ALBERT_EINSTEIN_BANK_BALANCE_USD = 1000; // dollars
        ALBERT_EINSTEIN_WITHDRAWAL_AMOUNT_USD = 100; // dollars

        // Date Opened
        ALBERT_EINSTEIN_ACCOUNT_OPENED_DAY = 1; // day
        ALBERT_EINSTEIN_ACCOUNT_OPENED_MONTH = 1; // month
        ALBERT_EINSTEIN_ACCOUNT_OPENED_YEAR = 1900; // year

        // Date Closed
        ALBERT_EINSTEIN_ACCOUNT_CLOSED_DAY = 14; // day
        ALBERT_EINSTEIN_ACCOUNT_CLOSED_MONTH = 8; // month
        ALBERT_EINSTEIN_ACCOUNT_CLOSED_YEAR = 1950; // year

        // OBJECTS

        // Dates
        // birth date
        albertEinsteinBirthDate = new Date(ALBERT_EINSTEIN_BIRTH_YEAR, ALBERT_EINSTEIN_BIRTH_MONTH, ALBERT_EINSTEIN_BIRTH_DAY);
        // death date
        albertEinsteinDeathDate = new Date(ALBERT_EINSTEIN_DEATH_YEAR, ALBERT_EINSTEIN_DEATH_MONTH, ALBERT_EINSTEIN_DEATH_DAY);
        // account open date
        albertEinsteinAccountOpenedDate = new Date(ALBERT_EINSTEIN_ACCOUNT_OPENED_YEAR, ALBERT_EINSTEIN_ACCOUNT_OPENED_MONTH, ALBERT_EINSTEIN_ACCOUNT_OPENED_DAY);
        // account close date
        albertEinsteinAccountClosedDate = new Date(ALBERT_EINSTEIN_ACCOUNT_CLOSED_YEAR, ALBERT_EINSTEIN_ACCOUNT_CLOSED_MONTH, ALBERT_EINSTEIN_ACCOUNT_CLOSED_DAY);

        // Name
        albertEinsteinName = new Name("Albert", "Einstein");

        // Person
        albertEinstein = new Person(albertEinsteinName, albertEinsteinBirthDate, albertEinsteinDeathDate);

        // Bank Client
        albertEinsteinBankClient = new BankClient(albertEinsteinAccountOpenedDate, ALBERT_EINSTEIN_BANK_ACCOUNT_NUMBER, albertEinstein);

        //Bank account
        albertEinsteinBankAccount = new BankAccount(albertEinsteinBankClient, ALBERT_EINSTEIN_BANK_ACCOUNT_NUMBER, ALBERT_EINSTEIN_BANK_PIN, ALBERT_EINSTEIN_BANK_BALANCE_USD, albertEinsteinAccountOpenedDate, albertEinsteinAccountClosedDate);

        // print initials
        System.out.println(albertEinstein.getName().getInitials());

        // print full name
        System.out.println(albertEinstein.getName().getFullName());

        // print reversed name
        System.out.println(albertEinstein.getName().getReverseName());

        // print getDetails()
        System.out.println(albertEinstein.getDetails());

        // print BankClient getDetails()
        System.out.println(albertEinsteinBankAccount.getDetails());

        // withdraw $100
        albertEinsteinBankAccount.withdraw(ALBERT_EINSTEIN_WITHDRAWAL_AMOUNT_USD);

        // person object Nelson Mandela (July 18, 1918 - December 5, 2013)
        // bank account object #654321: signed up May 10, 1994 and is still open
        // pin 4664
        // balance $2000
        // Withdraw $200

        // Nelson Mandela
        // Birth Date
        final int NELSON_MANDELA_BIRTH_YEAR = 1918;
        final int NELSON_MANDELA_BIRTH_MONTH = 6;
        final int NELSON_MANDELA_BIRTH_DAY = 18;

        // Death Date
        final int NELSON_MANDELA_DEATH_YEAR = 2013;
        final int NELSON_MANDELA_DEATH_MONTH = 12;
        final int NELSON_MANDELA_DEATH_DAY = 5;

        // Signup Date
        final int NELSON_MANDELA_SIGNUP_YEAR = 1994;
        final int NELSON_MANDELA_SIGNUP_MONTH = 5;
        final int NELSON_MANDELA_SIGNUP_DAY = 10;

        // Bank balance
        final int NELSON_MANDELA_BANK_PIN = 4664;
        final int NELSON_MANDELA_BANK_BALANCE = 2000;
        final int NELSON_MANDELA_WITHDRAWAL_AMOUNT = 200;

        // Bank Account
        final String NELSON_MANDELA_CLIENTID = "NelsonM";
        final String NELSON_MANDELA_ACCOUNT_NUM = "654321";

        // Dates
        Date NelsonBirthDate = new Date(NELSON_MANDELA_BIRTH_YEAR, NELSON_MANDELA_BIRTH_MONTH, NELSON_MANDELA_BIRTH_DAY);
        Date NelsonDeathDate = new Date(NELSON_MANDELA_DEATH_YEAR, NELSON_MANDELA_DEATH_MONTH, NELSON_MANDELA_DEATH_DAY);
        Date NelsonSignupDate = new Date(NELSON_MANDELA_SIGNUP_YEAR, NELSON_MANDELA_SIGNUP_MONTH, NELSON_MANDELA_SIGNUP_DAY);
        Date NELSON_MANDELA_CLOSED_DATE = null;

        // Name
        Name NelsonMandelaName = new Name("Nelson", "Mandela");

        // Person
        Person NelsonMandelaPerson = new Person(NelsonMandelaName, NelsonBirthDate, NelsonDeathDate);

        BankClient NelsonBankClient = new BankClient(NelsonSignupDate, NELSON_MANDELA_CLIENTID, NelsonMandelaPerson);

        BankAccount NelsonBankAccount = new BankAccount(NelsonBankClient, NELSON_MANDELA_ACCOUNT_NUM, NELSON_MANDELA_BANK_PIN, NELSON_MANDELA_BANK_BALANCE, NelsonSignupDate, NELSON_MANDELA_CLOSED_DATE);

        // print initials
        System.out.println(NelsonMandelaName.getInitials());

        // print full name
        System.out.println(NelsonMandelaName.getFullName());

        // print reversedName
        System.out.println(NelsonMandelaName.getReverseName());

        // print person details
        System.out.println(NelsonMandelaPerson.getDetails());

        // print bank account details
        System.out.println(NelsonBankAccount.getDetails());

        // withdraw $200
        NelsonBankAccount.withdraw(NELSON_MANDELA_WITHDRAWAL_AMOUNT);
        // person object Frido Kahlo (July 6, 1907 - July 13, 1954)
        // BankAccount #frd123: signed up January 1, 1940 and closed July 13, 1954
        // pin 1907
        // Balance $500
        // Withdraw $50

        // Frido Kahlo
        // Birth Date
        final int FRIDO_KAHLO_BIRTH_YEAR = 1907;
        final int FRIDO_KAHLO_BIRTH_MONTH = 7;
        final int FRIDO_KAHLO_BIRTH_DAY = 6;

        // Death Date
        final int FRIDO_KAHLO_DEATH_YEAR = 1954;
        final int FRIDO_KAHLO_DEATH_MONTH = 7;
        final int FRIDO_KAHLO_DEATH_DAY = 13;

        // Signup Date
        final int FRIDO_KAHLO_SIGNUP_YEAR = 1940;
        final int FRIDO_KAHLO_SIGNUP_MONTH = 1;
        final int FRIDO_KAHLO_SIGNUP_DAY = 1;

        // Close Date
        final int FRIDO_KAHLO_CLOSED_YEAR = 1954;
        final int FRIDO_KAHLO_CLOSED_MONTH = 7;
        final int FRIDO_KAHLO_CLOSED_DAY = 13;

        // Bank Balance
        final int FRIDO_KAHLO_BANK_PIN = 1907;
        final int FRIDO_KAHLO_BANK_BALANCE = 500;
        final int FRIDO_KAHLO_BANK_WITHDRAW = 50;

        // Bank Account
        final String FRIDO_KAHLO_CLIENTID = "FridoK";
        final String FRIDO_KAHLO_ACCOUNT_NUM = "frd123";

        // Dates
        Date fridoBirthDate = new Date(FRIDO_KAHLO_BIRTH_YEAR, FRIDO_KAHLO_BIRTH_MONTH, FRIDO_KAHLO_BIRTH_DAY);
        Date fridoDeathDate = new Date(FRIDO_KAHLO_DEATH_YEAR, FRIDO_KAHLO_DEATH_MONTH, FRIDO_KAHLO_DEATH_DAY);
        Date fridoSignupDate = new Date(FRIDO_KAHLO_SIGNUP_YEAR, FRIDO_KAHLO_SIGNUP_MONTH, FRIDO_KAHLO_SIGNUP_DAY);
        Date fridoCloseDate = new Date(FRIDO_KAHLO_CLOSED_YEAR, FRIDO_KAHLO_CLOSED_MONTH, FRIDO_KAHLO_CLOSED_DAY);

        // Name
        Name fridoKahloName = new Name("Frido", "Kahlo");

        // Person
        Person fridoKahloPerson = new Person(fridoKahloName, fridoBirthDate, fridoDeathDate);

        BankClient fridoBankClient = new BankClient(fridoSignupDate, FRIDO_KAHLO_CLIENTID, fridoKahloPerson);
        BankAccount fridoBankAccount = new BankAccount(fridoBankClient, FRIDO_KAHLO_ACCOUNT_NUM, FRIDO_KAHLO_BANK_PIN, FRIDO_KAHLO_BANK_BALANCE, fridoSignupDate, fridoCloseDate);
        // print initials
        System.out.println(fridoKahloName.getInitials());

        // print full name
        System.out.println(fridoKahloName.getFullName());

        // print name reversed
        System.out.println(fridoKahloName.getReverseName());

        // print bank account details
        System.out.println(fridoBankAccount.getDetails());

        // Withdraw
        fridoBankAccount.withdraw(FRIDO_KAHLO_BANK_WITHDRAW);

        // Person object Jackie Chan (April 7, 1954 – still alive)
        // signed up October 1, 1980 and is still open
        // pin 1954
        // Balance $3000
        // withdraw $500

        // Jackie Chan
        // Birthdate
        final int JACKIE_CHAN_BIRTH_YEAR = 1954;
        final int JACKIE_CHAN_BIRTH_MONTH = 4;
        final int JACKIE_CHAN_BIRTH_DAY = 7;

        // Signup date
        final int JACKIE_CHAN_SIGNUP_YEAR = 1980;
        final int JACKIE_CHAN_SIGNUP_MONTH = 10;
        final int JACKIE_CHAN_SIGNUP_DAY = 1;

        // Bank Account
        final String JACKIE_CHAN_ACCOUNT_NUM = "chan789";
        final String JACKIE_CHAN_CLIENTID = "JackieC";

        // Bank balance
        final int JACKIE_CHAN_BANK_PIN = 1954;
        final int JACKIE_CHAN_BANK_BALANCE = 3000;
        final int JACKIE_CHAN_BANK_WITHDRAW = 500;

        // Dates
        Date jackieBirthDate = new Date(JACKIE_CHAN_BIRTH_YEAR, JACKIE_CHAN_BIRTH_MONTH, JACKIE_CHAN_BIRTH_DAY);
        Date jackieSignupDate = new Date(JACKIE_CHAN_SIGNUP_YEAR, JACKIE_CHAN_SIGNUP_MONTH, JACKIE_CHAN_SIGNUP_DAY);
        Date jackieDeathDate = null;
        Date jackieCloseDate = null;

        // Name
        Name jackieChanName = new Name("Jackie", "Chan");

        // Person
        Person jackieChanPerson = new Person(jackieChanName, jackieBirthDate, jackieDeathDate);

        BankClient jackieBankClient = new BankClient(jackieSignupDate, JACKIE_CHAN_CLIENTID, jackieChanPerson);
        BankAccount jackieBankAccount = new BankAccount(jackieBankClient, JACKIE_CHAN_ACCOUNT_NUM, JACKIE_CHAN_BANK_PIN, JACKIE_CHAN_BANK_BALANCE, jackieSignupDate, jackieCloseDate);

        // Print initials
        System.out.println(jackieChanName.getInitials());

        // Print full name
        System.out.println(jackieChanName.getFullName());

        // Print name reversed
        System.out.println(jackieChanName.getReverseName());

        // Print Bank account details
        System.out.println(jackieBankAccount.getDetails());

        // Withdraw
        jackieBankAccount.withdraw(JACKIE_CHAN_BANK_WITHDRAW, JACKIE_CHAN_BANK_PIN);
    }
}