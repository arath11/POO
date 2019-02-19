import javax.swing.*;
import java.util.Scanner;

public class IntroJava{
	public static void calificacion(){
		String strCalif=JOptionPane.showInputDialog("Dame tu calificacion");
		int calif=Integer.parseInt(strCalif);
		if(70>calif){
			System.out.println("Reprobado");	
		}else{
			System.out.println("Aprobado");
		}
	}


	public static void numerosDel1Al100(){
		for(int i=0; i<100; i++){
			System.out.println(i);
		}			

	}


	public static void serie(int base){
		for(int i=0; i<50; i++){
			System.out.print(base*(i+1)+",");	
		}
		System.out.println();	
	}

	public static int calorias(){
		Scanner lector=new Scanner(System.in);
		int numComidas=lector.nextInt();
		int totalCalorias=0;
		for(int i=0;i<numComidas;i++){
			System.out.println("Dime cuantas calorias consuiste en tu comida numero"+(i+1));
			totalCalorias+=lector.nextInt();
		}
		return totalCalorias;
	}


	public static void main(String[] args){
		calificacion();
		numerosDel1Al100();
		serie(7);
		int caloriasTotales=calorias();
		System.out.println("El total de calorias consuids fue"+caloriasTotales)
	}
}