import java.util.Arrays;

/**
 * 
 */

/**
 * @author Majo
 *
 */
public class Logindata {
	private String user;
	private char[] password;

	/**
	 * Esta clase va a guardar y acceder a los datos del login
	 */
	public Logindata() {
		// TODO Auto-generated constructor stub
		user = "";
	}
	public Logindata(String user, char[] password) {
		this.user = user;
		this.password = password;
		
	 }
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Logindata [user=" + user + ", password=" + Arrays.toString(password) + "]";
	}

}
