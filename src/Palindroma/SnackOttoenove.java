package Palindroma;

import java.util.Scanner;

public class SnackOttoenove {
    public static void main(String[] args) {
        /*Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre
         che compongono il numero.
Snack9
Calcola la somma e la media dei primi 10 numeri.*/

        int num;
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero di quatrro cifre per favore ");
        num = scan.nextInt();
        /*aggiungiamo  new variabile perchè cambia il valore da quello che ha inserito l' utente */
        int aux = num;
        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.println("la somma dei numeri e " + sum);


    }
}
