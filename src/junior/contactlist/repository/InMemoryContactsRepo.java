package junior.contactlist.repository;

import com.sun.istack.internal.Nullable;
import junior.contactlist.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class InMemoryContactsRepo implements ContactsRepository {

    private List<Contact> contacts = new ArrayList<>();

    @Override
    public long create(Contact contact) {
        long index = contacts.size();
        contact.setId(index);
        contacts.add(contact);

        return index;
    }

    @Override
    @Nullable
    public Contact read(long id) {
        for(Contact c : contacts) {
            if(c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    @Override
    public List<Contact> readAll() {
        List<Contact> result = new ArrayList<>(contacts.size());
        result.addAll(contacts);
        return result;
    }

    @Override
    public void update(Contact contact) {
        for(Contact c : contacts) {
            if(c.getId() == contact.getId()) {
                contacts.remove(c);
                contacts.add(Math.toIntExact(c.getId()), contact);
                break;
            }
        }
    }

    @Override
    public void delete(long id) {
        Contact toRemove = null;
        for(Contact c : contacts) {
            if(c.getId() == id) {
                toRemove = c;
                break;
            }
        }

        if(toRemove != null) {
            contacts.remove(toRemove);
        }
    }

    @Override
    public void delete(Contact contact) {

    }
}
