import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final String filePath = "H:\\~CS20\\cs20-file-example\\files-using-serial\\src\\savedObjects.txt";

        ArrayList<modelKit> collection = new ArrayList<>();

        //Loads collection with n objects from file
        collection = objectIO.load(filePath,2);


        for (modelKit t: collection
             ) {
            System.out.println(t.toString());
        }

        //Saves collection to file.
        objectIO.save(filePath, collection);

    }


}