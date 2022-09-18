package p02.util;

import com.diogonunes.jcolor.*;
import static com.diogonunes.jcolor.Attribute.*;

public class Printer {

    private static AnsiFormat error = new AnsiFormat(BOLD(), RED_TEXT());
    private static AnsiFormat warning = new AnsiFormat(BOLD(), YELLOW_TEXT());
    private static AnsiFormat success = new AnsiFormat(BOLD(), GREEN_TEXT());
    private static AnsiFormat version = new AnsiFormat(BRIGHT_BLUE_TEXT());
    private static AnsiFormat bold = new AnsiFormat(BOLD(), BLUE_TEXT());

    public static void println(String s) {
        System.out.println(s);
    }

    public static void print(String s) {
        System.out.print(s);
    }

    public static void printProjectInformation() {
        version("Project: Practica 2 (Template, State, Iterator)\nVersion: 1.0.0\nAuthors: BETTER CODE SAUL");
    }

    public static void println(String s, AnsiFormat style) {
        println("");
        println(style.format(s));
    }

    public static void error(String s) {
        println(s, error);
    }
    
    public static void warning(String s) {
        println(s, warning);
    }
    
    public static void success(String s) {
        println(s, success);
    }

    public static void bold(String s) {
        println(s, bold);
    }

    public static void version(String s) {
        println(s, version);
    }

}
