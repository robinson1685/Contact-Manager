import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Mark on 3/23/2015.
 */
public class Main {
    static Scanner input = new Scanner(System.in);
    private ArrayList<Contact> al = new ArrayList<Contact>();

    public static void main(String[] args) {

        ArrayList<Contact> contactlist = new ArrayList<Contact>();
        //These are used before putting them in the object

        int choice;

        //Have a running loop
        boolean running = true;
        while (running) {
            System.out.println("\nWhat would you like to do?\n");
            //Display a menu
            printMainMenu();
            System.out.println("Please enter the number of you choice: ");

            // Choices
            choice = getInput(4);
            switch (choice) {
                case 0: //Invalid input
                    break;
                case 1: //Add new contact
                    printAddContactMenu();
                    System.out.println();
                    choice = getInput(3);
                    switch (choice) {
                        case 0: //Invalid input
                            break;
                        case 1: //Add a Contact object to the contact list
                            contactlist.add(getNewContact());
                            break;
                        case 2: //Add a friend object
                            contactlist.add(getNewFriend());
                            break;
                        case 3: //Cancel adding contact
                            System.out.println("Returning to main menu...");
                            break;
                    }
                    waitForInput();
                    break;
                case 2: //Look up contact by  last name
                    searchLast ();
                    break;
                case 3: //Delete contact
                    break;
                case 4: //Exit program
                    System.out.println("Exiting program....");
                    running = false;
            }
        }
    }

    private static int getInput(int maxChoices) {
        int choice = 0;
        try {
            //Ask the user of an integer input
            choice = input.nextInt();
        } catch (InputMismatchException e) {
            choice = 0;
        } finally {
            input.nextLine();

            if (choice > 4 || choice < 1) {
                System.out.println("\n Error: Please enter a valid input.\n");
                choice = 0;
            }
        }
        return choice;
    }

    //Gui methods
    //Display a menu
    private static void printMainMenu() {
        System.out.println("" +
                "1. Add a new contact\n" + "2. Look up contact by last name\n" + "3. Delete a contact\n" +
                "4. Exit the program ");
    }

    private static void printAddContactMenu() {
        System.out.println("1. Acquaintance \n" + "2. Friend\n" + "3. Cancel\n");

    }

    //Wait for the user to press enter
    private static void waitForInput() {
        System.out.println("Press the enter key...");
        input.nextLine();
    }

    //create new contact
    public static Contact getNewContact() {

        String firstNameHolder;
        String lastNameHolder;
        String streetHolder;
        String cityHolder;
        String stateHolder;
        String zipHolder;
        String birthdateHolder;
        Address addressHolder;

        System.out.println("Please full out the following fields:");
        System.out.println("First Name");
        firstNameHolder = input.nextLine();
        System.out.println("Last Name");
        lastNameHolder = input.nextLine();
        System.out.println("Street");
        streetHolder = input.nextLine();
        System.out.println("City");
        cityHolder = input.nextLine();
        System.out.println("State");
        stateHolder = input.nextLine();
        System.out.println("Zip");
        zipHolder = input.nextLine();
        System.out.println("Birthday");
        birthdateHolder = input.nextLine();

        addressHolder = new Address(streetHolder, cityHolder, stateHolder, zipHolder);
        return new Contact(addressHolder, firstNameHolder, lastNameHolder, birthdateHolder);
    }

    public static Contact getNewFriend() {

        String firstNameHolder;
        String lastNameHolder;
        String streetHolder;
        String cityHolder;
        String stateHolder;
        String zipHolder;
        String birthdateHolder;
        String emailHolder;
        Address addressHolder;

        System.out.println("Please full out the following fields:");
        System.out.println("First Name");
        firstNameHolder = input.nextLine();
        System.out.println("Last Name");
        lastNameHolder = input.nextLine();
        System.out.print("Email");
        emailHolder = input.nextLine();
        System.out.println("Street");
        streetHolder = input.nextLine();
        System.out.println("City");
        cityHolder = input.nextLine();
        System.out.println("State");
        stateHolder = input.nextLine();
        System.out.println("Zip");
        zipHolder = input.nextLine();
        System.out.println("Birthday");
        birthdateHolder = input.nextLine();

        addressHolder = new Address(streetHolder, cityHolder, stateHolder, zipHolder);
        return new Friend(addressHolder, firstNameHolder, lastNameHolder, birthdateHolder, emailHolder);
    }

    public static void searchLast ()    {
        ArrayList<Contact> al = new ArrayList<Contact>();
        Scanner search = new Scanner(System.in);
        System.out.println("Enter a last name to search: ");
        String name = search.next();
        for (Contact p : al) {
            if (p.getLastName() == name) {
                System.out.println("The contact was found.");
            } else {
                System.out.println("Contact was not found");
            }
        }
    }
}
