package U1E1;

import java.util.Arrays;

public class ExpresionLogica2 {
	
	//String texto = "1 2 b 3 ce 4.3 d 5* ebifihj 9";
	String texto = "( 2 + 8.6 ) * .1 / .5^2 - 76 abg p 100 ";

	String[] oracionAseparar = texto.split(" ");
    int contador=0;
	
	public ExpresionLogica2 (String oracionAseparar[]){
		
        System.out.println("Cadena original: " +texto );


		for (int i=0; i<oracionAseparar.length; i++) {
			
		}
	}
	
	
	
public void detectarNum() {
	
	System.out.print("Los elementos que son números son: [ ");

	for (int i=0; i<oracionAseparar.length; i++) {
	
		if (oracionAseparar[i].matches("[0-9]*")) {
		    System.out.print(oracionAseparar[i]+"  ");
		}

	}
	System.out.print("]");
	System.out.println("");

}

public void detectarCaracter() {
	
	System.out.print("Los elementos que son un solo caracter son: [ ");

	for (int i=0; i<oracionAseparar.length; i++) {

		if (oracionAseparar[i].matches("[a-z, /, *, +, (, ), ^, -]") || (oracionAseparar[i].matches("[A-Z]"))){
		    System.out.print(oracionAseparar[i]+" ");		    
		}

	}
	System.out.print("]");
	System.out.println("");
}

public void detectarCadena() {
	System.out.print("Los elementos que son cadenas: [ ");

	
	for (String itemSplit : oracionAseparar) {

		if (itemSplit.length() >=2  != itemSplit.matches("[0-9]*") != itemSplit.matches("[0-9]") ){
		
		   System.out.print(itemSplit+" ");

		   
			}
	}
	

	System.out.print("]");
	System.out.println("");
	System.out.println("");


  }

  }





