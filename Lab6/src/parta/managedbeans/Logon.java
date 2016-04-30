package parta.managedbeans;

import javax.faces.bean.ManagedBean;

/**
 * 
 * @author najus
 *
 */
@ManagedBean
public class Logon {

	private String username = "";
	private String password = "";
	private String fullname = "";

	public String logon_action() {
		if ((username.equals("kl01")) && (password.equals("yoyo"))) {
			fullname = "Frank Brown";
			return "success";
		}
		return "not_success";
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
