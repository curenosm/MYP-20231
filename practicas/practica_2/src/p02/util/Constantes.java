package p02.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;

import p02.modelos.Platillo;
import p02.modelos.PlatilloNoVegetariano;
import p02.modelos.PlatilloVegetariano;
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
        new PlatilloNoVegetariano(
            1L,
            "Hamburguesa sencilla",
            "Una clasica",
            BigDecimal.valueOf(9.99)
        ),
        new PlatilloNoVegetariano(
            2L,
            "Hamburguesa hawaiana",
            "Con jamon y piña",
            BigDecimal.valueOf(13.99)
        ),
        new PlatilloNoVegetariano(
            3L,
            "Hamburguesa BBQ",
            "Con tocino y salsa bbq",
            BigDecimal.valueOf(13.99)
        )
    );

    //Lista de platillos que constituyen al menu especial
    public static List<Platillo> platillosMenuEspecial = List.of(
        new PlatilloVegetariano(
            4L,
            "Hamburguesa de chilaquiles",
            "Una clasica",
            BigDecimal.valueOf(12.99)
        ),
        new PlatilloVegetariano(
            5L,
            "Hamburguesa de soya",
            "Con el doble de verduras",
            BigDecimal.valueOf(19.99)
        ),
        new PlatilloNoVegetariano(
            6L,
            "Hamburguesa con toño",
            "Incluye de todo, se puede desbordar",
            BigDecimal.valueOf(30.00)
        )
    );

    //Lista de platillos que constituyen al menu del dia
    public static List<Platillo> platillosMenuDelDia = List.of(
        new PlatilloNoVegetariano(
            7L,
            "Mexicana",
            "Una clasica",
            BigDecimal.valueOf(8.99)
        ),
        new PlatilloVegetariano(
            8L,
            "Hamburguesa de papas",
            "A la francesa con pan vegano",
            BigDecimal.valueOf(5.99)
        ),
        new PlatilloNoVegetariano(
            9L,
            "Mounstruo",
            "Si te la acabas, no pagas, como la con toño pero más grande.",
            BigDecimal.valueOf(2.99)
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
