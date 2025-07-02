package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparatorHash implements Comparator<Contacto> {

    public int compare (Contacto c1, Contacto c2) {
        return Integer.compare(c1.hashCode(), c2.hashCode());

    }
    
}
