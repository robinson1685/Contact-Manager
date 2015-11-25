/**
 * Created by Mark on 3/23/2015.
 */
public class Address {

    //Variables
    private String street;
    private String city;
    private String state;
    private String zip;

    //Constructor
    public Address (String Street, String City, String State, String Zip) {
        street = Street;
        city = City;
        state = State;
        zip = Zip;
    }

    /**
     * @return a formatted string containing a full address.
     */
    public String getInfo () {
        //555 Something road. City, State, Zip
        String str = String.format(
                "%s %s, %s %s", getStreet(), getCity(), getState(), getZip()
        );

        return str;
    }

    //Getters and Setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
