import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("output.txt");


        byte[] by = new byte[] { 'h', 'e', 'l', 'l', 'o', ' ', 'b', 'a', 'b', 'e' };

        for (int i = 0; i < by.length; i++) {
            byte b = by[i];
            os.write(b);
        }

        os.close();
    }
}