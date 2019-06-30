package junior.contactlist.controller;

import junior.contactlist.model.Colleague;
import junior.contactlist.model.Contact;
import junior.contactlist.service.ContactService;
import junior.contactlist.view.ConsoleView;

public class ConsoleController implements ContactListController {

    private ConsoleView view = new ConsoleView();
    private ContactService contactService = new ContactService();

    @Override
    public void run() {
        view.showWelcome();

        while(true) {
            view.showMainMenu();
            int selectedOption = view.getSelection();

            switch (selectedOption) {
                case ConsoleView.CREATE:
                    createContact();
                    break;

                case ConsoleView.LIST:
                    listContacts();
                    break;

                case ConsoleView.UPDATE:
                    updateContact();
                    break;

                case ConsoleView.DELETE:
                    deleteContact();
                    break;

                case ConsoleView.EXIT:
                    view.bye();
                    System.exit(0);
                    break;

                default:
                    view.showUnSupportedOptionMessage();
                    view.waitForKeyStroke();
            }

        }
    }

    private void listContacts() {
        view.listContacts(contactService.getAllContacts());
    }

    private void createContact() {
        view.reset();

        Colleague colleague = new Colleague();

        colleague.setFirstName(view.askFirstName());
        colleague.setLastName(view.askLastName());
        colleague.setDepartment(view.askDepartment());
        colleague.setCompany(view.askCompany());
        colleague.setEmail(view.askEmail());
        colleague.setPhone(view.askPhone());

        contactService.createContact(colleague);
    }

    private void updateContact() {
        Colleague colleague = contactService.getColleagueById(view.askContactId());
        view.reset();

        colleague.setFirstName(view.askFirstName());
        colleague.setLastName(view.askLastName());
        colleague.setDepartment(view.askDepartment());
        colleague.setCompany(view.askCompany());
        colleague.setEmail(view.askEmail());
        colleague.setPhone(view.askPhone());

        contactService.updateContact(colleague);
    }

    private void deleteContact() {
        contactService.deleteContact(view.askContactId());
    }
}
