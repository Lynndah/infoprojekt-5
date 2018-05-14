
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
      /*zufallszahl von 5-100 programmiert
      für die anfangszahl der streichhölzer
      */
        System.out.println(i);
      
       if (i%4==1){
           int k=(int)(Math.random()*3+1);
       System.out.println(k);} 
       else{
           int m=i%4;
           int k=m-1;
           /*z ist die anzahl der hölzer die der computer wegnehmen muss
           m ist der rest der übrig bleibt wenn man durch 4 teilt 
           */
           System.out.println(k);
       }
       /* computer muss nach obigen bedingungen die anzahl der streichhölzer 
       abziehen
       */
        
       
       
       
    }
    
}
