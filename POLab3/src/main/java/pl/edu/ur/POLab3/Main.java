/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;
public class Main {

          public static int potega(int x, int n)
        {
            if(n==0)
                return 1;
            if(n%2!=0)
                return x*potega(x,n-1);
            else
              return (potega(x,n/2))*(potega(x,n/2));
     
            
        } 
          
          public static int fibb(int k)
          {
              int a1=1;
              int a2=1;
              if(k<3)
                  return 1;
              else return fibb(k-1)+fibb(k-2);
          }
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
      /*  System.out.print("Podaj liczbę: ");
// pobieramy od użytkownika liczbę
        int liczba = sc.nextInt();
// wyświetlamy na ekranie obliczoną silnię
        int sil = 1;
        for (int i = 1; i <= liczba; i++) {
            sil = sil * i;
        }
        System.out.println(sil);*/
     /*int a = 5;                                           //zad1.4
    System.out.println("o jeden bit w lewo: " + (a<<1) );       
      System.out.println("o jeden bit w prawo: " + (a>>1) );       
      System.out.println("o jeden bit w prawo bez znaku: " + (a>>1) );     
      boolean f,g,d;                                        //zad1.7
      f=true;
      g=false;
      d=f^g;
        System.out.println("XOR: "+ d);
        System.out.println("NOT: "+ !f );*/
        /*String napis = "napis";                   //zad 2.2
        String napis1= "napis1";
        char[] tab= new char[10];
        tab=napis.toCharArray();
        System.out.println("Zamienia String na tablice char"+tab[1]);         
        byte[] bytes = napis.getBytes();
        System.out.println("Zamienia string na tablice bitow:"+bytes);
        System.out.println("Sprawdza czy dwa Stringi sa takei same z uwzglednieniem wielkosci znakow: "+napis.equals(napis1));
        System.out.println("Sprawdza czy dwa Stringi sa takei same bez uwzglednienia wielkosci znakow: "+napis.equalsIgnoreCase(napis1));
        System.out.println("Porownuje dwa Stringi leksykograficznie: " + napis.compareTo(napis1));
        System.out.println(  "Porownuje dwa Stringi leksykograficznie: " + napis.compareToIgnoreCase(napis1));
        System.out.println("Sprawdza wystapienie danego znaku i podaje indeks na ktorym sie ten znak znajduje: " + napis.indexOf('p'));
         System.out.println("Sprawdza wystapienie danego kawalka tekstu i podaje  indeks na ktorym sie ten napis zaczyna: " + napis.indexOf("ap")); 
        System.out.println("Sprawdza wystapienie danego znaku i podaje indeks na ktorym sie ten znak znajduje: " + napis.lastIndexOf('p'));
          System.out.println("Sprawdza wystapienie danego kawalka tekstu i podaje indeks na ktorym sie ten napis konczy: " + napis.lastIndexOf("api"));
          System.out.println("Podciag od podanego indeksu do konca zmiennej: "+ napis.substring(2));
          System.out.println("Podciag z podanym indeksem poczatkowym i koncowym: "+ napis.substring(2, 4));
          System.out.println("Zamienia znak na inny: "+napis.replace('n', 'h'));
          System.out.println("Zwraca napis bez bialych znakow: " + napis.trim());
          System.out.println("Zmienia litery na duze: "+ napis.toUpperCase());
          System.out.println("Zmienia litery na male: " + napis.toLowerCase());
          String[] napis2=napis.split("ap");
          System.out.println("Rozdziela napis :" + napis2);
          System.out.println("Rozdziela tekst po wyrazeniu jakie wpiszemy do metody, można ustawic limit ilości rozdzielen: " + napis.split("ap",1));
          */
        /*int x;                                //zad 3.3
        int n;
        x=sc.nextInt();
        n=sc.nextInt();
        int h=x;
        System.out.println(potega(x,n));
        if(n==0)
            System.out.println(1);
        for(int i=1;i<n;i++)
            h=h*x;
        System.out.println(h);*/
        System.out.println(fibb(7));                // zad 3.4
        
    }

}
