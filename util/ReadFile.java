import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    public static void readUsingBufferedReader(String pathname) throws IOException {
        File file = new File(pathname);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);

        br.close();
    }
    
    public static void readUsingFileReader(String pathname, String data) throws IOException {
        FileReader fr = new FileReader(pathname);

        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char)i);

        fr.close();
    }

    public static void readUsingBufferedWriter(String pathname, String data, int noOfLines) throws FileNotFoundException {
        File file = new File(pathname);
        Scanner sc = new Scanner(file);
    
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());

        sc.close();
    }

    public static List<String> readUsingFileInList(String pathname) {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(pathname), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public static String readFileAsString(String pathname)throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(pathname)));
        return data;
    }
}