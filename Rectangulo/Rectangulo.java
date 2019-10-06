
public class Rectangulo implements Figura{
	//public class Rectangulo extends Figura{
	protected double largo,
					ancho;
	
	public Rectangulo() {
		this(8.0,2.0);
	}
	
	public Rectangulo(double largo, double ancho) {
		this.largo=largo;
		this.ancho=ancho;
	}
	public double perimetro(){
		return 2.0*(this.largo+this.ancho);
	}
	
	public double area(){
		return this.largo*this.ancho;
	}
	
	public String toString() {
			return ("Rectangulo de largo: "+this.largo+" y de ancho:"+this.ancho);
	}

	public double volumen() {
		return 0.0;
	}
	
	public static void main(String[] args) {
		Figura[] figuras= {new Rectangulo(4,5),new Cuadrado(5.0),new Caja(),new Caja(2,3,4)};
		Figura figura=new Rectangulo();
		for(int i=0;i<figuras.length;i++) {
			System.out.println(figuras[i]);
			System.out.println("Perimetro: "+ figuras[i].perimetro());
			System.out.println("Area: "+ figuras[i].area());
			System.out.println("Volumen: "+figuras[i].volumen());
			if(figuras[i] instanceof Caja) {
				((Caja)figuras[i]).saluda();//es mejor asi, en una sola linea
				/*
				Caja caja=(Caja)figuras[i];
				caja.saluda();
				*/
			}
			System.out.println("---------------------");
			
		}
	}
}
