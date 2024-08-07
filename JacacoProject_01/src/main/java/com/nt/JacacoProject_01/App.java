package com.nt.JacacoProject_01;

/**
 * Hello world!
 *
 */
public class App {
	//login
	public String login(String uname, String pword) {
		if ((uname == null || uname.length() == 0) || (pword == null || pword.length() == 0)) {
			throw new IllegalArgumentException("Invalid inputs. ");

		} else {
			if (uname.equalsIgnoreCase("aarish") && pword.equalsIgnoreCase("1313")) {
				return "Valid credentials";
			} else {
				return "InValid credentials";
			}
		}
	}
}
