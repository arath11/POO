//Julio Arath Rosales Oliden 
//A01630738
//EjemploArreglos.java
//11/2/2019

public class EjemploArreglos{
			
	
	public String[][] arregloBidimensional(String[] arregloUni){
		int fil,
		    col;
		fil = Integer.parseInt(arregloUni[0]);
		col = Integer.parseInt(arregloUni[1]);
		String[][] arregloBidi = new String[fil][col];
		int cont=2;
		for(int i=0; i<fil;i++){
			for(int j=0; j<col; j++){
				arregloBidi[i][j] = arregloUni[cont];
				cont++; 
			}
		} return arregloBidi;
	}

	public void imprimir(String[][] bidimensional){
		for(int i=0; i<bidimensional.length;i++){
			for(int j=0; j<bidimensional[i].length;j++){
				System.out.print(bidimensional[i][j]);
			} System.out.println("");
		}
	}		
	
	public int suma(int[] arreglo){
		int res=0;
		for(int i=0;i<arreglo.length;i++){
			res+=arreglo[i];
		}
		return res;
	}

	public int maximo(int[] arreglo){
		int max=arreglo[0];
		for(int i =1;i<arreglo.length;i++){
			if(max<arreglo[i]){
				max=arreglo[i];
			}
		}
		return max;
	}	

	public int minimo(int[] arreglo){
		int min=arreglo[0];
		for(int i=1;i<arreglo.length;i++){
			if(min>arreglo[i]){
				min=arreglo[i];
			}
		}
		return min;
	}

	
	public int promedio(int[] arreglo){
		int suma=0;
		int contador=0;
		for(int i=0;i<arreglo.length;i++){
			suma+=arreglo[i];
			contador++;
		}
		int promed=(suma/contador);
		return promed;
	}	
	
	

	public static void main(String[] args){
		EjemploArreglos ea=new EjemploArreglos();
		int[] valores={10,20,30};
		System.out.println("La suma es:\n"+ea.suma(valores)+"\n");
		
		System.out.println("El mayor es:\n"+ea.maximo(valores));
			
	
		System.out.println("El menor numeor es: \n"+ea.minimo(valores));
		System.out.println("El promedio es de: \n"+ea.promedio(valores));

		String[][] mtrz= ea.arregloBidimensional(args);
		ea.imprimir(mtrz);
	}
	
}