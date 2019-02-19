//Julio Arath Rosales Oliden 
//A01630738
//Complejo.java
//11/2/2019


public class Complejo{
	private double real,
		       imaginario;

	
	public Complejo(){
		this(0,0);
	}

	public Complejo(double real, double imaginario){
		this.establecer(real,imaginario);
	}

	public void establecer(double real, double imaginario){
		this.real=real;
		this.imaginario=imaginario;		
	}
	
	
	public void imprimir(){
		System.out.println(this.real+"+("+this.imaginario+"i)");
	}
	
	public void agregar(double real, double imginario){
		this.real+=real;
		this.imaginario+=imaginario;
	}
	
	
	public Complejo suma(Complejo entrada){
		double x=(this.real+entrada.real);
		double y=(this.imaginario+entrada.imaginario);
		Complejo z= new Complejo(x,y);
		return	z;
	}
	
	public Complejo resta(Complejo entrada){
		return new Complejo(this.real-entrada.real,this.imaginario-entrada.imaginario);
	}

	public Complejo multiplicacion(Complejo entrada){	
		return new Complejo((this.real*entrada.real-this.imaginario*entrada.imaginario),(this.real*entrada.imaginario+this.imaginario*entrada.real));
	}

	
	public Complejo	multiplicacion(double b){
		return new Complejo(this.real*b,this.imaginario*b);
	}

	
	public Complejo conjugado(Complejo entrada){
		return new Complejo(entrada.real,-entrada.imaginario);
	}

	public static void main(String args[]){
		Complejo a=new Complejo(1,1);
		a.imprimir();
		Complejo b=new Complejo(2,2);
		b.imprimir();
		b.establecer(3,3);
		b.imprimir();
		b.agregar(1,2);
		b.imprimir();
		b.establecer(2,2);
			
	}


}

