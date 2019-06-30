package junior.contactlist.view;

import junior.contactlist.model.Contact;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {

    public static final int CREATE = 1;
    public static final int LIST = 2;
    public static final int UPDATE = 3;
    public static final int DELETE = 4;
    public static final int EXIT = 5;
    public static final int UNSUPPORTED = -1;

    private Scanner scanner = new Scanner(System.in);

    public void showWelcome() {
        System.out.println("");
        System.out.println("Hello to Contact List App");
        System.out.println("-------------------------");
        System.out.println("");
    }

    public void showMainMenu() {
        System.out.println("");
        System.out.println("Please select one of the options to continue:");
        System.out.println("[" + CREATE + "] Create contact");
        System.out.println("[" + LIST + "] List contacts");
        System.out.println("[" + UPDATE + "] Update contact");
        System.out.println("[" + DELETE + "] Delete contact");
        System.out.println("[" + EXIT + "] Exit");
        System.out.println("");
    }

    public int getSelection() {
        System.out.print("Your selection: ");

        try{
            return Integer.parseInt(scanner.next());
        } catch (Exception ignored){}

        return UNSUPPORTED;
    }

    public void reset() {
        scanner.nextLine();
    }

    public String askFirstName() {
        System.out.print("First name: ");
        return scanner.nextLine();
    }

    public String askLastName() {
        System.out.print("Last name : ");
        return scanner.nextLine();
    }

    public String askDepartment() {
        System.out.print("Department : ");
        return scanner.nextLine();
    }

    public String askCompany() {
        System.out.print("Company : ");
        return scanner.nextLine();
    }

    public String askEmail() {
        System.out.print("Email : ");
        return scanner.nextLine();
    }

    public String askPhone() {
        System.out.print("Phone : ");
        return scanner.nextLine();
    }

    public int askContactId() {
        System.out.print("Please input a contact id to proceed : ");
        return scanner.nextInt();
    }

    public void showUnSupportedOptionMessage() {
        System.out.println("");
        System.out.println("We are sorry, but this option is not supported");
        System.out.println("..but this might change in the future releases!");
        System.out.println("-----------------------------------------------");
        System.out.println("");
    }

    public void waitForKeyStroke() {
        System.out.println("");
        System.out.println("press any key to continue..");
        System.out.println("");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listContacts(List<Contact> allContacts) {
        System.out.println("");
        System.out.println("Listing all contacts: ");
        System.out.println("");
        for (Contact contact : allContacts) {
            System.out.println("Contact #" + contact.getId());
            System.out.println(contact.toString());
            System.out.print("");
        }

        System.out.println("");
        System.out.println("------------------------");
        System.out.println("");
    }

    public void bye() {
        System.out.println("Thanks for using contact list!");
        System.out.println("See you soon!");
    }
}
