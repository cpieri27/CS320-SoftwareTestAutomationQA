package grandstrand;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	// Fields
	private Map<String, Contact> contactList;
	
	// Constructor
	public ContactService () {
		contactList = new HashMap<>();
	}

	// Add contact to contactList
    public void addContact(Contact contact) {
        // Check if contactID unique and not null prior to adding
    	if (contact != null && !contactList.containsKey(contact.getContactID())) {
            contactList.put(contact.getContactID(), contact);
        }
    	else {
    		throw new IllegalArgumentException("Invalid contactID: duplicate");
    	}
    }

    public void deleteContact(String contactID) {
        // Remove contact from contactList if found
    	contactList.remove(contactID);
    }

    public void updateFirstName(String contactID, String firstName) {
        // Update firstName of contact
    	Contact contact = contactList.get(contactID);
        if (contact != null) {
            contact.setFirstName(firstName);
        }
    }

    public void updateLastName(String contactID, String lastName) {
        // Update lastName of contact
    	Contact contact = contactList.get(contactID);
        if (contact != null) {
            contact.setLastName(lastName);
        }
    }

    public void updatePhoneNumber(String contactID, String PhoneNumber) {
        // Update Number of contact
    	Contact contact = contactList.get(contactID);
        if (contact != null) {
            contact.setPhoneNumber(PhoneNumber);
        }
    }

    public void updateAddress(String contactID, String Address) {
        // Update Address of contact
    	Contact contact = contactList.get(contactID);
        if (contact != null) {
            contact.setAddress(Address);
        }
    }

    public Contact getContact(String contactID) {
        // Get contact
    	return contactList.get(contactID);
    }
}
