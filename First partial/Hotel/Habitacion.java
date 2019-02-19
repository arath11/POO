public class Habitacion{
	private int numero,
                   adultos,
		    niños;
	private String nombre;
	private double credito,
		       cargo;
	private boolean disponible;
	
	public Habitacion(int numero){
		this.numero=numero;
		this.disponible=true;
	}

	public int getNumero(){
		return this.numero;
	}
	
	public boolean getDisponible(){
		return this.disponible;
	}
	
	public void checkIn(String nombre, int adultos, int niños, double credito){
		this.nombre=nombre;
		this.adultos=adultos;
		this.niños=niños;
		this.credito=credito;
		this.disponible=false;
	}
	
	public boolean checkOut(){
		if(disponible==false){
			this.nombre="";
			this.adultos=0;
			this.niños=0;
			this.credito=0;
			this.disponible=true;
			return true;
		}else{
			this.disponible=true;
			return false;
		}
	}
	public double getTarifaBase(){
		return this.adultos*350+this.niños*100;
	}
	
	public boolean realizarCargo(double cargo){
		if (cargo>0 && cargo>this.cargo){
			this.cargo=this.cargo-cargo;
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return (" Habitacion: "+this.numero+"\nHuesped: "+this.nombre+"\nTarifa base: "+getTarifaBase()+"\n credito: " + this.credito +"\n Cargos:"+this.cargo);
	}	

	public static void main(String[] args){
		Habitacion prueba = new Habitacion(17);
    
		prueba.checkIn("Carlos", 2, 2, 1200.00);
		System.out.println("1  "+prueba.getNumero());
	    
    System.out.println("2  "+prueba.getDisponible());

		System.out.println("3  "+prueba.getTarifaBase());
		System.out.println(prueba);
            
    prueba.realizarCargo(500);
            
    System.out.println(prueba);

  
	}
}