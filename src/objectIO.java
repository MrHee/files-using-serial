import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class objectIO {


    public static ArrayList<Object> load(String filePath, int numberOfObjects){

        ArrayList<Object> collection = new ArrayList<>();

        try  {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            for (int i = 0; i < numberOfObjects; i++) {
                Object temp = objectInputStream.readObject();
                collection.add(temp);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


        return collection;

    }

    public static void save(String filePath, ArrayList<Object> collection){
        //Saving Objects to file
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fos);
            for (Object thisThing : collection
            ) {

                objectOut.writeObject(thisThing);


            }
            objectOut.close();
            System.out.println("Successfully Saved");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
