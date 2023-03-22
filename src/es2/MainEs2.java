package es2;

import java.util.*;

public class MainEs2 {
static Scanner s = new Scanner(System.in);
static int n;
    public static void main(String[] args) {
        System.out.println("inserisci un numero di elementi che vuoi inserire nell'array");
        n = s.nextInt();
        List<Integer> lista = listaRandom(n);
        System.out.println("Lista: ");
        for(int p: lista) {
            System.out.print(p + " ");
        }
        System.out.println("");

        List<Integer> listaInvertita = invertiLista(lista);
        System.out.println("Lista invertita: ");
        for(int p: listaInvertita) {
            System.out.print(p + " ");
        }
        System.out.println("");

        boolean stampaPosizione;
        System.out.println("decidi quali posizioni vuoi stampare: 1.pari 2.dispari");
        int scelta = s.nextInt();
        if(scelta == 1){stampaPosizione = true;} else {stampaPosizione = false;};

        stampa(lista, stampaPosizione);
    }

    public static List<Integer> listaRandom(int n) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int numeroCasuale = rand.nextInt(101);

            lista.add(numeroCasuale);
        }
        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> invertiLista(List<Integer> lista) {
        List<Integer> listaInvertita = new ArrayList<Integer>(lista);
        Collections.reverse(listaInvertita);
        listaInvertita.addAll(lista);
        return listaInvertita;
    }

    public static void stampa(List<Integer> lista, boolean stampaPosizione) {
        System.out.print("Elementi in posizione ");
        if (stampaPosizione) {
            System.out.println("pari: ");
            for (int i = 0; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        } else {
            System.out.println("dispari: ");
            for (int i = 1; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        }
    }

}
