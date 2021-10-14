package U1E1;

public class ExpresionLogica {

	public ExpresionLogica(){
		String exp = "[ ( p -> q ) ^ p ] -> q";
		String[] p = {"v", "v", "f","f"};
		String[] q = {"v","f","v","f"};
		String[] res = new String [4];
		
		System.out.println("Expresión: "+exp);
		
		    //Condicional (->)
		if(p[0].equals("v") && q[0].equals("v")) {
				res[0] = "v";		
		}else{
				res[0] = "f";
			}

		if(p[1].equals("v") && q[1].equals("f")) {
			res[1] = "f";		
		}else {
			res[1] ="v";
		}
		
		if(p[2].equals("f") && q[2].equals("v")) {
			res[2] = "v";				
		}else{
			res[2] ="f";
		}
		
		
		if(p[3].equals("f") && q[3].equals("f")) {
			res[3] = "v";				
		}else{
			res[3] ="f";
		}
		
		//Conjunción (^)

        if(res[0].equals("v") && p[0].equals("v")) {
			res[0] = "v";		
		}else {
			res[0] ="f";
		}
		
         if(res[1].equals("f") && p[1].equals("v")) {
 			res[1] = "f";		
 		}else {
 			res[1] ="v";
 		}
          
          if(res[2].equals("v") && p[2].equals("f")) {
   			res[2] = "f";		
   		}else {
   			res[2] ="v";
   		}
            
           if(res[3].equals("v") && p[3].equals("f")) {
       			res[3] = "f";		
        }else {
       			res[3] ="v";
       		}
 		
            //Condicional (->)
            

            if(res[0].equals("v") && p[0].equals("v")) {
    			res[0] = "v";		
    		}else {
    			res[0] ="f";
    		}
             System.out.println("Solución: " + res[0]);
    		
             if(res[1].equals("f") && p[1].equals("v")) {
     			res[1] = "v";		
     		}else {
     			res[1] ="f";
     		}
              System.out.println("Solución: " + res[1]);
              
              if(res[2].equals("f") && p[2].equals("f")) {
       			res[2] = "v";		
       		}else {
       			res[2] ="f";
       		}
                System.out.println("Solución: " + res[2]);
                
               if(res[3].equals("f") && p[3].equals("f")) {
           			res[3] = "v";		
            }else {
           			res[3] ="f";
           		}
                System.out.println("Solución: " + res[3]);
                               	   

            	  if(res[0] == "v" && res[1] == "v" && res[2] == "v" && res[3] == "v" ) {
            		  System.out.println("Tautología");
            	  }
            	  
            	  if(res[0] == "f" && res[1] == "f" && res[2] == "f" && res[3] == "f" ) {
            		  System.out.println("Contradicción");
            	  }
            	  
          		System.out.println("");

               }
}
