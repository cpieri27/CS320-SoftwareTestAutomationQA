package grandstrand;

public class Contact {
	private final String contactID;	// Contact ID unique for each contact, cannot be updated
	private String firstName;	// Contact's first name
	private String lastName;	// Contact's last name
	private String PhoneNumber;	// Contact's phone number
	private String Address;		// Contact's home address
	
	// Constructors
	public Contact (String contactID, String firstName, String lastName, String PhoneNumber, String Address) {
		
		// contactID needs to be unique, not null, and less than or equal to 10 characters.
		// Uniqueness checked when added to contactList
		if (contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid contactID");
		}
		
		// firstName cannot be null or be more than 10 characters
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		
		// lastName cannot be null or be more than 10 characters
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		
		// Number cannot be null or be more than 10 characters
		if (PhoneNumber == null || PhoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid PhoneNumber");
		}
		
		// Address cannot be null or be more than 10 characters
		if (Address == null || Address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.PhoneNumber = PhoneNumber;
		this.Address = Address;
	}
	
	// Getters & Setters
	
    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }
    
    public String setFirstName(String firstName) {
		// firstName cannot be null or be more than 10 characters
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid firstName");
		}
		
    	this.firstName = firstName;
    	
    	return firstName;
    }
    
    public String setLastName(String lastName) {
		// lastName cannot be null or be more than 10 characters
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid lastName");
		}
		
    	this.lastName = lastName;
    	
    	return lastName;
    }
    
    public String setPhoneNumber(String PhoneNumber) {
    	// Number cannot be null or be more than 10 characters
		if (PhoneNumber == null || PhoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Number");
		}
		
		this.PhoneNumber = PhoneNumber;
		
    	return PhoneNumber;
    }
    
    public String setAddress(String Address) {
    	// Address cannot be null or be more than 10 characters
		if (Address == null || Address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
    	
    	this.Address = Address;
    	
    	return Address;
    }
}
