package U1E1;

import java.util.Stack;

public class ExpresionAritmetica {
		
	public static void transformacion(){
		   
	    String expr = depurar("(9+9)*.2/6^2-7.6");
	    String[] infija = expr.split(" ");
        
	    Stack < String > datosEntrada = new Stack < String > (); //Pila con datos entrada
	    Stack < String > operadores = new Stack < String > (); //Pila temporal para operadores 
	    Stack < String > datosSalida = new Stack < String > (); //Pila con los datos de salida
	    //Stack < String > PP = new Stack < String > (); //Pila TEMPORAL DE OPERADORES DE POSFIJA PARA EVALUAR
	 

	    for (int i = infija.length - 1; i >= 0; i--) {
	    	datosEntrada.push(infija[i]);
	    }

	
	    try {
	      while (!datosEntrada.isEmpty()) {
	        switch (precedencia(datosEntrada.peek())){
	          case 1:
	        	  operadores.push(datosEntrada.pop());
	            break;
	          case 3:
	          case 4:
	            while(precedencia(operadores.peek()) >= precedencia(datosEntrada.peek())) {
	            	datosSalida.push(operadores.pop());
	            }
	            operadores.push(datosEntrada.pop());
	            break; 
	          case 2:
	            while(!operadores.peek().equals("(")) {
	            	datosSalida.push(operadores.pop());
	            }
	            operadores.pop();
	            datosEntrada.pop();
	            break; 
	          default:
	        	  datosSalida.push(datosEntrada.pop()); 
	        } 
	      }
	    //  System.out.println("Resultado: " + P.peek());

	      
	      String inf = expr.replace(" ", "");
	      String postfija = datosSalida.toString().replaceAll("[\\]\\[,]", "");

	      
	      System.out.println("Infija:  "+inf);
	      System.out.println("Postfija:  "+postfija);
		//  System.out.println("Resultado: " + P.peek());

	      
	    }catch(Exception ex){ 
	      System.out.println("Error en la expresión algebraica");
	      System.err.println(ex);
	    }
	 
	      }
	    


	  private static String depurar(String s) {
	    s = s.replaceAll("\\s+", ""); 
	    s = "(" + s + ")";
	    String simbols = "+-*/^()";
	    String str = "";
	 
	    for (int i = 0; i < s.length(); i++) {
	      if (simbols.contains("" + s.charAt(i))) {
	        str += " " + s.charAt(i) + " ";
	      }else str += s.charAt(i);
	    }
	    return str.replaceAll("\\s+", " ").trim();
	  
	  }
	  
	
	  private static int precedencia(String op) {
	    int prf = 99;
	    if (op.equals("^")) prf = 4;
	    if (op.equals("*") || op.equals("/")) prf = 3;
	    if (op.equals("+") || op.equals("-")) prf = 3;
	    if (op.equals(")")) prf = 2;
	    if (op.equals("(")) prf = 1;
	    return prf;
	  

	  
	  }

	
	
	
	  public static void evaluapost(){

	    	String expr = "9 9 + .2 * 6 2 ^ / 7.6 -"; // equivale a (6+2)*3/2^2-4
		    String[] postfija = expr.split(" ");   
		   
		    Stack < String > entrada = new Stack < String > (); //Pila entrada
		    Stack < String > operandos = new Stack < String > (); //Pila de operandos

		    for (int i = postfija.length - 1; i >= 0; i--) {
		    	entrada.push(postfija[i]);
		    }

		    String operadores = "+-*/^";
		    while (!entrada.isEmpty()) {
		      if (operadores.contains("" + entrada.peek())) {
		    	  operandos.push(evaluar(entrada.pop(), operandos.pop(), operandos.pop()) + "" );
		      }else {
		    	  operandos.push(entrada.pop());
		      }
		    }

		    
		    System.out.println("Resultado: " + operandos.peek());
		    System.out.println("");

		  }

		  private static double evaluar(String op, String n2, String n1) {
			  
			  double operando1 = Double.parseDouble(n1);
			  double operando2 = Double.parseDouble(n2);
		    if (op.equals("+")) return (operando1 + operando2);
		    if (op.equals("-")) return (operando1 - operando2);
		    if (op.equals("*")) return (operando1 * operando2);
		    if (op.equals("/")) return (operando1 / operando2);
		    if (op.equals("^")) return (Math.pow(operando1, operando2));

		    return 0;
		  }

		



	


}
