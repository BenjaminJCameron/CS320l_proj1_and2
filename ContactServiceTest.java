package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    @Test
    void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1", "Jane", "Smith", "1234567890", "456 Elm St");
        service.addContact(contact);
        assertEquals("Jane", service.getContact("1").getFirstName());
    }

    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("2", "Mike", "Ross", "1234567890", "789 Oak St");
        service.addContact(contact);
        service.deleteContact("2");
        assertNull(service.getContact("2"));
    }

    @Test
    void testUpdatePhone() {
        ContactService service = new ContactService();
        Contact contact = new Contact("3", "Anna", "Lee", "1234567890", "321 Pine St");
        service.addContact(contact);
        service.updatePhone("3", "0987654321");
        assertEquals("0987654321", service.getContact("3").getPhone());
    }
}