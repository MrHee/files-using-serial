import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final String filePath = "H:\\~CS20\\cs20-file-example\\files-using-serial\\src\\savedObjects.txt";

        ArrayList<Object> collection = new ArrayList<>();

        //Loading Objects from file
        collection = objectIO.load(filePath,2);


        for (Object t: collection
             ) {
            System.out.println(((modelKit) t).toString());
        }

        objectIO.save(filePath, collection);

    }


}