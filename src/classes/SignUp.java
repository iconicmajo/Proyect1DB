package classes;



public class SignUp{

    private int customerID;
    private int postalCode;
    private int fax;
    private int phone;

    private String firstName;
    private String lastName;
    private String company;
    private String address;
    private String city;
    private String state;
    private String country;
    private String email;
    private String pass;



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