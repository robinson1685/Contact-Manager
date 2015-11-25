/**
 * Created by Mark on 3/23/2015.
 */
public class Contact {
    //Create variables
    private String lastName;
    private Address address;
    private String firstName;
    private String dob;

    /**
     * @param address is an Address object
     * @param firstName is a string
     * @param lastName is a string
     * @param dob is a string
     */
    public Contact (Address address, String firstName, String lastName, String dob) {
        //Initialize the constructor variables
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;

    }

    /**
     * @return a formatted string containing contact information
     */
    public String getAllInfoAsString () {
        return String.format(
                "First Name: %s\n" +
                        "Last Name: %s\n" +
                        "Date of Birth: %s\n" +
                        "Address: %s\n",
                getFirstName(), getLastName(), getDob(), getAddress().getInfo()
        );
    }

    //Getters and Setters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
