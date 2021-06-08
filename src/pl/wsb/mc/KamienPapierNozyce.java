package pl.wsb.mc;

import java.util.Random;
import java.util.Scanner;

public class KamienPapierNozyce {

    public static void main(String[] args) {

        //Krok 1. Deklaracja zmiennych i klas potrzebnych do aplikacji
        Random random = new Random();
        int losowanie;
        String wybor;

        //Krok 1 - Tworzę tablicę zawierająca wyniki z trzech rund.

        String[] ranking = {"Wygrana", "Przegrana", "Remis"};
        System.out.println("Zagraj w papier-kamień-nożyce. Gra ma trzy rundy.");
        //Krok 2 -  pętla for z trzykrotnym zapytaniem
        for (int i = 1; i <= 3; i++) {
            //Instrukcja wyświetlająca zapytanie do użytkownika o wybór 1, 2 lub 3.
            System.out.println("Wybierz jedną z trzech wartości - 1(Papier), 2(Kamień), 3(Nożyce)");
            String wynik = getString();
            int liczba = Integer.parseInt(wynik);
            losowanie = random.nextInt(4) + 1;


            /*
            Pierwszy, duży warunek będzie sprawdzał czy wartości wprowadzone przez użytkownika są w odpowiednim zakresie.
             Jeśli tak – napiszemy kolejne warunki, a jeśli nie – wypiszemy informację, że podana wartość jest spoza zakresu
             i zakończymy program (w przyszłości – zamiast kończyć program - można dodać funkcjonalność, która sprawi,
             że będziemy odpytywać użytkownika np. do momentu, aż poda prawidłową wartość).
             */

            if (liczba == 1 || liczba == 2 || liczba == 3) {
                if (losowanie == 1) {
                    System.out.println("Wylosowano papier");

                    if (liczba == 3) {
                        System.out.println("Wygrana!");
                        wynik = "wygrana";
                    } else if (liczba == 2) {
                        System.out.println("Przegrana :(");
                        wynik = "przegrana";
                    } else {
                        System.out.println("Remis--");
                        wynik = "remis";
                    }
                    if (liczba == 1) {
                        System.out.println("Wygrana!!!");
                        wynik = "wygrana";
                    } else if (liczba == 3) {
                        System.out.println("Przegrana :(");
                        wynik = "przegrana";
                    } else {
                        System.out.println("Remis");
                        wynik = "remis";
                    }

                } else {
                    System.out.println("Wylosowano \"nożyce\".");


                    if (liczba == 2) {
                        System.out.println("Wygrana!!!");
                        wynik = "wygrana";
                    } else if (liczba == 1) {
                        System.out.println("Przegrana :(");
                        wynik = "przegrana";
                    } else {
                        System.out.println("Remis");
                        wynik = "remis";
                    }
                }
            } else {
                System.out.println("Wybrano wartośc spoza zakresu! Uruchom jeszcze raz!");
                break;

            }
            ranking[i] = wynik;
        }


        for (int i = 0; i < ranking.length; i++) {
            System.out.println("Runda " + (i + 1) + ": " + ranking[i]);
        }
    }


public static int getInt(){
        return new Scanner(System.in).nextInt();
    }

    public static String getString(){
        return new Scanner(System.in).next();
    }

}
