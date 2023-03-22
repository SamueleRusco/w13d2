package es1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

   static Scanner s = new Scanner(System.in);
    static int numero;
    static String parola;
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();
        System.out.println("inserisci un numero che rappresenti il numero di elementi da inserire");
        numero = s.nextInt();
        System.out.println("inserisci " + numero + " parole");

        do {
            parola = s.next();
            lista.add(parola);
        } while (lista.size() < numero);
        for(String p : lista){
            System.out.println(p);
        }


    }
}

/*parola = s.next();
            lista.add(parola);*/