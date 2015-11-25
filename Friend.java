/**
 * Created by Mark on 3/23/2015.
 */
public class Friend extends Contact{
    //Create varaibles
    private String email;

    /**
     * @param address is an address object
     * @param firstName
     * @param lastName
     * @param dob
     * @param email
     */
    public Friend(Address address, String firstName, String lastName, String dob, String email) {

        //Inherit from Contact
        super(address, firstName, lastName, dob);
        //Initialize the constructor variables
        this.email = email;
    }

    /**
     * @return a formatted string containing contact information
     */
    public String getAllInfoAsString () {
        return String.format(
                "%s" +
                        "Email: %s\n" +
                super.getAllInfoAsString(), getEmail()
        );
    }
    //Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
