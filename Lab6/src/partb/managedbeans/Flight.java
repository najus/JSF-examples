package partb.managedbeans;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;

/**
 * 
 * @author najus
 *
 */
@ManagedBean
public class Flight {
	private String from;
	private String to;
	private String departuredate;
	private String returndate;
	private String trip;
	private Collection<String> selection = new ArrayList();

	public String submit() {
		System.out.println("From: " + from);
		System.out.println("To: " + to);
		System.out.println("Departure date: " + departuredate);
		System.out.println("Return date: " + returndate);
		System.out.println(trip);
		StringBuffer sb = new StringBuffer();
		String delim = "";
		for (String i : selection) {
			sb.append(delim).append(i);
			delim = ",";
		}
		System.out.println("Options: " + sb.toString());

		return null;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getDeparturedate() {
		return departuredate;
	}

	public void setDeparturedate(String departuredate) {
		this.departuredate = departuredate;
	}

	public String getReturndate() {
		return returndate;
	}

	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrip() {
		return trip;
	}

	public void setTrip(String trip) {
		this.trip = trip;
	}

	public Collection<String> getSelection() {
		return selection;
	}

	public void setSelection(Collection<String> selection) {
		this.selection = selection;
	}

}
