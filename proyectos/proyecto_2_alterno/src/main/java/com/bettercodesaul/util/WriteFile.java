package com.bettercodesaul.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFile {

  /**
   * Usa la clase Files de Java 1.7 para escribir archivos, internamente usa OutputStream.
   *
   * @param pathname Dirección de salida del archivo
   * @param data Datos a guardar en el archivo
   */
  public static void writeUsingFiles(String pathname, String data) {
    try {
      Files.write(Paths.get(pathname), data.getBytes());
    } catch (IOException e) {
      // Intenta crear el directorio
      // new File(Constantes.DIRECTORIO_BITACORAS).mkdirs();
      writeUsingFiles(pathname, data);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
