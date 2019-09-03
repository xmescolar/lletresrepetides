package Lletres;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lletres {
	public static void main(String[] args) {
       
        // FASE 1
		// Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra.
		char[] name1 = {'X','A','V','I','E','R'};
		
		// Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres.
		for (int i=0;i <name1.length;i++) {
			
			System.out.println(name1[i]); 
			
		}			
	

		// FASE 2
		// Canvia la taula per una llista (List<Character>)
        List<Character> name = new ArrayList<Character>();
        name.add('X');
        name.add('A');
        name.add('V');
        name.add('I');
        name.add('E');
        name.add('R');
        
		for(char ch: name) {	
			
			// Al bucle, si la lletra és una vocal imprimeix a la consola: "VOCAL". Sinó, imprimeix "CONSONANT".
			if (ch == 'A' || ch == 'E' ||ch=='I'||ch=='O'||ch=='U') {
				
				System.out.println("VOCAL");				
			}
			else if (ch=='B'||ch=='C'||ch=='D'
					||ch=='F'||ch=='G'||ch=='H'
					||ch=='J'||ch=='K'||ch=='L'
					||ch=='M'||ch=='N'||ch=='P'
					||ch=='Q'||ch=='R'||ch=='S'
					||ch=='T'||ch=='V'||ch=='X'
					||ch=='Y'||ch=='Z') {
				
				System.out.println("CONSONANT");
			}
			else if (ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' 
					|| ch=='6' || ch=='7' || ch=='8'|| ch=='9' ){
				
				// Si trobes un número, mostra per pantalla: "Els noms de persones no contenen números!"
				System.out.println ("Els noms de persones no contenen números!");
			}						
		}


		
		// FASE 3
		// Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen.
		Map<Character,Integer> container = new HashMap<Character,Integer>();
			
		List<Character> name3 = new ArrayList<Character>();
		char liter;
		
		for(char c: "XAVIER".toCharArray()) {
			name3.add(c);
		}		
		
		for (int i=0,j=0;i <name3.size();i++) {
				container.put(name3.get(i),++j);
				liter = name3.get(i);
						
				int count=0;
				for (int k=0;k <name3.size();k++) {
					if (liter == name3.get(k)) {
						count++;
						container.put(liter,count);					
					}
				}	
		}
		
		System.out.println(container);
	
		// FASE 4	
		// Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.		
		List<Character> surname = new ArrayList<Character>();
		for(char c:"MARTINEZ".toCharArray()) {
			surname.add(c);
		}
		
		// Fusiona les dues llistes en una sola. A més afegeix una posició anb un espai buit entre la primera i la segona.
		// És a dir, partim de la llista name  i surname i al acabar l'exercici només tindrem una que es dirà fullName.
		List<Character> fullName = new ArrayList<Character>();
		
		for(char c:name) {
			fullName.add(c);
		}
	
		for(char c:" ".toCharArray()) {
			fullName.add(c);
		}
	
		for(char c:surname) {
			fullName.add(c);
		}	
	
		System.out.println(fullName);
				
    }

}



