package controllers;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {
    public Ejercicios() {
        System.out.println("Ejercicios 1");
        System.out.println(tieneDuplicados(new int [] { 1,2,3,4,5}));
        System.out.println(tieneDuplicados(new int [] { 1,2,3,4,5,4,3,2}));

        System.out.println("Ejercicio 2");
        System.out.println(isIsograma("murcielago"));
        System.out.println(isIsograma("camaleon"));

        System.out.println("Ejercicio 3");
        String texto = "La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía? Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente. En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.";
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        System.out.println(("Texto -> " + contarPalabrasUnicas(texto)));
        System.out.println(("Texto1 -> " + contarPalabrasUnicas(texto1)));
        System.out.println(("Texto2 -> " + contarPalabrasUnicas(texto2)));

        System.out.println("Ejercicios 4");
        compararPalabras(texto1, texto2);


    }

    public boolean tieneDuplicados (int[] numeros ){
        Set<Integer> set = new HashSet<>();
        for ( int n : numeros){
            if ( !set.add(n)){
                return true;
            }
            

        }
        return false;

    }

    public boolean isIsograma ( String palabra){
        Set<Character> set = new HashSet<>();
        for ( char n : palabra.toCharArray()){
            if ( !set.add(n)) return false;
        }
        return true;
    }

    public int contarPalabrasUnicas ( String frase){
        Set<String > set = new HashSet<>();
        for ( String c : frase.split(" ")){
            set.add(c);
        }
        return set.size();

    }

    public Set<String> obtenerPalabras ( String frase){
        Set<String> set = new HashSet<>();
        for ( String t : frase.split(" ")) set.add(t);
        return set;
    }

    public void compararPalabras (String text1 , String texto2){
        Set<String> palabras1 =  obtenerPalabras(text1);
        System.out.println("Texto 1" + palabras1.size());
        Set<String> palabras2 = obtenerPalabras(texto2);
        System.out.println("Texto 2" + palabras2.size());
        Set<String> ambos = new HashSet<>(palabras1);
        ambos.retainAll(palabras2);
        Set<String> total = new HashSet<>();
        total.addAll(palabras1);
         total.addAll(palabras2);
         System.err.println("Palabras comunes : " + ambos.size());
         System.out.println("Considencia lexica" + ((ambos.size()*100.0)/total.size()) + "%");

         palabras1.removeAll(obtenerPalabras(texto2));
         palabras2.removeAll(obtenerPalabras(text1));

         System.out.println("Solo texto 1 :" + palabras1);
         System.out.println("Solo texto 2 :" + palabras2);
         

        

        
    }
    
      
}
