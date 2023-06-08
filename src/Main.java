import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final String filePath = "H:\\~CS20\\cs20-file-example\\files-using-serial\\src\\savedObjects.txt";
        ArrayList<modelKit> collection = new ArrayList<>();
        //modelKit clownySwordPeople = new modelKit("Age of Sigmar", "Slaanesh Mortals", 5,  40);
      //  modelKit widowmakers = new modelKit("Warmachine", "Khador", 4, 99);


        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


            modelKit temp = (modelKit) objectInputStream.readObject();
            collection.add(temp);
             temp = (modelKit) objectInputStream.readObject();
            collection.add(temp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (modelKit t: collection
             ) {
            System.out.println(t.toString());
        }



        //Test input.


        //collection.add(clownySwordPeople);
        //collection.add(widowmakers);

        //System.out.println(clownySwordPeople.toString());

//As an example. Save ClownySwordPeople to a file.
/*
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fos);
            objectOut.writeObject(clownySwordPeople);
            objectOut.close();
            System.out.println("Successfully Saved");

       } catch (Exception e) {
            e.printStackTrace();
        }
*/

        //Now we should write the whole collection to a file.
//For each will loop through collection
            try {
                FileOutputStream fos = new FileOutputStream(filePath);
                ObjectOutputStream objectOut = new ObjectOutputStream(fos);
                for (modelKit thisKit : collection
                ) {

                    objectOut.writeObject(thisKit);


        }
        objectOut.close();
        System.out.println("Successfully Saved");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}