package model;

/**
 * 
 * @author najus
 *
 */
public class Person {
	private String firstName;
	private String lastName;

	public Person(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
}
