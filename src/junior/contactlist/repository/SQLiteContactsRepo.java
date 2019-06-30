package junior.contactlist.repository;

import junior.contactlist.model.Contact;

import java.util.List;

public class SQLiteContactsRepo implements ContactsRepository {
    @Override
    public long create(Contact contact) {
        return 0;
    }

    @Override
    public Contact read(long id) {
        return null;
    }

    @Override
    public List<Contact> readAll() {
        return null;
    }

    @Override
    public void update(Contact contact) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(Contact contact) {

    }
}
