package p02.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import p02.modelos.Platillo;
import static p02.util.Printer.*;

public class Constantes {

    public static Properties properties;

    static {
        properties = loadProperties();
    }

    
    public static List<Platillo> platillosMenuGeneral = List.of(
        new Platillo()
    );

    public static List<Platillo> platillosMenuEspecial = List.of(
        
    );

    public static List<Platillo> platillosMenuDelDia = List.of(

    );


    public static Properties loadProperties() {

        try (InputStream input = new FileInputStream("../application.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            return prop;
        } 
        catch (IOException ex) {
            ex.printStackTrace();
        }

        return null;
    }

}
