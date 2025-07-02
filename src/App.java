import java.util.HashSet;
import java.util.Set;

import controllers.ContactoController;
import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        ContactoController cT = new ContactoController();
        //cT.runTreeContacto();
        // runHashSet(sets);
        // runLinkedHashSet(sets);
        // runTreeSet(sets);
        // runTreeSetConComparador(sets);
        
    }
public static void runHashSet(Sets sets){
    System.out.println("--------HashSet--------");
    Set<String> palabras = sets.contruirHashSet();
    for (String d : palabras){
        System.out.println(d);
    }

}

public static void runLinkedHashSet(Sets sets){
    System.out.println("------LinkedHashSet---------");
    Set<String> palabras = sets.LinkedHashSet();
    for (String d : palabras){
        System.out.println(d);
    }
}

public static void runTreeSet(Sets sets){
    System.out.println("------TreeSet---------");
    Set<String> palabras = sets.construirTreeSet();
    for (String d : palabras){
        System.out.println(d);
    }
}

public static void runTreeSetConComparador(Sets sets){
    System.out.println("------TreeSetConComparacion---------");
    Set<String> palabras = sets.contuirTreeSetConComparador();
    for (String d : palabras){
        System.out.println(d);
    }
}

}




