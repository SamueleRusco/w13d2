package Es3;

import java.util.HashMap;
import java.util.Scanner;

public class MainEs3 {
    static Scanner s = new Scanner(System.in);
    static String nome;
    static String numero;
    static int sceltaIniz;
    static HashMap<String, String> rubrica = new HashMap<String, String>();
    public static void main(String[] args){

      start();


    }
static void start(){

    System.out.println("che cosa vuoi fare?");
    System.out.println("1.inserisci 2.cancella 4.ricerca per nome 5.mostra rubrica");
    sceltaIniz = s.nextInt();

    if(sceltaIniz == 1){inserisci();}
    else if(sceltaIniz == 2){cancella();}
    else if(sceltaIniz == 4) {ricercaPerNome();}
    else if(sceltaIniz == 5) {printAll();}
    else {System.out.println("prego ripeti");start();}

}

    static void inserisci(){
        System.out.println("inserisci nuovo Nome");
        nome = s.next();
        System.out.println("inserisci numero");
        numero = s.next();
        rubrica.put(nome, numero);
        System.out.println("numero importato correttamente");
        start();
    }
    static void cancella(){
        System.out.println(rubrica);
        System.out.println("scegli il contatto da eliminare");
        String contattoSelez = s.next();
        rubrica.get(contattoSelez);
        rubrica.remove(contattoSelez);
        System.out.println("contatto eliminato correttamente");
        start();
    }
    static void ricercaPerNumero(){

        start();
    }
    static void ricercaPerNome(){
        System.out.println("inserisci il nome del contatto selezionato");
        String contattoSelez = s.next();
        System.out.println(rubrica.get(contattoSelez));


        start();
    }


    static void printAll(){
        System.out.println(rubrica);

        start();
    }
}
