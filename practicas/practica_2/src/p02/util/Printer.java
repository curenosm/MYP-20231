package p02.util;

import com.diogonunes.jcolor.*;
import static com.diogonunes.jcolor.Attribute.*;

public class Printer {
    
    public static void println(String s) {
        System.out.println(Ansi.colorize(s, BLUE_TEXT(), MAGENTA_BACK()));
    }

    public static void print(String s) {
        System.out.print(s);
    }
}
