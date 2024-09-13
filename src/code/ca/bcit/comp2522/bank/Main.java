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
        // VARIABLES
        final Person      albertEinstein;
        final Name        albertEinsteinName;
        final String      albertEinsteinFirstName;
        final String      albertEinsteinLastName;
        final Date        albertEinsteinBirthDate;
        final Date        albertEinsteinDeathDate;
        final Date        albertEinsteinAccountOpenedDate;
        final Date        albertEinsteinAccountClosedDate;
        final BankClient  albertEinsteinBankClient;
        final BankAccount albertEinsteinBankAccount;

        final String nelsonMandelaFirstName;
        final String nelsonMandelaLastName;
        Date         nelsonMandelaBirthDate;
        Date         nelsonMandelaDeathDate;
        Date         nelsonMandelaSignupDate;
        Name         nelsonMandelaName;
        Person       nelsonMandelaPerson;
        BankClient   nelsonBankClient;
        BankAccount  nelsonMandelaBankAccount;

        final String fridoKahloFirstName;
        final String fridoKahloLastName;
        // birthday
        final int ALBERT_EINSTEIN_BIRTH_DAY;   // day
        final int ALBERT_EINSTEIN_BIRTH_MONTH; // month
        final int ALBERT_EINSTEIN_BIRTH_YEAR;  // year

        final int NELSON_MANDELA_BIRTH_DAY;
        final int NELSON_MANDELA_BIRTH_MONTH;
        final int NELSON_MANDELA_BIRTH_YEAR;

        final int FRIDO_KAHLO_BIRTH_DAY;
        final int FRIDO_KAHLO_BIRTH_MONTH;
        final int FRIDO_KAHLO_BIRTH_YEAR;
        // deathday
        final int ALBERT_EINSTEIN_DEATH_DAY;   // day
        final int ALBERT_EINSTEIN_DEATH_MONTH; // month
        final int ALBERT_EINSTEIN_DEATH_YEAR;  // year

        final int NELSON_MANDELA_DEATH_DAY;
        final int NELSON_MANDELA_DEATH_MONTH;
        final int NELSON_MANDELA_DEATH_YEAR;

        final int FRIDO_KAHLO_DEATH_DAY;
        final int FRIDO_KAHLO_DEATH_MONTH;
        final int FRIDO_KAHLO_DEATH_YEAR;
        // bank account
        final int    ALBERT_EINSTEIN_BANK_PIN;              // pin
        final String ALBERT_EINSTEIN_CLIENTID;              // client id
        final int    ALBERT_EINSTEIN_BANK_BALANCE_USD;      // balance
        final String ALBERT_EINSTEIN_BANK_ACCOUNT_NUM;      // account number
        final int    ALBERT_EINSTEIN_WITHDRAWAL_AMOUNT_USD; // withdrawal amount

        final int    NELSON_MANDELA_BANK_PIN;
        final String NELSON_MANDELA_CLIENTID;
        final int    NELSON_MANDELA_BANK_BALANCE_USD;
        final String NELSON_MANDELA_ACCOUNT_NUM;
        final int    NELSON_MANDELA_WITHDRAWAL_AMOUNT;
        // date opened
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_DAY;   // day
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_MONTH; // month
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_YEAR;  // year

        final int NELSON_MANDELA_SIGNUP_YEAR;
        final int NELSON_MANDELA_SIGNUP_MONTH;
        final int NELSON_MANDELA_SIGNUP_DAY;
        // date closed
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_DAY;   // day
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_MONTH; // month
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_YEAR;  // year

        Date NELSON_MANDELA_CLOSED_DATE;

        // Name
        albertEinsteinFirstName = "Albert";
        albertEinsteinLastName  = "Einstein";

        nelsonMandelaFirstName = "Nelson";
        nelsonMandelaLastName  = "Mandela";
        // Birth Date
        ALBERT_EINSTEIN_BIRTH_DAY   = 14;   // day
        ALBERT_EINSTEIN_BIRTH_MONTH = 3;    // month
        ALBERT_EINSTEIN_BIRTH_YEAR  = 1879; // year

        NELSON_MANDELA_BIRTH_DAY   = 18;
        NELSON_MANDELA_BIRTH_MONTH = 6;
        NELSON_MANDELA_BIRTH_YEAR  = 1918;

        // Death Date
        ALBERT_EINSTEIN_DEATH_DAY   = 18;   // day
        ALBERT_EINSTEIN_DEATH_MONTH = 4;    // month
        ALBERT_EINSTEIN_DEATH_YEAR  = 1955; // year

        NELSON_MANDELA_DEATH_DAY   = 5;
        NELSON_MANDELA_DEATH_MONTH = 12;
        NELSON_MANDELA_DEATH_YEAR  = 2013;
        // Bank Account
        ALBERT_EINSTEIN_CLIENTID         = "AlbertE"; // client id
        ALBERT_EINSTEIN_BANK_ACCOUNT_NUM = "#abc123"; // account number
        ALBERT_EINSTEIN_BANK_PIN         = 3141;      // pin

        NELSON_MANDELA_CLIENTID    = "NelsonM";
        NELSON_MANDELA_ACCOUNT_NUM = "654321";
        NELSON_MANDELA_BANK_PIN    = 4664;
        // Balance
        ALBERT_EINSTEIN_BANK_BALANCE_USD      = 1000; // dollars
        ALBERT_EINSTEIN_WITHDRAWAL_AMOUNT_USD = 100;  // dollars

        NELSON_MANDELA_BANK_BALANCE_USD  = 2000;
        NELSON_MANDELA_WITHDRAWAL_AMOUNT = 200;
        // Date Opened
        ALBERT_EINSTEIN_ACCOUNT_OPENED_DAY   = 1;    // day
        ALBERT_EINSTEIN_ACCOUNT_OPENED_MONTH = 1;    // month
        ALBERT_EINSTEIN_ACCOUNT_OPENED_YEAR  = 1900; // year

        NELSON_MANDELA_SIGNUP_DAY   = 10;
        NELSON_MANDELA_SIGNUP_MONTH = 5;
        NELSON_MANDELA_SIGNUP_YEAR  = 1994;

        // Date Closed
        ALBERT_EINSTEIN_ACCOUNT_CLOSED_DAY   = 14;   // day
        ALBERT_EINSTEIN_ACCOUNT_CLOSED_MONTH = 8;    // month
        ALBERT_EINSTEIN_ACCOUNT_CLOSED_YEAR  = 1950; // year

        // OBJECTS
        // Dates
        albertEinsteinBirthDate         = new Date(ALBERT_EINSTEIN_BIRTH_YEAR, ALBERT_EINSTEIN_BIRTH_MONTH, ALBERT_EINSTEIN_BIRTH_DAY);
        albertEinsteinDeathDate         = new Date(ALBERT_EINSTEIN_DEATH_YEAR, ALBERT_EINSTEIN_DEATH_MONTH, ALBERT_EINSTEIN_DEATH_DAY);
        albertEinsteinAccountOpenedDate = new Date(ALBERT_EINSTEIN_ACCOUNT_OPENED_YEAR, ALBERT_EINSTEIN_ACCOUNT_OPENED_MONTH, ALBERT_EINSTEIN_ACCOUNT_OPENED_DAY);
        albertEinsteinAccountClosedDate = new Date(ALBERT_EINSTEIN_ACCOUNT_CLOSED_YEAR, ALBERT_EINSTEIN_ACCOUNT_CLOSED_MONTH, ALBERT_EINSTEIN_ACCOUNT_CLOSED_DAY);

        nelsonMandelaDeathDate     = new Date(NELSON_MANDELA_DEATH_YEAR, NELSON_MANDELA_DEATH_MONTH, NELSON_MANDELA_DEATH_DAY);
        nelsonMandelaBirthDate     = new Date(NELSON_MANDELA_BIRTH_YEAR, NELSON_MANDELA_BIRTH_MONTH, NELSON_MANDELA_BIRTH_DAY);
        nelsonMandelaSignupDate    = new Date(NELSON_MANDELA_SIGNUP_YEAR, NELSON_MANDELA_SIGNUP_MONTH, NELSON_MANDELA_SIGNUP_DAY);
        NELSON_MANDELA_CLOSED_DATE = null;

        albertEinsteinName        = new Name(albertEinsteinFirstName, albertEinsteinLastName);
        albertEinstein            = new Person(albertEinsteinName, albertEinsteinBirthDate, albertEinsteinDeathDate);
        albertEinsteinBankClient  = new BankClient(albertEinsteinAccountOpenedDate, ALBERT_EINSTEIN_CLIENTID, albertEinstein);
        albertEinsteinBankAccount = new BankAccount(albertEinsteinBankClient, ALBERT_EINSTEIN_BANK_ACCOUNT_NUM, ALBERT_EINSTEIN_BANK_PIN, ALBERT_EINSTEIN_BANK_BALANCE_USD, albertEinsteinAccountOpenedDate, albertEinsteinAccountClosedDate);

        nelsonMandelaName        = new Name(nelsonMandelaFirstName, nelsonMandelaLastName);
        nelsonMandelaPerson      = new Person(nelsonMandelaName, nelsonMandelaBirthDate, nelsonMandelaDeathDate);
        nelsonBankClient         = new BankClient(nelsonMandelaSignupDate, NELSON_MANDELA_CLIENTID, nelsonMandelaPerson);
        nelsonMandelaBankAccount = new BankAccount(nelsonBankClient, NELSON_MANDELA_ACCOUNT_NUM, NELSON_MANDELA_BANK_PIN, NELSON_MANDELA_BANK_BALANCE_USD, nelsonMandelaSignupDate, NELSON_MANDELA_CLOSED_DATE);

        // Albert Einstein
        System.out.println(albertEinstein.getName().getInitials());    // print initials
        System.out.println(albertEinstein.getName().getFullName());    // print full name
        System.out.println(albertEinstein.getName().getReverseName()); // print reversed name
        System.out.println(albertEinstein.getDetails());               // print getDetails()
        System.out.println(albertEinsteinBankAccount.getDetails());    // print BankClient getDetails()
        albertEinsteinBankAccount.withdraw(ALBERT_EINSTEIN_WITHDRAWAL_AMOUNT_USD);

        // Nelson Mandela
        System.out.println(nelsonMandelaName.getInitials());
        System.out.println(nelsonMandelaName.getFullName());
        System.out.println(nelsonMandelaName.getReverseName());
        System.out.println(nelsonMandelaPerson.getDetails());
        System.out.println(nelsonMandelaBankAccount.getDetails());
        nelsonMandelaBankAccount.withdraw(NELSON_MANDELA_WITHDRAWAL_AMOUNT);

        // Frido Kahlo

        fridoKahloFirstName = "Frido";
        fridoKahloLastName  = "Kahlo";

        // Birth Date

        FRIDO_KAHLO_BIRTH_DAY   = 6;
        FRIDO_KAHLO_BIRTH_MONTH = 7;
        FRIDO_KAHLO_BIRTH_YEAR  = 1907;

        // Death Date

        FRIDO_KAHLO_DEATH_YEAR  = 1954;
        FRIDO_KAHLO_DEATH_MONTH = 7;
        FRIDO_KAHLO_DEATH_DAY   = 13;

        // Signup Date
        final int FRIDO_KAHLO_SIGNUP_YEAR;
        final int FRIDO_KAHLO_SIGNUP_MONTH;
        final int FRIDO_KAHLO_SIGNUP_DAY;
        FRIDO_KAHLO_SIGNUP_YEAR  = 1940;
        FRIDO_KAHLO_SIGNUP_MONTH = 1;
        FRIDO_KAHLO_SIGNUP_DAY   = 1;

        // Close Date
        final int FRIDO_KAHLO_CLOSED_YEAR;
        final int FRIDO_KAHLO_CLOSED_MONTH;
        final int FRIDO_KAHLO_CLOSED_DAY;
        FRIDO_KAHLO_CLOSED_DAY   = 13;
        FRIDO_KAHLO_CLOSED_MONTH = 7;
        FRIDO_KAHLO_CLOSED_YEAR  = 1954;

        // Bank Balance
        final int FRIDO_KAHLO_BANK_PIN;
        final int FRIDO_KAHLO_BANK_BALANCE_USD;
        final int FRIDO_KAHLO_BANK_WITHDRAW;
        FRIDO_KAHLO_BANK_PIN         = 1907;
        FRIDO_KAHLO_BANK_BALANCE_USD = 500;
        FRIDO_KAHLO_BANK_WITHDRAW    = 50;

        // Bank Account
        final String FRIDO_KAHLO_CLIENTID;
        FRIDO_KAHLO_CLIENTID = "FridoK";
        final String FRIDO_KAHLO_ACCOUNT_NUM;
        FRIDO_KAHLO_ACCOUNT_NUM = "frd123";

        // Dates
        Date fridoKahloBirthDate;
        Date fridoKahloDeathDate;
        Date fridoKahloSignupDate;
        Date fridoKahloCloseDate;
        fridoKahloBirthDate  = new Date(FRIDO_KAHLO_BIRTH_YEAR, FRIDO_KAHLO_BIRTH_MONTH, FRIDO_KAHLO_BIRTH_DAY);
        fridoKahloDeathDate  = new Date(FRIDO_KAHLO_DEATH_YEAR, FRIDO_KAHLO_DEATH_MONTH, FRIDO_KAHLO_DEATH_DAY);
        fridoKahloSignupDate = new Date(FRIDO_KAHLO_SIGNUP_YEAR, FRIDO_KAHLO_SIGNUP_MONTH, FRIDO_KAHLO_SIGNUP_DAY);
        fridoKahloCloseDate  = new Date(FRIDO_KAHLO_CLOSED_YEAR, FRIDO_KAHLO_CLOSED_MONTH, FRIDO_KAHLO_CLOSED_DAY);

        // Name
        Name fridoKahloName;
        fridoKahloName = new Name(fridoKahloFirstName, fridoKahloLastName);

        // Person
        Person fridoKahloPerson;
        fridoKahloPerson = new Person(fridoKahloName, fridoKahloBirthDate, fridoKahloDeathDate);

        BankClient  fridoBankClient;
        BankAccount fridoBankAccount;
        fridoBankClient  = new BankClient(fridoKahloSignupDate, FRIDO_KAHLO_CLIENTID, fridoKahloPerson);
        fridoBankAccount = new BankAccount(fridoBankClient, FRIDO_KAHLO_ACCOUNT_NUM, FRIDO_KAHLO_BANK_PIN, FRIDO_KAHLO_BANK_BALANCE_USD, fridoKahloSignupDate, fridoKahloCloseDate);

        System.out.println(fridoKahloName.getInitials());
        System.out.println(fridoKahloName.getFullName());
        System.out.println(fridoKahloName.getReverseName());
        System.out.println(fridoBankAccount.getDetails());
        fridoBankAccount.withdraw(FRIDO_KAHLO_BANK_WITHDRAW);

        // Jackie Chan
        final String jackieChanFirstName;
        final String jackieChanLastName;
        jackieChanFirstName = "Jackie";
        jackieChanLastName  = "Chan";
        // Birthdate
        final int JACKIE_CHAN_BIRTH_YEAR;
        final int JACKIE_CHAN_BIRTH_MONTH;
        final int JACKIE_CHAN_BIRTH_DAY;
        JACKIE_CHAN_BIRTH_YEAR  = 1954;
        JACKIE_CHAN_BIRTH_MONTH = 4;
        JACKIE_CHAN_BIRTH_DAY   = 7;

        // Signup date
        final int JACKIE_CHAN_SIGNUP_YEAR;
        final int JACKIE_CHAN_SIGNUP_MONTH;
        final int JACKIE_CHAN_SIGNUP_DAY;
        JACKIE_CHAN_SIGNUP_YEAR  = 1980;
        JACKIE_CHAN_SIGNUP_MONTH = 10;
        JACKIE_CHAN_SIGNUP_DAY   = 1;

        // Bank Account
        final String JACKIE_CHAN_ACCOUNT_NUM;
        final String JACKIE_CHAN_CLIENTID;
        JACKIE_CHAN_ACCOUNT_NUM = "chan789";
        JACKIE_CHAN_CLIENTID    = "JackieC";

        // Bank balance
        final int JACKIE_CHAN_BANK_PIN;
        final int JACKIE_CHAN_BANK_BALANCE_USD;
        final int JACKIE_CHAN_BANK_WITHDRAW;
        JACKIE_CHAN_BANK_PIN         = 1954;
        JACKIE_CHAN_BANK_BALANCE_USD = 3000;
        JACKIE_CHAN_BANK_WITHDRAW    = 500;

        // Dates
        Date jackieChanBirthDate;
        Date jackieChanSignupDate;
        Date jackieChanDeathDate;
        Date jackieChanCloseDate;
        jackieChanBirthDate  = new Date(JACKIE_CHAN_BIRTH_YEAR, JACKIE_CHAN_BIRTH_MONTH, JACKIE_CHAN_BIRTH_DAY);
        jackieChanSignupDate = new Date(JACKIE_CHAN_SIGNUP_YEAR, JACKIE_CHAN_SIGNUP_MONTH, JACKIE_CHAN_SIGNUP_DAY);
        jackieChanDeathDate  = null;
        jackieChanCloseDate  = null;

        // Name
        Name jackieChanName;
        jackieChanName = new Name(jackieChanFirstName, jackieChanLastName);

        // Person
        Person jackieChanPerson;
        jackieChanPerson = new Person(jackieChanName, jackieChanBirthDate, jackieChanDeathDate);

        BankClient  jackieChanBankClient;
        BankAccount jackieChanBankAccount;
        jackieChanBankClient  = new BankClient(jackieChanSignupDate, JACKIE_CHAN_CLIENTID, jackieChanPerson);
        jackieChanBankAccount = new BankAccount(jackieChanBankClient, JACKIE_CHAN_ACCOUNT_NUM, JACKIE_CHAN_BANK_PIN, JACKIE_CHAN_BANK_BALANCE_USD, jackieChanSignupDate, jackieChanCloseDate);

        System.out.println(jackieChanBankClient.getDetails());
        System.out.println(jackieChanName.getInitials());
        System.out.println(jackieChanName.getFullName());
        System.out.println(jackieChanName.getReverseName());
        System.out.println(jackieChanBankAccount.getDetails());
        jackieChanBankAccount.withdraw(JACKIE_CHAN_BANK_WITHDRAW, JACKIE_CHAN_BANK_PIN);
    }
}