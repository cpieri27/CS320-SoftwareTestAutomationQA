package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import grandstrand.Contact;

class ContactTest {
	// Constructor Test
	
	@Test
	void testContact() {
		Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
		assertTrue(contact.getContactID().equals("0001"));
		assertTrue(contact.getFirstName().equals("Chayne"));
		assertTrue(contact.getLastName().equals("Pieri"));
		assertTrue(contact.getPhoneNumber().equals("7134567890"));
		assertTrue(contact.getAddress().equals("1234 Dart St"));
	}
	
	// Constructor Length Tests
	
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "Chayne", "Pieri", "7134567890", "1234 Dart St");
		});
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0001", "ChaynePieri", "Pieri", "7134567890", "1234 Dart St");
		});
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0001", "Chayne", "PieriChayne", "7134567890", "1234 Dart St");
		});
	}
	
	@Test
	void testNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0001", "Chayne", "Pieri", "713456789", "1234 Dart St");
		});
	}
	
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0001", "Chayne", "Pieri", "71345678901", "1234 Dart St");
		});
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St Houston, Texas 77007");
		});
	}
	
	// Constructor Null Tests
	
	@Test
	void testContactIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Chayne", "Pieri", "7134567890", "1234 Dart St");
		});
	}
	
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0001", null, "Pieri", "7134567890", "1234 Dart St");
		});
	}
	
	@Test
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0001", "Chayne", null, "7134567890", "1234 Dart St");
		});
	}
	
	@Test
	void testPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0001", "Chayne", "Pieri", null, "1234 Dart St");
		});
	}
	
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0001", "Chayne", "Pieri", "7134567890", null);
		});
	}
	
	// Set Tests
	
	@Test
	void testSetFirstName() {
		Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
		contact.setFirstName("Michael");
		assertTrue(contact.getContactID().equals("0001"));
		assertTrue(contact.getFirstName().equals("Michael"));
		assertTrue(contact.getLastName().equals("Pieri"));
		assertTrue(contact.getPhoneNumber().equals("7134567890"));
		assertTrue(contact.getAddress().equals("1234 Dart St"));
	}
	
	@Test
	void testSetLastName() {
		Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
		contact.setLastName("Joshua");
		assertTrue(contact.getContactID().equals("0001"));
		assertTrue(contact.getFirstName().equals("Chayne"));
		assertTrue(contact.getLastName().equals("Joshua"));
		assertTrue(contact.getPhoneNumber().equals("7134567890"));
		assertTrue(contact.getAddress().equals("1234 Dart St"));
	}
	
	@Test
	void testSetNumber() {
		Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
		contact.setPhoneNumber("8324567890");
		assertTrue(contact.getContactID().equals("0001"));
		assertTrue(contact.getFirstName().equals("Chayne"));
		assertTrue(contact.getLastName().equals("Pieri"));
		assertTrue(contact.getPhoneNumber().equals("8324567890"));
		assertTrue(contact.getAddress().equals("1234 Dart St"));
	}
	
	@Test
	void testSetAddress() {
		Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
		contact.setAddress("1205 Dart St");
		assertTrue(contact.getContactID().equals("0001"));
		assertTrue(contact.getFirstName().equals("Chayne"));
		assertTrue(contact.getLastName().equals("Pieri"));
		assertTrue(contact.getPhoneNumber().equals("7134567890"));
		assertTrue(contact.getAddress().equals("1205 Dart St"));
	}
	// Set Length Tests
	
	@Test
	void testSetFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
			contact.setFirstName("ChaynePieri");
		});
	}
	
	@Test
	void testSetLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
			contact.setLastName("PieriChayne");
		});
	}
	
	@Test
	void testSetNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
			contact.setPhoneNumber("713456789");
		});
	}
	
	@Test
	void testSetNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
			contact.setPhoneNumber("71345678901");
		});
	}
	
	@Test
	void testSetAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
			contact.setAddress("1234 Dart St Houston, Texas 77007");
		});
	}
	
	// Set Null Tests
	
	@Test
	void testSetFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
			contact.setFirstName(null);
		});
	}
	
	@Test
	void testSetLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
			contact.setLastName(null);
		});
	}
	
	@Test
	void testSetNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
			contact.setPhoneNumber(null);
		});
	}
	
	@Test
	void testSetAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("0001", "Chayne", "Pieri", "7134567890", "1234 Dart St");
			contact.setAddress(null);
		});
	}
}
