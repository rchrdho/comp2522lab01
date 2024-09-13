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
        final Person      albertEinstein;                  // person
        final Name        albertEinsteinName;              // name
        final String      albertEinsteinFirstName;         // first
        final String      albertEinsteinLastName;          // last
        final Date        albertEinsteinBirthDate;         // birth
        final Date        albertEinsteinDeathDate;         // death
        final Date        albertEinsteinAccountOpenedDate; // opened
        final Date        albertEinsteinAccountClosedDate; // closed
        final BankClient  albertEinsteinBankClient;        // bank client
        final BankAccount albertEinsteinBankAccount;       // bank account
        final Person      nelsonMandela;
        final Name        nelsonMandelaName;
        final String      nelsonMandelaFirstName;
        final String      nelsonMandelaLastName;
        final Date        nelsonMandelaBirthDate;
        final Date        nelsonMandelaDeathDate;
        final Date        nelsonMandelaAccountOpenedDate;
        final Date        nelsonMandelaAccountClosedDate;
        final BankClient  nelsonMandelaBankClient;
        final BankAccount nelsonMandelaBankAccount;
        final Person      fridoKahlo;
        final Name        fridoKahloName;
        final String      fridoKahloFirstName;
        final String      fridoKahloLastName;
        final Date        fridoKahloBirthDate;
        final Date        fridoKahloDeathDate;
        final Date        fridoKahloAccountOpenedDate;
        final Date        fridoKahloAccountClosedDate;
        final BankClient  fridoKahloBankClient;
        final BankAccount fridoKahloBankAccount;
        final Person      jackieChan;
        final Name        jackieChanName;
        final String      jackieChanFirstName;
        final String      jackieChanLastName;
        final Date        jackieChanBirthDate;
        final Date        jackieChanDeathDate;
        final Date        jackieChanAccountOpenedDate;
        final Date        jackieChanAccountClosedDate;
        final BankClient  jackieChanBankClient;
        final BankAccount jackieChanBankAccount;

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
        final int JACKIE_CHAN_BIRTH_DAY;
        final int JACKIE_CHAN_BIRTH_MONTH;
        final int JACKIE_CHAN_BIRTH_YEAR;

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
        final String NELSON_MANDELA_BANK_ACCOUNT_NUM;
        final int    NELSON_MANDELA_WITHDRAWAL_AMOUNT_USD;
        final int    FRIDO_KAHLO_BANK_PIN;
        final String FRIDO_KAHLO_CLIENTID;
        final int    FRIDO_KAHLO_BANK_BALANCE_USD;
        final String FRIDO_KAHLO_ACCOUNT_NUM;
        final int    FRIDO_KAHLO_WITHDRAWAL_AMOUNT_USD;
        final int    JACKIE_CHAN_BANK_PIN;
        final String JACKIE_CHAN_CLIENTID;
        final int    JACKIE_CHAN_BANK_BALANCE_USD;
        final String JACKIE_CHAN_BANK_ACCOUNT_NUMBER;
        final int    JACKIE_CHAN_WITHDRAWAL_AMOUNT_USD;

        // date opened
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_DAY;   // day
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_MONTH; // month
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_YEAR;  // year
        final int NELSON_MANDELA_ACCOUNT_OPENED_DAY;
        final int NELSON_MANDELA_ACCOUNT_OPENED_MONTH;
        final int NELSON_MANDELA_ACCOUNT_OPENED_YEAR;
        final int FRIDO_KAHLO_ACCOUNT_OPENED_DAY;
        final int FRIDO_KAHLO_ACCOUNT_OPENED_MONTH;
        final int FRIDO_KAHLO_ACCOUNT_OPENED_YEAR;
        final int JACKIE_CHAN_ACCOUNT_OPENED_DAY;
        final int JACKIE_CHAN_ACCOUNT_OPENED_MONTH;
        final int JACKIE_CHAN_ACCOUNT_OPENED_YEAR;

        // date closed
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_DAY;   // day
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_MONTH; // month
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_YEAR;  // year
        final int FRIDO_KAHLO_ACCOUNT_CLOSED_DAY;
        final int FRIDO_KAHLO_ACCOUNT_CLOSED_MONTH;
        final int FRIDO_KAHLO_ACCOUNT_CLOSED_YEAR;

        // Name
        albertEinsteinFirstName = "Albert";
        albertEinsteinLastName  = "Einstein";
        nelsonMandelaFirstName  = "Nelson";
        nelsonMandelaLastName   = "Mandela";
        fridoKahloFirstName     = "Frido";
        fridoKahloLastName      = "Kahlo";
        jackieChanFirstName     = "Jackie";
        jackieChanLastName      = "Chan";

        // Birth Date
        ALBERT_EINSTEIN_BIRTH_DAY   = 14;   // day
        ALBERT_EINSTEIN_BIRTH_MONTH = 3;    // month
        ALBERT_EINSTEIN_BIRTH_YEAR  = 1879; // year
        NELSON_MANDELA_BIRTH_DAY    = 18;
        NELSON_MANDELA_BIRTH_MONTH  = 6;
        NELSON_MANDELA_BIRTH_YEAR   = 1918;
        FRIDO_KAHLO_BIRTH_DAY       = 6;
        FRIDO_KAHLO_BIRTH_MONTH     = 7;
        FRIDO_KAHLO_BIRTH_YEAR      = 1907;
        JACKIE_CHAN_BIRTH_DAY       = 7;
        JACKIE_CHAN_BIRTH_MONTH     = 4;
        JACKIE_CHAN_BIRTH_YEAR      = 1954;

        // Death Date
        ALBERT_EINSTEIN_DEATH_DAY   = 18;   // day
        ALBERT_EINSTEIN_DEATH_MONTH = 4;    // month
        ALBERT_EINSTEIN_DEATH_YEAR  = 1955; // year
        NELSON_MANDELA_DEATH_DAY    = 5;
        NELSON_MANDELA_DEATH_MONTH  = 12;
        NELSON_MANDELA_DEATH_YEAR   = 2013;
        FRIDO_KAHLO_DEATH_DAY       = 13;
        FRIDO_KAHLO_DEATH_MONTH     = 7;
        FRIDO_KAHLO_DEATH_YEAR      = 1954;

        // Bank Account
        ALBERT_EINSTEIN_CLIENTID              = "AlbertE"; // client id
        ALBERT_EINSTEIN_BANK_ACCOUNT_NUM      = "#abc123"; // account number
        ALBERT_EINSTEIN_BANK_PIN              = 3141;      // pin
        ALBERT_EINSTEIN_BANK_BALANCE_USD      = 1000;  // balance
        ALBERT_EINSTEIN_WITHDRAWAL_AMOUNT_USD = 100;   // withdrawal
        NELSON_MANDELA_CLIENTID               = "NelsonM";
        NELSON_MANDELA_BANK_ACCOUNT_NUM       = "654321";
        NELSON_MANDELA_BANK_PIN               = 4664;
        NELSON_MANDELA_BANK_BALANCE_USD       = 2000;
        NELSON_MANDELA_WITHDRAWAL_AMOUNT_USD  = 200;
        FRIDO_KAHLO_CLIENTID                  = "FridoK";
        FRIDO_KAHLO_ACCOUNT_NUM               = "frd123";
        FRIDO_KAHLO_BANK_PIN                  = 1907;
        FRIDO_KAHLO_BANK_BALANCE_USD          = 500;
        FRIDO_KAHLO_WITHDRAWAL_AMOUNT_USD     = 50;
        JACKIE_CHAN_CLIENTID                  = "JackieC";
        JACKIE_CHAN_BANK_ACCOUNT_NUMBER       = "chan789";
        JACKIE_CHAN_BANK_PIN                  = 1954;
        JACKIE_CHAN_BANK_BALANCE_USD          = 3000;
        JACKIE_CHAN_WITHDRAWAL_AMOUNT_USD     = 500;

        // Date Opened
        ALBERT_EINSTEIN_ACCOUNT_OPENED_DAY   = 1;    // day
        ALBERT_EINSTEIN_ACCOUNT_OPENED_MONTH = 1;    // month
        ALBERT_EINSTEIN_ACCOUNT_OPENED_YEAR  = 1900; // year
        NELSON_MANDELA_ACCOUNT_OPENED_DAY    = 10;
        NELSON_MANDELA_ACCOUNT_OPENED_MONTH  = 5;
        NELSON_MANDELA_ACCOUNT_OPENED_YEAR   = 1994;
        FRIDO_KAHLO_ACCOUNT_OPENED_DAY       = 1;
        FRIDO_KAHLO_ACCOUNT_OPENED_MONTH     = 1;
        FRIDO_KAHLO_ACCOUNT_OPENED_YEAR      = 1940;
        JACKIE_CHAN_ACCOUNT_OPENED_DAY       = 1;
        JACKIE_CHAN_ACCOUNT_OPENED_MONTH     = 10;
        JACKIE_CHAN_ACCOUNT_OPENED_YEAR      = 1980;

        // Date Closed
        ALBERT_EINSTEIN_ACCOUNT_CLOSED_DAY   = 14;   // day
        ALBERT_EINSTEIN_ACCOUNT_CLOSED_MONTH = 8;    // month
        ALBERT_EINSTEIN_ACCOUNT_CLOSED_YEAR  = 1950; // year
        FRIDO_KAHLO_ACCOUNT_CLOSED_DAY       = 13;
        FRIDO_KAHLO_ACCOUNT_CLOSED_MONTH     = 7;
        FRIDO_KAHLO_ACCOUNT_CLOSED_YEAR      = 1954;

        // OBJECTS
        // Dates
        albertEinsteinBirthDate         = new Date(ALBERT_EINSTEIN_BIRTH_YEAR, ALBERT_EINSTEIN_BIRTH_MONTH, ALBERT_EINSTEIN_BIRTH_DAY);
        albertEinsteinDeathDate         = new Date(ALBERT_EINSTEIN_DEATH_YEAR, ALBERT_EINSTEIN_DEATH_MONTH, ALBERT_EINSTEIN_DEATH_DAY);
        albertEinsteinAccountOpenedDate = new Date(ALBERT_EINSTEIN_ACCOUNT_OPENED_YEAR, ALBERT_EINSTEIN_ACCOUNT_OPENED_MONTH, ALBERT_EINSTEIN_ACCOUNT_OPENED_DAY);
        albertEinsteinAccountClosedDate = new Date(ALBERT_EINSTEIN_ACCOUNT_CLOSED_YEAR, ALBERT_EINSTEIN_ACCOUNT_CLOSED_MONTH, ALBERT_EINSTEIN_ACCOUNT_CLOSED_DAY);
        albertEinsteinName              = new Name(albertEinsteinFirstName, albertEinsteinLastName);
        albertEinstein                  = new Person(albertEinsteinName, albertEinsteinBirthDate, albertEinsteinDeathDate);
        albertEinsteinBankClient        = new BankClient(albertEinsteinAccountOpenedDate, ALBERT_EINSTEIN_CLIENTID, albertEinstein);
        albertEinsteinBankAccount       = new BankAccount(albertEinsteinBankClient, ALBERT_EINSTEIN_BANK_ACCOUNT_NUM, ALBERT_EINSTEIN_BANK_PIN, ALBERT_EINSTEIN_BANK_BALANCE_USD, albertEinsteinAccountOpenedDate, albertEinsteinAccountClosedDate);
        nelsonMandelaBirthDate          = new Date(NELSON_MANDELA_BIRTH_YEAR, NELSON_MANDELA_BIRTH_MONTH, NELSON_MANDELA_BIRTH_DAY);
        nelsonMandelaDeathDate          = new Date(NELSON_MANDELA_DEATH_YEAR, NELSON_MANDELA_DEATH_MONTH, NELSON_MANDELA_DEATH_DAY);
        nelsonMandelaAccountOpenedDate  = new Date(NELSON_MANDELA_ACCOUNT_OPENED_YEAR, NELSON_MANDELA_ACCOUNT_OPENED_MONTH, NELSON_MANDELA_ACCOUNT_OPENED_DAY);
        nelsonMandelaAccountClosedDate  = null;
        nelsonMandelaName               = new Name(nelsonMandelaFirstName, nelsonMandelaLastName);
        nelsonMandela                   = new Person(nelsonMandelaName, nelsonMandelaBirthDate, nelsonMandelaDeathDate);
        nelsonMandelaBankClient         = new BankClient(nelsonMandelaAccountOpenedDate, NELSON_MANDELA_CLIENTID, nelsonMandela);
        nelsonMandelaBankAccount        = new BankAccount(nelsonMandelaBankClient, NELSON_MANDELA_BANK_ACCOUNT_NUM, NELSON_MANDELA_BANK_PIN, NELSON_MANDELA_BANK_BALANCE_USD, nelsonMandelaAccountOpenedDate, nelsonMandelaAccountClosedDate);
        fridoKahloBirthDate             = new Date(FRIDO_KAHLO_BIRTH_YEAR, FRIDO_KAHLO_BIRTH_MONTH, FRIDO_KAHLO_BIRTH_DAY);
        fridoKahloDeathDate             = new Date(FRIDO_KAHLO_DEATH_YEAR, FRIDO_KAHLO_DEATH_MONTH, FRIDO_KAHLO_DEATH_DAY);
        fridoKahloAccountOpenedDate     = new Date(FRIDO_KAHLO_ACCOUNT_OPENED_YEAR, FRIDO_KAHLO_ACCOUNT_OPENED_MONTH, FRIDO_KAHLO_ACCOUNT_OPENED_DAY);
        fridoKahloAccountClosedDate     = new Date(FRIDO_KAHLO_ACCOUNT_CLOSED_YEAR, FRIDO_KAHLO_ACCOUNT_CLOSED_MONTH, FRIDO_KAHLO_ACCOUNT_CLOSED_DAY);
        fridoKahloName                  = new Name(fridoKahloFirstName, fridoKahloLastName);
        fridoKahlo                      = new Person(fridoKahloName, fridoKahloBirthDate, fridoKahloDeathDate);
        fridoKahloBankClient            = new BankClient(fridoKahloAccountOpenedDate, FRIDO_KAHLO_CLIENTID, fridoKahlo);
        fridoKahloBankAccount           = new BankAccount(fridoKahloBankClient, FRIDO_KAHLO_ACCOUNT_NUM, FRIDO_KAHLO_BANK_PIN, FRIDO_KAHLO_BANK_BALANCE_USD, fridoKahloAccountOpenedDate, fridoKahloAccountClosedDate);
        jackieChanBirthDate             = new Date(JACKIE_CHAN_BIRTH_YEAR, JACKIE_CHAN_BIRTH_MONTH, JACKIE_CHAN_BIRTH_DAY);
        jackieChanDeathDate             = null;
        jackieChanAccountOpenedDate     = new Date(JACKIE_CHAN_ACCOUNT_OPENED_YEAR, JACKIE_CHAN_ACCOUNT_OPENED_MONTH, JACKIE_CHAN_ACCOUNT_OPENED_DAY);
        jackieChanAccountClosedDate     = null;
        jackieChanName                  = new Name(jackieChanFirstName, jackieChanLastName);
        jackieChan                      = new Person(jackieChanName, jackieChanBirthDate, jackieChanDeathDate);
        jackieChanBankClient            = new BankClient(jackieChanAccountOpenedDate, JACKIE_CHAN_CLIENTID, jackieChan);
        jackieChanBankAccount           = new BankAccount(jackieChanBankClient, JACKIE_CHAN_BANK_ACCOUNT_NUMBER, JACKIE_CHAN_BANK_PIN, JACKIE_CHAN_BANK_BALANCE_USD, jackieChanAccountOpenedDate, jackieChanAccountClosedDate);

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
        System.out.println(nelsonMandela.getDetails());
        System.out.println(nelsonMandelaBankAccount.getDetails());
        nelsonMandelaBankAccount.withdraw(NELSON_MANDELA_WITHDRAWAL_AMOUNT_USD);

        // Frido kahlo
        System.out.println(fridoKahloName.getInitials());
        System.out.println(fridoKahloName.getFullName());
        System.out.println(fridoKahloName.getReverseName());
        System.out.println(fridoKahloBankAccount.getDetails());
        fridoKahloBankAccount.withdraw(FRIDO_KAHLO_WITHDRAWAL_AMOUNT_USD);

        // Jackie Chan
        System.out.println(jackieChanBankClient.getDetails());
        System.out.println(jackieChanName.getInitials());
        System.out.println(jackieChanName.getFullName());
        System.out.println(jackieChanName.getReverseName());
        System.out.println(jackieChanBankAccount.getDetails());
        jackieChanBankAccount.withdraw(JACKIE_CHAN_WITHDRAWAL_AMOUNT_USD, JACKIE_CHAN_BANK_PIN);
    }
}