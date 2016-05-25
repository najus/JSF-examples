package exercise1.managedbeans;

public class Temperature implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1802118090270869496L;
	private String temp;
	private String temptype;

	public Temperature(String temp, String temptype) {
		this.temp = temp;
		this.temptype = temptype;
	}

	public void setTemptype(String temptype) {
		this.temptype = temptype;
	}

	public String getTemptype() {
		return temptype;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getTemp() {
		return temp;
	}

}