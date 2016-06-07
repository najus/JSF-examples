
package managedbeans;

import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class Airlines {
	private String selectedAirline = "All";
	private List<Flight> allFlightList = new ArrayList<Flight>();
	private List<Flight> showFlightList = new ArrayList<Flight>();

	public Airlines() {
		Flight flight1 = new Flight("Amsterdam", "New York", "12/11/06", "KLM", "790.80");
		allFlightList.add(flight1);
		Flight flight2 = new Flight("Amsterdam", "New York", "12/11/06", "NorthWest", "795.55");
		allFlightList.add(flight2);
		Flight flight3 = new Flight("Amsterdam", "New York", "12/11/06", "KLM", "820.00");
		allFlightList.add(flight3);
		Flight flight4 = new Flight("Amsterdam", "New York", "12/11/06", "United Airlines", "825.50");
		allFlightList.add(flight4);
		Flight flight5 = new Flight("Amsterdam", "New York", "12/11/06", "NorthWest", "875.00");
		allFlightList.add(flight5);
		Flight flight6 = new Flight("Amsterdam", "New York", "12/11/06", "KLM", "989.00");
		allFlightList.add(flight6);
		Flight flight7 = new Flight("Amsterdam", "New York", "12/11/06", "United Airlines", "1050.00");
		allFlightList.add(flight7);

		Iterator<Flight> iterator = allFlightList.iterator();
		while (iterator.hasNext()) {
			Flight flight = (Flight) iterator.next();
			showFlightList.add(flight);
		}

	}

	public void setSelectedAirline(String selectedCity) {
		this.selectedAirline = selectedCity;
	}

	public String getSelectedAirline() {
		return selectedAirline;
	}

	public void setFlightListcomplete(List<Flight> flightList) {
		this.allFlightList = flightList;
	}

	public List<Flight> getFlightListcomplete() {
		return allFlightList;
	}

	public void changeAirline(ValueChangeEvent valueChangeEvent) {
		String newAirline = (String) valueChangeEvent.getNewValue();
		showFlightList.clear();
		Iterator<Flight> iterator = allFlightList.iterator();
		while (iterator.hasNext()) {
			Flight flight = (Flight) iterator.next();
			if (newAirline.equals("All")) {
				showFlightList.add(flight);
			} else {
				if (flight.getAirline().equals(newAirline)) {
					showFlightList.add(flight);
				}
			}
		}
	}

	public void setFlightListshow(List<Flight> flightListshow) {
		this.showFlightList = flightListshow;
	}

	public List<Flight> getFlightListshow() {
		return showFlightList;
	}

}
