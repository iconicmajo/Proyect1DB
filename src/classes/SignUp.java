package classes;



public class SignUp{

    int customerID;
    int postalCode;
    int fax;
    int phone;

    String firstName;
    String lastName;
    String company;
    String address;
    String city;
    String state;
    String country;
    String email;
    String pass;



    public SignUp(int customerID, int postalCode, int fax, int phone, String firstName, String lastName
    , String address, String city, String state, String country, String email, String pass){

        this.customerID = customerID;
        this.postalCode = postalCode;
        this.fax = fax;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.email = email;
        this.pass = pass;
        
    }
}