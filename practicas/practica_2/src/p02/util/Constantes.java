package p02.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;

import p02.modelos.Platillo;
import static p02.util.Printer.*;

/**
 *Clase que almacena las constantes utilizadas para la practica
 *@author Alcantara Estrada Kevin Isaac
 *@author Curenio Sanchez Misael
 *@author Hernandez Paramo Elizabeth
 */
public class Constantes {

    public static Properties properties;

    static {
        properties = loadProperties();
    }

    //Lista de platillos que constituyen al menu general
    public static List<Platillo> platillosMenuGeneral = List.of(
        new Platillo(
            1L,
            "Hamburguesa sencilla",
            "Una clasica",
            BigDecimal.valueOf(9.99),
            false, 
            false
        ),
        new Platillo(
            2L,
            "Hamburguesa hawaiana",
            "Con jamon y piña",
            BigDecimal.valueOf(13.99),
            true,
            false
        ),
        new Platillo(
            3L,
            "Hamburguesa BBQ",
            "Con tocino y salsa bbq",
            BigDecimal.valueOf(13.99),
            true,
            false
        )
    );

    //Lista de platillos que constituyen al menu especial
    public static List<Platillo> platillosMenuEspecial = List.of(
        new Platillo(
            4L,
            "Hamburguesa de chilaquiles",
            "Una clasica",
            BigDecimal.valueOf(12.99),
            true, 
            true
        ),
        new Platillo(
            5L,
            "Hamburguesa sin pan",
            "Con jamon y piña",
            BigDecimal.valueOf(19.99),
            false,
            false
        ),
        new Platillo(
            6L,
            "Hamburguesa con toño",
            "Incluye de todo, se puede desbordar",
            BigDecimal.valueOf(30.00),
            true,
            false
        )
    );

    //Lista de platillos que constituyen al menu del dia
    public static List<Platillo> platillosMenuDelDia = List.of(
        new Platillo(
            7L,
            "Desayuno mexicano",
            "Una clasica",
            BigDecimal.valueOf(8.99),
            false, 
            false
        ),
        new Platillo(
            8L,
            "Papas",
            "A la francesa",
            BigDecimal.valueOf(5.99),
            false,
            true
        ),
        new Platillo(
            9L,
            "Vaso de agua",
            "Incluye de todo, se puede desbordar",
            BigDecimal.valueOf(2.99),
            false,
            true
        )
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
