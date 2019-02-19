public class Triangulo{
	private double x1,
		       x2,
		       x3,
		       y1,
		       y2,
		       y3,
		       area;
	
	//Crea un triangulo simple de 3 de base y 3 de altura
	public Triangulo(){	
		this(0,3,0,0,3,3);
	}
	
	//permite ingresar los datos para generar un triangulo de cualquier tamaño
	public Triangulo(double x1,double x2,double x3,double y1,double y2,double y3){
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
	}


	//permite calcular el area del triangulo y le aplica un valor absoluto 
	public double area(){
		return 	Math.abs(((x1*y2)+(x2*y3)+(x3*y1))-((x1*y3)+(x3*y2)+(x2*y1)))/2;
			
	}
		
	

	public static void main(String[] args){
		//creamos un triangulo llamado simple 
		//ENTRADA DE CORDENADAS X1,X2,X3,Y1,Y2,Y3
		Triangulo simple=new Triangulo(0,3,0,0,3,3);
		//conseguimos e imprimimos el area
		double area=simple.area();
		System.out.println("El area es de: "+area+" unidades de area, con las cordenadas:(" +simple.x1+", "+simple.y1+"),("+simple.x2+", "+simple.y2+"), ("+simple.x3+", "+ simple.y3+")");
	
	}
}