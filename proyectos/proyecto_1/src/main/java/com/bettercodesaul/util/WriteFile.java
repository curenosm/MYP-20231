package com.bettercodesaul.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Clase que facilita la escritura de archivos.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class WriteFile {

  /**
   * Use Streams when you are dealing with raw data
   *
   * @param pathname
   * @param data
   */
  public static void writeUsingOutputStream(String pathname, String data) {
    OutputStream os = null;
    try {
      os = new FileOutputStream(new File(pathname));
      os.write(data.getBytes(), 0, data.length());
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        os.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
