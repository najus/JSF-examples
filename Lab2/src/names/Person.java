package names;
/**
 * 
 * @author najus
 *
 */

public class Person implements java.io.Serializable{

    private String key;
    private String firstname;
    private String lastname;

    public Person() {
    }

    public Person(String key, String firstname, String lastname) {
		super();
		this.key = key;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public void setKey(String key){
      this.key=key;
    }
    public String getKey(){
        return key;
    }
    public void setFirstname(String firstname){
      this.firstname=firstname;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setLastname(String lastname){
      this.lastname=lastname;
    }
    public String getLastname(){
        return lastname;
    }
}
