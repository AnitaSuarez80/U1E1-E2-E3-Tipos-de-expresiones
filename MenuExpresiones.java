package U1E1;

import java.util.Scanner;

public class MenuExpresiones {

	public static void main(String[] args) {
		
		Scanner opcion = new Scanner (System.in);
		int expresion=1;
		boolean condicion= true;
		
		
		while(condicion) {
			
		System.out.println("1. Expresión Aritmética");
		System.out.println("2. Expresión Lógica");
		System.out.println("3. Expresión Lógica 2");
		System.out.println("4. Salir");

		
		expresion = opcion.nextInt();

		switch(expresion) {
		
		case 1:
			ExpresionAritmetica aritmetica = new ExpresionAritmetica();
			aritmetica.transformacion();
			aritmetica.evaluapost();
			Evalua ev = new Evalua();
			//ev.evaluaPila(postfija);
			
					
			break;
			
		case 2:
			ExpresionLogica logica = new ExpresionLogica();
			break;
			
		case 3:
			ExpresionLogica2 logica2 = new ExpresionLogica2(args);
			logica2.detectarNum();
			logica2.detectarCaracter();
			logica2.detectarCadena();
			

			break;
		case 4:
			System.out.println("Programa terminado ");
			condicion= false;
			expresion=0;
			break;
			
			
			default:
				System.out.println("¡Opción no válida!");
			
		
		}
		}
		}

	}


