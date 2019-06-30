package junior.contactlist.service;

import junior.contactlist.model.Colleague;
import junior.contactlist.model.Contact;
import junior.contactlist.repository.ContactsRepository;
import junior.contactlist.repository.InMemoryContactsRepo;

import java.util.List;

public class ContactService {

    private ContactsRepository contactsRepository = new InMemoryContactsRepo();

    public void createContact(Contact contact) {
        contactsRepository.create(contact);
    }

    public List<Contact> getAllContacts() {
        return contactsRepository.readAll();
    }

    public Colleague getColleagueById(int id) {
        return (Colleague) contactsRepository.read(id);
    }

    public void updateContact(Contact contact) {
        contactsRepository.update(contact);
    }

    public void deleteContact(int id) {
        contactsRepository.delete(id);
    }
}
