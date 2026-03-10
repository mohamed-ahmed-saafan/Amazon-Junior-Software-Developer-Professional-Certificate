package C3M4L1.library;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.ClassNotFoundException;

public class LibrarySerializer {

    public void saveLibrary(List<Book> books, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            // TODO - missing code
            oos.writeObject(books);
            System.out.println("Library saved successfully to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public List<Book> loadLibrary(String fileName) {
        File file = new File(fileName);
        if (!file.exists() || file.length() == 0) {

            return null;
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            // TODO 22: read and cast the object
            return (List<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null; // return null if loading fails
    }

}

