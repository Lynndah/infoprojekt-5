
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
      
       if (i%4==1){
           int k=(int)(Math.random()*3+1);
           System.out.println(k+"Ich stand auf einem Nein-Feld");
       } //es ist egal was der Computer jetzt macht, denn er hat eh verloren
       else{
          
           int y=(int)(Math.random()*3+1); /*Gegenspieler ist schon auf Nein-Feld:
           Anzahl der Streichhölzer die Spieler 2 wegnimmt*/
           int k=4-y; // y ist die Anzahl der Hölzer, die der Gegenspieler in der vorigen Runde weggenommen hat
           //int k=m-1;
           /*k ist die Anzahl der Hölzer die der Computer wegnehmen muss
           m ist der Rest der übrig bleibt, wenn man durch 4 teilt,
           m kann nur 0, 2 oder 3 sein
           */
           System.out.println(k+" Ich kann gewinnen");
       }
       /* computer muss nach obigen Bedingungen die Anzahl der Streichhölzer 
       abziehen
       */
        
       
       
       
    }
    
}
