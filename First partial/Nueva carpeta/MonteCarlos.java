import javax.swing.*;


public class MonteCarlos{
	public static double aproximarPI(int intentos){
		double aciertos=0;
		for(int i=0;i<intentos; i++){
			boolean valor();
			double rX=Math.random();
			double x=-1+2*rX;
			double rY=Math.random();
			double y=-1+2*rY;
			if((x*x+y*y)<=1){
				aciertos++;
			}
		}
		double aproximacion=4*aciertos/intentos;
		return aproximacion;
	}

	

	public static void main(String[] args){
		String strCantidadIntentos=JOptionPane.showInputDialog("Cuantas ocasiones intentare la aproximacion? Entre mayor sea el numero, mejor sera la aproximacion");
		int cantidadIntentos=Integer.parseInt(strCantidadIntentos);
		double valorAproximado=aproximarPI(cantidadIntentos);
		System.out.println("El valor de pi aproximado es de " + valorAproximado);
	}


}