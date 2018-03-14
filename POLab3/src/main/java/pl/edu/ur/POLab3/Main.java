/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner; 



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {




        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
     /*   int a = 5;
        int b = 7;
        System.out.println(a & b);
        System.out.println(a | b);
        if (a == 4 && b == 6) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
        if (a == 4 || b == 6) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }*/
        /*int a1 = 5;
        int b1 = 3;
        int c = a1 + b1++;
        int d = (a1++) + b1;
        System.out.println(c);
        System.out.println(d);
        String s1 = "Happy ";
        String s2 = "Birthday";

        System.out.printf( "s1 = %s\ns2 = %s\n\n",s1, s2 );
        System.out.printf( 
         "Result of s1.concat( s2 ) = %s\n", s1.concat( s2 ) );
        System.out.printf( "s1 after concatenation = %s\n", s1 );*/
        Scanner sc = new Scanner(System.in);
System.out.print("Podaj liczbę: " ); 
// pobieramy od użytkownika liczbę
int liczba = sc.nextInt(); 
// wyświetlamy na ekranie obliczoną silnię
    int sil=1;
        for(int i=1;i<=liczba;i++)
        sil=sil*i;
        System.out.println(sil);
    }

}
