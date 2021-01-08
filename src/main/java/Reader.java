import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    <T extends Payment> List<T> readFile(String file) throws IOException, ClassCastException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        List<T> newList = ((ArrayList<T>) ois.readObject());
        ois.close();
        return newList;
    }
}
