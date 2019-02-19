import javax.swing.*;
import java.util.Scanner;

public class IntroJava{
	public static void calificacion(){
		String strCalif=JOptionPane.showInputDialog("Dame tu calificacion");
		int calif=Integer.parseInt(strCalif);
		if (calif>=70){
			System.out.println("Aprobado");
		}
		else{
			System.out.println("Reprobado");
		}
	}

	public static void numerosDel1Al100(){
		for(int i=0; i<100; i++){
			System.out.println(i+1);
		}
	}

	public static void serie (int base){
		for(int i=0; i<49; i++){
			System.out.print(base*(i+1)+",");
		}
		System.out.println((base*50)+".");
	}

	public static int calorias(){
		Scanner lector=new Scanner(System.in);
		System.out.println("Cuantas comdas hiciste hoy?");
		int numComidas=lector.nextInt();
		int totalCalorias=0;
		for (int i=0; i<numComidas; i++){
			System.out.println("Dime cuantas calorias consumiste en tu comida # "+(i+1));
			totalCalorias+=lector.nextInt();
		}
		return totalCalorias;
	}	

	/*Este comentario esta 
	  en varias lineas 
	  y ya se terminó*/
	public static void main(String[] args){
		calificacion();
		numerosDel1Al100();
		serie(7);
		int caloriasTotales=calorias();
		System.out.println("El total de calorias consumidas fue "+caloriasTotales);
	}
}