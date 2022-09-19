package p02.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import p02.modelos.Platillo;
import p02.modelos.PlatilloNoVegetariano;
import p02.modelos.PlatilloVegetariano;
import p02.modelos.Robot;

import static p02.util.Printer.*;

/**
 *Clase que almacena las constantes utilizadas para la practica
 *@author Alcantara Estrada Kevin Isaac
 *@author Curenio Sanchez Misael
 *@author Hernandez Paramo Elizabeth
 */
public class Constantes {

    public static Properties properties;
    public static Scanner scanner = new Scanner(System.in);

    static {
        properties = loadProperties();
    }

    //Lista de platillos que constituyen al menu general
    public static List<Platillo> platillosMenuGeneral = List.of(
        new PlatilloNoVegetariano(
            1L,
            "Hamburguesa sencilla",
            "Una clasica",
            BigDecimal.valueOf(9.99),
            true
        ),
        new PlatilloNoVegetariano(
            2L,
            "Hamburguesa hawaiana",
            "Con jamon y piña",
            BigDecimal.valueOf(13.99),
            false
        ),
        new PlatilloNoVegetariano(
            3L,
            "Hamburguesa BBQ",
            "Con tocino y salsa bbq",
            BigDecimal.valueOf(13.99),
            true
        )
    );

    //Lista de platillos que constituyen al menu especial
    public static List<Platillo> platillosMenuEspecial = List.of(
        new PlatilloVegetariano(
            4L,
            "Hamburguesa de chilaquiles",
            "Una clasica",
            BigDecimal.valueOf(12.99),
            true
        ),
        new PlatilloVegetariano(
            5L,
            "Hamburguesa de soya",
            "Con el doble de verduras",
            BigDecimal.valueOf(19.99),
            false
        ),
        new PlatilloNoVegetariano(
            6L,
            "Hamburguesa con toño",
            "Incluye de todo, se puede desbordar",
            BigDecimal.valueOf(30.00),
            true
        )
    );

    //Lista de platillos que constituyen al menu del dia
    public static List<Platillo> platillosMenuDelDia = List.of(
        new PlatilloNoVegetariano(
            7L,
            "Mexicana",
            "Una clasica",
            BigDecimal.valueOf(8.99),
            false
        ),
        new PlatilloVegetariano(
            8L,
            "Hamburguesa senci-vegi",
            "Con papas, caarne de soya y pan vegano",
            BigDecimal.valueOf(5.99),
            false
        ),
        new PlatilloNoVegetariano(
            9L,
            "Monstruo",
            "Si te la acabas, no pagas, como la con toño pero más grande.",
            BigDecimal.valueOf(29.99),
            false
        )
    );

    /**
     * Metodo que carga el archivo application.properties que esta en la raiz de la practica.
     * @return objeto de propiedades
     */
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

    /**
     * Metodo que solicita al usuario un long por medio de stdout
     * 
     * @param robot Robot con la carta de platillos posibles
     * @return
     */
    public static Platillo solicitarPedido(Robot robot) {

        Long id = 0L;
        Platillo platillo = null;

        try {
            id = Long.parseLong(scanner.nextLine());

            platillo = robot.getCarta().buscarPlatillo(id);

            if (platillo == null) {
                throw new Exception();
            }

        } catch (Exception e) {
            error("ELIJA SOLO UNA OPCION VALIDA, POR FAVOR");
            scanner = new Scanner(System.in);
            return solicitarPedido(robot);
        }

        return platillo;

    }

}
