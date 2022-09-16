package p02.util;

import com.diogonunes.jcolor.*;
import static com.diogonunes.jcolor.Attribute.*;

public class Printer {
    
    public static void println(String s) {
        System.out.println(s);
    }

    public static void print(String s) {
        System.out.print(s);
    }

    public static void printProjectInformation() {
        AnsiFormat version = new AnsiFormat(BRIGHT_BLUE_BACK());
        AnsiFormat bold = new AnsiFormat(BOLD(), BLUE_BACK());

        println(version.format("Project: ") + bold.format("Practica 2 (Template, State, Iterator)"));
        println(version.format("Version: ") + bold.format("1.0.0"));
        println(version.format("Authors: ") + bold.format("BETTER CODE SAUL"));


    }
}
