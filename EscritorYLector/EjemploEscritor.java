import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploEscritor {
	public static void main(String[] args) {
		try {
			//FileWriter fw=new FileWriter("C:\\Users\\J4\\Documents\\Uni\\2 semetre\\POO\\Prueba.txt");
			PrintWriter pw= new PrintWriter(new FileWriter("C:\\Users\\J4\\Documents\\Uni\\2 semetre\\POO\\Prueba.txt"));
			for(int i=0;i<100;i++) {
				pw.println(i+1);
			}
			//pw.println("Este archivo de texto lo estoy generando desde java");
			//pw.println("Espero que todo funcione correctamente\nBueno BYE!!:D");
			pw.close();
			System.out.println("Ya termine");
		}catch(IOException ex) {
			System.out.println("Error"+ex);
		}
	}
}
