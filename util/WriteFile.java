import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFile {

    /**
     * Use Streams when you are dealing with raw data
     * @param data
     */
    public static void writeUsingOutputStream(String pathname, String data) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File(pathname));
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Use Files class from Java 1.7 to write files, internally uses OutputStream
     * @param data
     */
    public static void writeUsingFiles(String pathname, String data) {
        try {
            Files.write(Paths.get(pathname), data.getBytes());
        } catch (IOException e) {
            // Intenta crear el directorio
            new File(pathname).mkdirs();
            writeUsingFiles(pathname, data);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Use BufferedWriter when number of write operations are more
     * It uses internal buffer to reduce real IO operations and saves time
     * @param data
     * @param noOfLines
     */
    public static void writeUsingBufferedWriter(String pathName, String data, int noOfLines) {
        File file = new File(pathName);
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine = data + System.getProperty("line.separator");
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = noOfLines; i > 0; i--){
                br.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Use FileWriter when number of write operations are less
     * @param data
     */
    public static void writeUsingFileWriter(String pathname, String data) {
        File file = new File(pathname);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}