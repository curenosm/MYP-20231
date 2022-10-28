package com.bettercodesaul.util;

import com.bettercodesaul.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para facilitar la lectura de archivos
 * 
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
*/
public class ReadFile {

  /**
   * Metodo que lee un archivo desde los recursos y devuelve una lista de sus lineas como texto.
   *
   * @param pathname
   * @return
   * @throws IOException
   */
  public static List<String> readUsingBufferedReader(String pathname) throws IOException {

    List<String> res = new ArrayList<>();

    InputStream in = null;

    in = Main.class.getResourceAsStream(pathname);

    BufferedReader br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));

    String st;
    while ((st = br.readLine()) != null) res.add(st);

    br.close();

    return res;
  }
}
