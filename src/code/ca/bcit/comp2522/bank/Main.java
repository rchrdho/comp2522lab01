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
        // Death Date
        final int ALBERT_EINSTEIN_BIRTH_YEAR = 1879;
        final int ALBERT_EINSTEIN_BIRTH_MONTH = 3;
        final int ALBERT_EINSTEIN_BIRTH_DAY = 14;
        Date albertEinsteinBirthDate = new Date(ALBERT_EINSTEIN_BIRTH_YEAR, ALBERT_EINSTEIN_BIRTH_MONTH, ALBERT_EINSTEIN_BIRTH_DAY);
        // Death Date
        final int ALBERT_EINSTEIN_DEATH_YEAR = 1955;
        final int ALBERT_EINSTEIN_DEATH_MONTH = 4;
        final int ALBERT_EINSTEIN_DEATH_DAY = 18;
        Date albertEinsteinDeathDate = new Date(ALBERT_EINSTEIN_DEATH_YEAR, ALBERT_EINSTEIN_DEATH_MONTH, ALBERT_EINSTEIN_DEATH_DAY);

        // Name
        Name albertEinsteinName = new Name("Albert", "Einstein");

        // Person
        Person albertEinstein = new Person(albertEinsteinName, albertEinsteinBirthDate, albertEinsteinDeathDate);

        // Bank Account
        final String ALBERT_EINSTEIN_BANK_ACCOUNT_NUMBER = "#abc123"; // account number
        final int ALBERT_EINSTEIN_BANK_PIN = 3141; // pin

        // Balance
        final int ALBERT_EINSTEIN_BANK_BALANCE = 1000; // dollars
        final int ALBERT_EINSTEIN_WITHDRAWL_AMOUNT = 100; // dollars

        // Date Opened
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_DAY = 1; // day
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_MONTH = 1; // month
        final int ALBERT_EINSTEIN_ACCOUNT_OPENED_YEAR = 1900; // year
        Date albertEinsteinAccountOpenedDate = new Date(ALBERT_EINSTEIN_ACCOUNT_OPENED_YEAR, ALBERT_EINSTEIN_ACCOUNT_OPENED_MONTH, ALBERT_EINSTEIN_ACCOUNT_OPENED_DAY);

        // Date Closed
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_DAY = 14; // day
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_MONTH = 8; // month
        final int ALBERT_EINSTEIN_ACCOUNT_CLOSED_YEAR = 1950; // year
        Date albertEinsteinAccountClosedDate = new Date(ALBERT_EINSTEIN_ACCOUNT_CLOSED_YEAR, ALBERT_EINSTEIN_ACCOUNT_CLOSED_MONTH, ALBERT_EINSTEIN_ACCOUNT_CLOSED_DAY);

        BankClient albertEinsteinBankClient = new BankClient(albertEinsteinAccountOpenedDate, ALBERT_EINSTEIN_BANK_ACCOUNT_NUMBER, albertEinstein);

        BankAccount albertEinsteinBankAccount = new BankAccount(albertEinsteinBankClient, ALBERT_EINSTEIN_BANK_ACCOUNT_NUMBER, ALBERT_EINSTEIN_BANK_PIN, ALBERT_EINSTEIN_BANK_BALANCE, albertEinsteinAccountOpenedDate, albertEinsteinAccountClosedDate);

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
        albertEinsteinBankAccount.withdraw(ALBERT_EINSTEIN_WITHDRAWL_AMOUNT);

        // Nelson Mandela
        // person object Nelson Mandela (July 18, 1918 - December 5, 2013)
        // BankAccount #654321: signed up May 10, 1994 and is still open
        // pin 4664
        // balance $2000

        // print initials

        // print full name

        // print reversed name

        // print getDetails()

        // print BankClient getDetails()

        // withdraw $200

        // Frido Kahlo
        // person object Frido Kahlo (July 6, 1907 - July 13, 1954)
        // BankAccount #frd123: signed up January 1, 1940 and closed July 13, 1954
        // pin frd123

        // print initials

        // print full name

        // print reversed name

        // print getDetails()

        // print BankClient getDetails()

        // withdraw $50

        // Jackie Chan
        // person object Jackie Chan (April 7, 1954 - still alive)
        // BankAccount #chan789: signed up October 1, 1980 and is still open
        // pin chan789
        // balance $3000

        // print initials

        // print full name

        // print reversed name

        // print getDetails()

        // print BankClient getDetails()

        // withdraw $500

    }
}