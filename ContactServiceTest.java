package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import grandstrand.Contact;
import grandstrand.ContactService;

class ContactServiceTest {

	private ContactService contactService;
	Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
	
	
	@BeforeEach
	void init() {
		contactService = new ContactService();
		contactService.addContact(contact);
	}
	
	@Test
	void testAddContact() {
		assertTrue(contactService.getContact("0001").equals(contact));
	}

	@Test
	void testContactIDIsNotUnique() {
		// Note: contact has already been added to the contactService
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact(contact);
		});
	}
	
	@Test
	void testDeleteContact() {
		contactService.deleteContact("0001");
		assertTrue(contactService.getContact("0001") == null);
	}

	@Test
	void testUpdateFirstName() {
		contactService.updateFirstName("0001", "Michael");
		assertTrue(contactService.getContact("0001").getContactID().equals("0001"));
		assertTrue(contactService.getContact("0001").getFirstName().equals("Michael"));
		assertTrue(contactService.getContact("0001").getLastName().equals("Pieri"));
		assertTrue(contactService.getContact("0001").getPhoneNumber().equals("7134567890"));
		assertTrue(contactService.getContact("0001").getAddress().equals("1234 Dart St"));
	}
	
	@Test
	void testUpdateLastName() {
		contactService.updateLastName("0001", "Joshua");
		assertTrue(contactService.getContact("0001").getContactID().equals("0001"));
		assertTrue(contactService.getContact("0001").getFirstName().equals("Chayne"));
		assertTrue(contactService.getContact("0001").getLastName().equals("Joshua"));
		assertTrue(contactService.getContact("0001").getPhoneNumber().equals("7134567890"));
		assertTrue(contactService.getContact("0001").getAddress().equals("1234 Dart St"));
	}
	
	@Test
	void testUpdatePhoneNumber() {
		contactService.updatePhoneNumber("0001", "8324567890");
		assertTrue(contactService.getContact("0001").getContactID().equals("0001"));
		assertTrue(contactService.getContact("0001").getFirstName().equals("Chayne"));
		assertTrue(contactService.getContact("0001").getLastName().equals("Pieri"));
		assertTrue(contactService.getContact("0001").getPhoneNumber().equals("8324567890"));
		assertTrue(contactService.getContact("0001").getAddress().equals("1234 Dart St"));
	}
	
	@Test
	void testUpdateAddress() {
		contactService.updateAddress("0001", "1205 Dart St");
		assertTrue(contactService.getContact("0001").getContactID().equals("0001"));
		assertTrue(contactService.getContact("0001").getFirstName().equals("Chayne"));
		assertTrue(contactService.getContact("0001").getLastName().equals("Pieri"));
		assertTrue(contactService.getContact("0001").getPhoneNumber().equals("7134567890"));
		assertTrue(contactService.getContact("0001").getAddress().equals("1205 Dart St"));
	}
}
