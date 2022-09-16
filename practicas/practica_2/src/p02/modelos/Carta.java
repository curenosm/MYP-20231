package p02.modelos;

import java.util.Collection;
import java.util.LinkedList;

import p02.menus.Menu;
import p02.menus.MenuDelDia;
import p02.menus.MenuEspecial;
import p02.menus.MenuGeneral;

import static p02.util.Constantes.platillosMenuDelDia;
import static p02.util.Constantes.platillosMenuEspecial;
import static p02.util.Constantes.platillosMenuGeneral;

public class Carta {
    
    public Collection<Menu> menus;

    public Carta() {
        menus = new LinkedList<Menu>();

        Menu menuEspecial = new MenuEspecial(platillosMenuEspecial);
        Menu menuDelDia = new MenuDelDia(platillosMenuDelDia);
        Menu menuGeneral = new MenuGeneral(platillosMenuGeneral);

        menus.add(menuEspecial);
        menus.add(menuDelDia);
        menus.add(menuGeneral);

    }
}
