import java.io.*;
import java.util.*;

class Manager {
    public static void main(String args[]) {
        try {
            File f = new File("people.text");
            Scanner sc = new Scanner(f);

            List<Person> people = new ArrayList<Person>();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] details = line.split(":");
                String fname = details[0];
                String lname = details[1];
                int zip = Integer.parseInt(details[2]);
                int dofbirth = Integer.parseInt(details[3]); //This will be in format MMDDYYYY

                Person p = new Person(fname, lname, zip, dofbirth);
                people.add(p);
            }

            for (Person p : people) {
                System.out.println(p.toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Person{

    private String fname;
    private String lname;
    private int zip;
    private int dofbirth;

    public Person(String fname, String lname, int zip, int dofbirth){
        this.fname = fname;
        this.lname = lname;
        this.zip = zip;
        this.dofbirth = dofbirth;
    }

    /**
     * @return the fname
     */
    public String getfname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setfname(String fname) {
        this.fname = fname;
    }

    /**
     * @param lname the lname to set
     */
    public void setlname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the lname
     */
    public String getlname() {
        return lname;
    }

    /**
     * @return the zip
     */
    public int getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * @return the date of birth
     */
    public int getDofbirth() {
        return dofbirth;
    }

    /**
     * @param dofbirth the zip to set
     */
    public void setDofbirth(int dofbirth) {
        this.dofbirth = dofbirth;
    }
    public String toString(){
        return this.fname + " " + this.lname + " " + this.zip + " " + this.dofbirth;
    }


}
