package main.java.p04;

import static main.java.p04.util.Constantes.*;
import static main.java.p04.util.Printer.*;
import java.util.List;

import java.math.BigDecimal;
import java.util.Scanner;
import main.java.p04.modelos.blindajes.*;
import main.java.p04.modelos.cabinas.*;
import main.java.p04.modelos.sistemas.*;
import main.java.p04.modelos.armas.*;
import main.java.p04.modelos.Nave;

public class Main {

  public static void main(String[] args) {

    info(property("project.info"));

    Scanner scanner = new Scanner(System.in);

    int opcionElegida = 0;
    info("Bienvenido al sistema de ventas de naves");
    BigDecimal presupuesto = leerPresupuesto(scanner);
    success(presupuesto.toString());
    do {
     
     // elegirNave();
      Nave nave = elegirNave();
      
      //warning(nave.toString());
      BigDecimal costo = nave.obtenerCosto();


      if((costo.compareTo(presupuesto)>0)){
      error(property("mensajes.costo.excedido"));
      //info(property("mensajes.final"));
      
      do{
        try {
          opcionElegida = scanner.nextInt();

          if(opcionElegida==2){
            mostrarCatalogo(presupuesto);
          }else if(opcionElegida!=1){
            error(property("error.opcion.incorrecta"));
            opcionElegida=0;
          }
        } catch (Exception e) {
          error(property("error.opcion.incorrecta"));
          scanner= new Scanner(System.in);
          opcionElegida=0;
        }
      }while(opcionElegida==0);
     
      }else{
        success(property("mensajes.final")+nave.obtenerCosto());
                warning("Caracteristicas:\n"+nave.toString());
                System.exit(0);
      }



    } while (true);
  }

  public static BigDecimal leerPresupuesto(Scanner scanner) {

    info(property("mensajes.presupuesto"));
    BigDecimal res = null;

    try {
      String input = scanner.nextLine();
      res = new BigDecimal(input);
    } catch (Exception e) {
      error(property("error.opcion.incorrecta"));
      scanner = new Scanner(System.in);
      return leerPresupuesto(scanner);
    }

    return res;
  }

  public static Nave elegirNave(){

    Nave nave = new Nave();

    Arma arma = elegirArma();
    Blindaje blindaje = elegirBlindaje();
    Cabina cabina = elegirCabina();
    SistemaDePropulsion sistema = elegirSistema();

    nave.setArma(arma);
    nave.setBlindaje(blindaje);
    nave.setCabina(cabina);
    nave.setSistemaDePropulsion(sistema);
    return nave;
  }

  public static Arma elegirArma(){
    int resp=0;
    Scanner scanner = new Scanner(System.in);

    do{
      bold(property("menu.armas"));
      try {
      resp= scanner.nextInt();
      
       switch(resp){
         case 1:
        return new ArmaLaserSimple();
       //  break;

         case 2:
         return new ArmaMisilesDePlasma();
        // break;

         case 3:
         return new ArmaLaserDestructorDePlanetas();
        // break;

         default:
         error(property("error.opcion.incorrecta"));
         scanner = new Scanner(System.in);
         break;
       }
      
      } catch (Exception e) {
        error(property("error.opcion.incorrecta"));
        scanner = new Scanner(System.in);
      }
    }while(true);
  }

  public static Blindaje elegirBlindaje(){
    int resp=0;
    Scanner scanner = new Scanner(System.in);

    do{
      bold(property("menu.blindajes"));
      try {
      resp= scanner.nextInt();
      
       switch(resp){
         case 1:
        return new BlindajeSimple();
        // break;

         case 2:
         return new BlindajeReforzado();
        // break;

         case 3:
         return new BlindajeFortaleza();
        // break;

         default:
         error(property("error.opcion.incorrecta"));
         scanner = new Scanner(System.in);
         break;
       }
      
      } catch (Exception e) {
        error(property("error.opcion.incorrecta"));
        scanner = new Scanner(System.in);
      }
    }while(true);
  }
  
  public static Cabina elegirCabina(){
    int resp=0;
    Scanner scanner = new Scanner(System.in);

    do{
      bold(property("menu.cabinas"));
      try {
      resp= scanner.nextInt();
      
       switch(resp){
         case 1:
        return new Cabina1Piloto();
        // break;

         case 2:
         return new CabinaTripulacionPequena();
        // break;

         case 3:
         return new CabinaEjercito();
        // break;

         default:
         error(property("error.opcion.incorrecta"));
         scanner = new Scanner(System.in);
         break;
       }
      
      } catch (Exception e) {
        error(property("error.opcion.incorrecta"));
        scanner = new Scanner(System.in);
      }
    }while(true);
  }

  public static SistemaDePropulsion elegirSistema(){
    int resp=0;
    Scanner scanner = new Scanner(System.in);

    do{
      bold(property("menu.sistemas"));
      try {
      resp= scanner.nextInt();
      
       switch(resp){
         case 1:
        return new ViajeIntercontinental();
        // break;

         case 2:
         return new ViajeInterplanetario();
         //break;

         case 3:
         return new ViajeIntergalactico();
         //break;

         default:
         error(property("error.opcion.incorrecta"));
         scanner = new Scanner(System.in);
         break;
       }
      
      } catch (Exception e) {
        error(property("error.opcion.incorrecta"));
        scanner = new Scanner(System.in);
      }
    }while(true);
  }

  public static List<Nave> catalogoNaves = 
  List.of(
    new Nave(new ArmaLaserSimple(), new BlindajeReforzado(), new Cabina1Piloto(), new ViajeInterplanetario()),
    new Nave(new ArmaMisilesDePlasma(), new BlindajeReforzado(), new CabinaTripulacionPequena(), new ViajeIntercontinental()),
    new Nave(new ArmaLaserDestructorDePlanetas(), new BlindajeFortaleza(), new CabinaEjercito(), new ViajeIntergalactico())
  );

  public static void mostrarCatalogo(BigDecimal presupuesto){
    Scanner scanner = new Scanner(System.in);    
    int i=1, contador=0,resp=0;
      for (Nave nave : catalogoNaves) {
        if(nave.obtenerCosto().compareTo(presupuesto)>0){
          contador++;
        }
      }

      if(contador==catalogoNaves.size()){
        error(property("error.pesimo.presupuesto"));
        System.exit(0);
      }else{
        do{
          bold(property("menu.catalogo"));

          try {
            resp = scanner.nextInt();
            if((resp>=1)&&(resp<=catalogoNaves.size())){
              Nave navesin = catalogoNaves.get((resp-1));
              if((navesin.obtenerCosto().compareTo(presupuesto)>0)){
                error(property("error.presupuesto"));
                resp=0;
                scanner = new Scanner(System.in);
              }else{
                success(property("mensajes.final")+navesin.obtenerCosto());
                warning("Caracteristicas:\n"+navesin.toString());
                System.exit(0);

              }
            }else{
            error(property("error.opcion.incorrecta"));
            resp=0;
            scanner = new Scanner(System.in);
            }
          } catch (Exception e) {
            error(property("error.opcion.incorrecta"));
            resp=0;
            scanner = new Scanner(System.in);
            
          }
          
          
        }while(true);

      }


      

  }
  
}
