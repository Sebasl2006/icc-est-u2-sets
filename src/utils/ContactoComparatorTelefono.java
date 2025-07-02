package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparatorTelefono implements Comparator<Contacto> {
    
    
    public int compare(Contacto c1, Contacto c2) {
        // Primero comparamos por Apellido alfabeticamente
        int phoneComparison = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        
        // Si los números de teléfono son iguales, comparamos por apellido
        if (phoneComparison != 0) {
            return phoneComparison;
        }
        
        // Si los números de teléfono son iguales, comparamos por nombre
        return c2.getTelefono().compareTo(c1.getTelefono());
        
    }
    
}
