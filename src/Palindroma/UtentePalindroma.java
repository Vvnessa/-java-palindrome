package Palindroma;

import java.util.Scanner;

public class UtentePalindroma {
/*Consegna: scrivere un programma che chiede all’utente di
inserire una parola e gli risponde se è una parola palindroma oppure no */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* creo varibile  per parola per */
        String parola;
        /* creo un array che viene utlizzato per memorizzare la parola come array di caratteri  */
        char[] caratteri;
        int sinistro;
        int destro;

        System.out.println("inserisci  una parola");
        parola = scan.nextLine();
        parola= parola.toLowerCase();
        caratteri = parola.toCharArray(); /*converte la stringa parola in un areray di caratteri che abbiamo chiamato caratteri*/
        sinistro = 0;
        destro = caratteri.length-1;
        while (sinistro < destro) {
            if (caratteri[sinistro] == caratteri[destro]) {
                destro--;
                sinistro++;
            } else {
                System.out.println("la parola non e palindroma");
                break;
            }
        }

 if(sinistro == destro){
        System.out.println("la parola e un palindormo");
    }
}

}










