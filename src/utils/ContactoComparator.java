package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {
    public  int compare(Contacto c1, Contacto c2) {
        // Primero comparamos por apellido alfabeticamente
        int lastNameComparison = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        //Si los apellidos son iguales, comparamos por nombre alfabeticamente
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        return c1.getNombre().compareToIgnoreCase(c2.getNombre());
    }


   


    
}
