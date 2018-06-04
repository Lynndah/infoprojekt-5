
package streichhölzer.projekt;


public class StreichhölzerProjekt {
     
    
    public static void main(String[] args) {
      /*   	function Gewinnstrategie (X)    
 	GS[1]:=Nein, GS[2]:= Ja, GS[3]:=Ja   
	i:=3   
	while i<X do   
	i:=i+1   
	if GS[i-3]=GS[i-2]=GS[i-1]=Ja then   
	GS[i]:=Nein   
	else   
	GS[i]:=Ja   
	endif   
	endwhile   
	end   */
      int i=(int)(Math.random()*100+5);
      /*Zufallszahl von 5-100 programmiert
      i = Anfangszahl der Streichhölzer
      */
        System.out.println(i);
      //Spieler 1 fängt immer an
      while(i>3){
       if (i%4==1){
           int k=(int)(Math.random()*3+1);
           System.out.println(k+" Ich stand auf einem Nein-Feld");
           i=i-k; //neues i nachdem Spieler 1 gespielt hat
       
       } //es ist egal was der Computer jetzt macht, denn er hat eh verloren
       
       else{
           int m=i%4;
           //m kann 0, 2 oder 3 sein
           if (m==0) {
               int k=3;
              i=i-k;
               System.out.println(k+" Ich kann gewinnen");
           } // wenn der Rest gleich 0 ist, müssen 3 Streichhölzer weggenommen werden
           else if (m==2) {
               int k=1;
               i=i-k;
                System.out.println(k+" Ich kann gewinnen");
           } // wenn der Rest gleich 2 ist, muss 1 Streichholz weggenommen werden
           else if (m==3) {
               int k=2;
               i=i-k;
                System.out.println(k+" Ich kann gewinnen");
           } //wenn der Rest gleich 3 ist, müssen 2 Streichhölzer weggenommen werden
           /*Folge: Gegenspieler ist auf einem Nein-Feld,
           ab hier braucht Computer nur noch Folgendes machen*/

          
       }
      }
       if (i==3) {
            int k=2;
            i=i-k;
            
        }
        else if (i==2) {
            int k=1;
            i=i-k;
        }
        else if (i==1) {
            int k=1;
            i=i-k;
            System.out.println("Ich bin der 1. Spieler und habe verloren.");
        }
       /* computer muss nach obigen Bedingungen die Anzahl der Streichhölzer 
       abziehen
       */
       while(i>3){
        if (i%4==1){
           int a=(int)(Math.random()*3+1);
           System.out.println(a+"Ich stand auf einem Nein-Feld");
           i=i-a;
       
       } //es ist egal was der Computer jetzt macht, denn er hat eh verloren
       
       else{
           int m=i%4;
           //m kann 0, 2 oder 3 sein
           if (m==0) {
               int a=3;
               i=i-a;
               System.out.println(a+" Ich kann gewinnen");

           } // wenn der Rest gleich 0 ist, müssen 3 Streichhölzer weggenommen werden
           else if (m==2) {
               int a=1;
               i=i-a;
               System.out.println(a+" Ich kann gewinnen");

           } // wenn der Rest gleich 2 ist, muss 1 Streichholz weggenommen werden
           else if (m==3) {
               int a=2;
               i=i-a;
               System.out.println(a+" Ich kann gewinnen");
           } 
        }
        
//wenn der Rest gleich 3 ist, müssen 2 Streichhölzer weggenommen werden
           /*Folge: Gegenspieler ist auf einem Nein-Feld,
           ab hier braucht Computer nur noch Folgendes machen*/
           
           
       }
        if (i==3) {
            int a=2;
            i=i-a;
        }
        else if (i==2) {
            int a=1;
            i=i-a;
        }
        else if (i==1) {
            int a=1;
            i=i-a;
            System.out.println("Ich bin der 2. Spieler und habe verloren.");
        }
       //Spiel ist beendet
       
       
       
    }
    
}
