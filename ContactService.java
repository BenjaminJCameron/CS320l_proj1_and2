package contactservice;

import java.util.HashMap;

public class ContactService {
    private HashMap<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Duplicate contact ID");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    public void updateFirstName(String contactId, String firstName) {
        contacts.get(contactId).setFirstName(firstName);
    }

    public void updateLastName(String contactId, String lastName) {
        contacts.get(contactId).setLastName(lastName);
    }

    public void updatePhone(String contactId, String phone) {
        contacts.get(contactId).setPhone(phone);
    }

    public void updateAddress(String contactId, String address) {
        contacts.get(contactId).setAddress(address);
    }

    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}