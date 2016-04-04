package names;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * @author najus
 *
 */
public class PersonList {
	private Collection<Person> list = new ArrayList<Person>();

	public Collection<Person> getList() {
		return list;
	}

	public void addPerson(String key, String firstname, String lastname) {
		Person p = new Person(key, firstname, lastname);
		list.add(p);
	}

	public void removePerson(String key) {
		Iterator<Person> iter = list.iterator();
		while (iter.hasNext()) {
			Person p = iter.next();
			if (p.getKey().equals(key)) {
				iter.remove();
				break;
			}
		}
	}
}
