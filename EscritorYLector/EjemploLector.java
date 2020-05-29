import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLector {
	public static void main(String[] args) {
		try {
		String linea;
		BufferedReader bf=new BufferedReader(new FileReader("C:\\\\Users\\\\J4\\\\Documents\\\\Uni\\\\2 semetre\\\\POO\\\\Prueba.txt"));
		while((linea=bf.readLine()) != null){
			System.out.println(linea);
		}
		//Esto solo lee una linea 
		//String linea=bf.readLine();
		//System.out.println(linea);
		//System.out.println(bf.readLine());
		System.out.println("Fin");
		}catch(FileNotFoundException ex) {
			System.out.println("Nel");
		}catch(IOException ex) {
			System.out.println("Nel2");
		}
		
	}
}
