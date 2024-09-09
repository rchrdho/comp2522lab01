package ca.bcit.comp2522.bank;

public class Main
{
    public static void main(String[] args)
    {

        // creat BankAccount objects for

        // Albert Einstein
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

        final int ALBERT_EINSTEIN_BIRTH_YEAR;
        final int ALBERT_EINSTEIN_BIRTH_MONTH;
        final int ALBERT_EINSTEIN_BIRTH_DAY;

        final int ALBERT_EINSTEIN_DEATH_YEAR;
        final int ALBERT_EINSTEIN_DEATH_MONTH;
        final int ALBERT_EINSTEIN_DEATH_DAY;

        final String ALBERT_EINSTEIN_BANK_ACCOUNT_NUMBER;
        final int ALBERT_EINSTEIN_BANK_PIN;
        final int ALBERT_EINSTEIN_BANK_BALANCE_USD;
        final int ALBERT_EINSTEIN_WITHDRAWAL_AMOUNT_USD;

        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_DAY;
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_MONTH;
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_YEAR;

        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_DAY;
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_MONTH;
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_YEAR;

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

        final int NELSON_BIRTH_YEAR = 1918;
        final int NELSON_BIRTH_MONTH = 6;
        final int NELSON_BIRTH_DAY = 18;

        final int NELSON_DEATH_YEAR = 2013;
        final int NELSON_DEATH_MONTH = 12;
        final int NELSON_DEATH_DAY = 5;

        final int NELSON_SIGNUP_YEAR = 1994;
        final int NELSON_SIGNUP_MONTH = 5;
        final int NELSON_SIGNUP_DAY = 10;

        final int NELSON_BANK_PIN = 4664;
        final int NELSON_BANK_BALANCE = 2000;
        final int NELSON_WITHDRAWAL_AMOUNT = 200;

        final String NELSON_CLIENTID = "NelsonM";
        final String NELSON_ACCOUNT_NUM = "654321";

        Date NelsonBirthDate = new Date(NELSON_BIRTH_YEAR, NELSON_BIRTH_MONTH, NELSON_BIRTH_DAY);
        Date NelsonDeathDate = new Date(NELSON_DEATH_YEAR, NELSON_DEATH_MONTH, NELSON_DEATH_DAY);
        Date NelsonSignupDate = new Date(NELSON_SIGNUP_YEAR, NELSON_SIGNUP_MONTH, NELSON_SIGNUP_DAY);

        Name NelsonMandelaName = new Name("Nelson", "Mandela");
        Person NelsonMandelaPerson = new Person(NelsonMandelaName, NelsonBirthDate, NelsonDeathDate);

        BankClient NelsonBankClient = new BankClient(NelsonSignupDate, NELSON_CLIENTID, NelsonMandelaPerson);
        BankAccount NelsonBankAccount = new BankAccount(NelsonBankClient, NELSON_ACCOUNT_NUM, NELSON_BANK_PIN, NELSON_BANK_BALANCE, NelsonSignupDate, null);

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
        NelsonBankAccount.withdraw(NELSON_WITHDRAWAL_AMOUNT);

        // Frido Kahlo
        // person object Frido Kahlo (July 6, 1907 - July 13, 1954)
        // BankAccount #frd123: signed up January 1, 1940 and closed July 13, 1954
        // pin 1907

        final int FRIDO_BIRTH_YEAR = 1907;
        final int FRIDO_BIRTH_MONTH = 7;
        final int FRIDO_BIRTH_DAY = 6;

        final int FRIDO_DEATH_YEAR = 1954;
        final int FRIDO_DEATH_MONTH = 7;
        final int FRIDO_DEATH_DAY = 13;

        final int FRIDO_SIGNUP_YEAR = 1940;
        final int FRIDO_SIGNUP_MONTH = 1;
        final int FRIDO_SIGNUP_DAY = 1;

        final int FRIDO_CLOSED_YEAR = 1954;
        final int FRIDO_CLOSED_MONTH = 7;
        final int FRIDO_CLOSED_DAY = 13;

        final int FRIDO_BANK_PIN = 1907;
        final int FRIDO_BANK_BALANCE = 500;
        final int FRIDO_BANK_WITHDRAW = 50;

        final String FRIDO_CLIENTID = "FridoK";
        final String FRIDO_ACCOUNT_NUM = "frd123";

        Date fridoBirthDate = new Date(FRIDO_BIRTH_YEAR, FRIDO_BIRTH_MONTH, FRIDO_BIRTH_DAY);
        Date fridoDeathDate = new Date(FRIDO_DEATH_YEAR, FRIDO_DEATH_MONTH, FRIDO_DEATH_DAY);
        Date fridoSignupDate = new Date(FRIDO_SIGNUP_YEAR, FRIDO_SIGNUP_MONTH, FRIDO_SIGNUP_DAY);
        Date fridoCloseDate = new Date(FRIDO_CLOSED_YEAR, FRIDO_CLOSED_MONTH, FRIDO_CLOSED_DAY);
        Name fridoKahloName = new Name("Frido", "Kahlo");

        Person fridoKahloPerson = new Person(fridoKahloName, fridoBirthDate, fridoDeathDate);
        BankClient fridoBankClient = new BankClient(fridoSignupDate, FRIDO_CLIENTID, fridoKahloPerson);
        BankAccount fridoBankAccount = new BankAccount(fridoBankClient, FRIDO_ACCOUNT_NUM, FRIDO_BANK_PIN, FRIDO_BANK_BALANCE, fridoSignupDate, fridoCloseDate);

        System.out.println(fridoKahloName.getInitials());
        System.out.println(fridoKahloName.getFullName());
        System.out.println(fridoKahloName.getReverseName());
        System.out.println(fridoBankAccount.getDetails());
        fridoBankAccount.withdraw(FRIDO_BANK_WITHDRAW);

        final int JACKIE_BIRTH_YEAR = 1954;
        final int JACKIE_BIRTH_MONTH = 4;
        final int JACKIE_BIRTH_DAY = 7;

        final int JACKIE_SIGNUP_YEAR = 1980;
        final int JACKIE_SIGNUP_MONTH = 10;
        final int JACKIE_SIGNUP_DAY = 1;

        final String JACKIE_ACCOUNT_NUM = "chan789";
        final String JACKIE_CLIENTID = "JackieC";

        final int JACKIE_BANK_PIN = 1954;
        final int JACKIE_BANK_BALANCE = 3000;
        final int JACKIE_BANK_WITHDRAW = 500;

        Date jackieBirthDate = new Date(JACKIE_BIRTH_YEAR, JACKIE_BIRTH_MONTH, JACKIE_BIRTH_DAY);
        Date jackieSignupDate = new Date(JACKIE_SIGNUP_YEAR, JACKIE_SIGNUP_MONTH, JACKIE_SIGNUP_DAY);

        Name jackieChanName = new Name("Jackie", "Chan");
        Person jackieChanPerson = new Person(jackieChanName, jackieBirthDate, null);

        BankClient jackieBankClient = new BankClient(jackieSignupDate, JACKIE_CLIENTID, jackieChanPerson);
        BankAccount jackieBankAccount = new BankAccount(jackieBankClient, JACKIE_ACCOUNT_NUM, JACKIE_BANK_PIN, JACKIE_BANK_BALANCE, jackieSignupDate, null);

        System.out.println(jackieChanName.getInitials());
        System.out.println(jackieChanName.getFullName());
        System.out.println(jackieChanName.getReverseName());
        System.out.println(jackieBankAccount.getDetails());

        jackieBankAccount.withdraw(JACKIE_BANK_WITHDRAW, JACKIE_BANK_PIN);
    }
}