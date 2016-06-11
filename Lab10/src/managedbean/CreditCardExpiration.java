package managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "cardExpirationDate")
public class CreditCardExpiration implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7404104062551200082L;
	private int month = 1;
	private int year = 2010;

	public int getMonth() {
		return month;
	}

	public void setMonth(int newValue) {
		month = newValue;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int newValue) {
		year = newValue;
	}
}