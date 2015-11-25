import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Mark on 3/23/2015.
 */
public class SaveLoad {

    public static ArrayList<Contact> saveFile () {

        ArrayList<Contact> al = new ArrayList<Contact>();

        try {
            //Create an contacts.txt file if we dont have one
            File file = new File("contacts.txt"); //TODO make sure this is named right
            if(!file.exists()) {
                file.createNewFile();
            }

            //This will allow to write objects to our save file
            ObjectOutputStream oos= new ObjectOutputStream((new FileOutputStream("contact.txt")));
           // for (Contact s: oos.writeObject(al));
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return al;
    }

    public static ArrayList<Contact> loadFile () {
        //Defaults values
        ArrayList<Contact> arraylist = new ArrayList<Contact>();
        File file;
        ObjectInputStream ois;
        try {
            //Loads data from accounts.txt if exist
            file = new File("contacts.txt"); //TODO make sure this is named right;
            ois = new ObjectInputStream(new FileInputStream("*.txt"));
            Contact contact = (Contact) ois.readObject();
            //TODO Collect data and save to variables
            ois.defaultReadObject();
            for (int i = 0; i < ois.read(); i++) {
                Contact s = (Contact) ois.readObject();
                arraylist.add(s);
            }
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

