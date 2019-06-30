package junior.contactlist;

import junior.contactlist.controller.ConsoleController;
import junior.contactlist.controller.ContactListController;

public class App {

    public static void main(String[] args) {
        ContactListController controller = new ConsoleController();
        controller.run();
    }

}
