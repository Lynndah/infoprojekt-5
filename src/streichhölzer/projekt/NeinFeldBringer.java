/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streichhölzer.projekt;

/**
 *
 * @author lynnbo
 */
public class NeinFeldBringer {
     //Absicht: bekomme den Gegenspieler auf ein Nein-Feld
           int m=i%4;
           //m kann 0, 2 oder 3 sein
           if (m==0) {
               int k=3;
           } // wenn der Rest gleich 0 ist, müssen 3 Streichhölzer weggenommen werden
           else if (m==2) {
               int k=1;
           } // wenn der Rest gleich 2 ist, muss 1 Streichholz weggenommen werden
           else if (m==3) {
               int k=2;
           } //wenn der Rest gleich 3 ist, müssen 2 Streichhölzer weggenommen werden
           /*Folge: Gegenspieler ist auf einem Nein-Feld,
           ab hier braucht Computer nur noch Folgendes machen*/
}
