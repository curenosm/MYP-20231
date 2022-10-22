package com.bettercodesaul.util;

import com.bettercodesaul.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

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
