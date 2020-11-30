import java.io.*;

public class X {
    public static void writeBinaryFile(String path) throws IOException {
        OutputStream binaryFile = null;
        try{
            binaryFile = new FileOutputStream(path);
            byte[] list = {'C','o','d','e','g','y','m'};

            for (byte value:list){
                binaryFile.write(value);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            binaryFile.close();
        }
    }
    public static void readBinaryFile(String path) throws IOException{
        InputStream file = null;
        try {
            file = new FileInputStream(path);
            //byte[] content = new byte[4];
            int line;
            while ((line = file.read()) != -1){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            file.close();
        }
    }
    public static void main(String[] args) {
        try {
//            X.writeBinaryFile("demo.txt");
            X.readBinaryFile("demo.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
