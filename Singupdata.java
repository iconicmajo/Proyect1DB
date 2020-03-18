import java.util.Arrays;

/**
 * 
 */

/**
 * @author Majo
 *
 */
public class Singupdata {
	private String name;
	private char[] password;
	private char[] confpassword;
	private String adress;
	private String city;
	private String country;
	private String phone;
	private String email;
	
	/**
	 * 
	 */
	public Singupdata(String name, char[] password, char[] confpassword, String adress, String city, String country,
			String phone, String email) {
		super();
		this.name = name;
		this.password = password;
		this.confpassword = confpassword;
		this.adress = adress;
		this.city = city;
		this.country = country;
		this.phone = phone;
		this.email = email;
	}

	public Singupdata() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public char[] getConfpassword() {
		return confpassword;
	}

	public void setConfpassword(char[] confpassword) {
		this.confpassword = confpassword;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAll(String name, char[] password, char[] confpassword, String adress, String city, String country, String phone, String email) {
		this.name = name;
		this.password = password;
		this.confpassword = confpassword;
		this.adress = adress;
		this.city = city;
		this.country = country;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Singupdata [name=" + name + ", password=" + Arrays.toString(password) + ", confpassword="
				+ Arrays.toString(confpassword) + ", adress=" + adress + ", city=" + city + ", country=" + country
				+ ", phone=" + phone + ", email=" + email + "]";
	}


}
