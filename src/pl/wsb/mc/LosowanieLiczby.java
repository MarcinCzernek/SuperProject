package pl.wsb.mc;

import java.util.Random;
import java.util.Scanner;

//Uzytkownik odgaduje wylosowaną przez aplikację liczbę.

public class LosowanieLiczby {

    public static void main (String [] args){

        Random random = new Random();
        boolean czyLiczbaPrawdziwa = false;
        int liczbaZgadywana = random.nextInt(50)+1;

        if(!czyLiczbaPrawdziwa){
            System.out.print("Podaj liczbę do odgadnięcia (Od 0 do 50) :");
            int liczbaPodana = getInt();
            if(liczbaZgadywana < liczbaPodana){
                System.out.println("Liczba jest większa. Podaj liczbę o wiekszej wartośći");
            }else if (liczbaPodana > liczbaZgadywana){
                System.out.println("Liczba jest mniejsza. Podaj liczbę o mniejszej wartośći");
            } else{
                System.out.println("Brawo! Zgadłeś. Poszukiwana liczba to " + liczbaZgadywana);
                czyLiczbaPrawdziwa = true;
            }




        }




    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
