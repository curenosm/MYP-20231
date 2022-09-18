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
    
    public LinkedList<Menu> menus;

    public Carta() {
        menus = new LinkedList<Menu>();

        MenuEspecial menuEspecial = new MenuEspecial(platillosMenuEspecial);
        MenuDelDia menuDelDia = new MenuDelDia(platillosMenuDelDia);
        MenuGeneral menuGeneral = new MenuGeneral(platillosMenuGeneral);

        menus.add(menuEspecial);
        menus.add(menuDelDia);
        menus.add(menuGeneral);

    }

    @Override
    public String toString() {
        String res = "";

        for (Menu menu: menus) {
            res += menu.toString();
        }

        return res;
    }
}
