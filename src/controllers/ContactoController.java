package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorHash;
import utils.ContactoComparatorTelefono;

public class ContactoController {
    public ContactoController() {
        runTreeContacto();
        runTreeContactoTelefono();
        runTreeContactoHash();

        
        // Constructor
    }

    public void runTreeContacto() {
        System.out.println("--------TreeSet con Comparador--------");

        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        agenda.add(new Contacto("Pedro", "Lopez", "22222222"));
        agenda.add(new Contacto("Luis", "Perez", "11111111")); 
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "2222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "22222222")); 
        agenda.add(new Contacto("Pablo", "Lopez", "22222222"));
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }

    }

     public void runTreeContactoTelefono() {
        System.out.println("--------TreeSet con comparador de telefono--------");
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorTelefono());
        agenda.add(new Contacto("Pedro", "Lopez", "22222222"));
        agenda.add(new Contacto("Luis", "Perez", "11111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "2222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "22222222")); 
        agenda.add(new Contacto("Pablo", "Lopez", "22222222"));
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
        





     }


     public void runTreeContactoHash() {
        System.out.println("------TreeSetConComparadorHash---------");
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorHash());
        agenda.add(new Contacto("Pedro", "Lopez", "22222222"));
        agenda.add(new Contacto("Luis", "Perez", "11111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "2222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "22222222")); 
        agenda.add(new Contacto("Pablo", "Lopez", "22222222"));
        for (Contacto contacto : agenda) {
            System.out.println(contacto + "-----> " + contacto.hashCode());
        }
     }
        

    
    
}
