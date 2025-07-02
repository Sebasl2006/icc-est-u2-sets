package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Sets() {

    }

public Set<String> contruirHashSet(){
    Set<String> palabras = new HashSet<>();
    palabras.add("Laptop");
    palabras.add("Manzana");
    palabras.add("Pera");
    palabras.add("Celular");
    palabras.add("Laptop");
    palabras.add("Celular");

    return palabras;
    

}
public Set<String> LinkedHashSet(){
    Set<String> palabras = new LinkedHashSet<>();
    palabras.add("Laptop");
    palabras.add("Manzana");
    palabras.add("Pera");
    palabras.add("Celular");
    palabras.add("Laptop");
    palabras.add("Celular");

    return palabras;


}
public Set<String> construirTreeSet(){
    Set<String> palabras = new TreeSet<>();
    palabras.add("Laptop");
    palabras.add("Manzana");
    palabras.add("Pera");
    palabras.add("Celular");
    palabras.add("Laptop");
    palabras.add("Celular");

    return palabras;

}
public Set<String> contuirTreeSetConComparador(){
//Implementacion de Comparator, para comparaciones especificas
    Comparator<String> comparador = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2){
            //primero comparamos por la longitud
            int result  = Integer.compare(s2.length(), s1.length());
            // Si son igual en tamaño, comparo alfabeticamente
            if ( result == 0){
                result = s2.compareTo(s1);
            }
            return result;
        }
        
    };
        

    Set<String> palabras = new TreeSet<>(comparador);
    palabras.add("Laptop");
    palabras.add("Manzana");
    palabras.add("Pera");
    palabras.add("Celular");
    palabras.add("Laptop");
    palabras.add("Celular");
    palabras.add("Celulas");

    return palabras;


}

    
}
