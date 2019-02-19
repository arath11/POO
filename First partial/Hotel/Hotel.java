public class Hotel{
	private Habitacion[] cuartos;
  
	private String nombre;
	

	public Hotel(String nombre, int habitaciones){
  
 	 	this.nombre = nombre;
  
		this.cuartos = new Habitacion[habitaciones];
  
		for(int i=0; i<habitaciones; i++){
     
			this.cuartos[i] = new Habitacion(i+100);

		}
  
	}

  


	/*
		
	public Hotel(String nombre, int habitaciones){
		this.nombre=nombre;
		this.cuartos=new Habitacion[habitaciones];
		for(int i=0;i<this.cuartos.length;i++){
			this.cuartos[i]=new Habitacion(i+100);
		}
	}	
	*/
	public int checkIn(String nombre, int adultos, int niños, double credito){
 
		for(int i=0;i<this.cuartos.length;i++){
			if(this.cuartos[i].getDisponible()){
				this.cuartos[i].checkIn(nombre,adultos,niños,credito);
				return i+100;
			}	
		}
		return -1;
	}
	
	public boolean checkOut(int numero){
		if(numero>=100 && numero<(this.cuartos.length+100)){
			return this.cuartos[numero-100].checkOut();
		}
			return false;
	}
	public double getTotalXTarifaBase(){
		double total=0;
		for(int i=0;i<this.cuartos.length;i++){
			if(this.cuartos[i].getDisponible()){
				total+=this.cuartos[i].getTarifaBase();
			}
		}
		return total;
	}
	public boolean realizarCargoHabitaciones(int numero, double cargo){

		if(!this.cuartos[numero-100].getDisponible()){

			return this.cuartos[numero-100].realizarCargo(cargo);
		}
		return false;
  
	}

  

	
	public String toString(){
		String datos;
		datos="La ocupacion en el hotel:"+this.nombre;
		for(int i=0;i<this.cuartos.length;i++){
			if(!this.cuartos[i].getDisponible()){
				datos+="\nLa habitacion "+(i+100)+ " se encuentra \tocupada";
			}		
		}
		return datos;
	}

	public static void main(String[] args){
		Hotel prueba=new Hotel("Julio", 100);
		System.out.println(prueba.checkIn("Agsutin", 5, 10, 10000));
		System.out.println(prueba.checkIn("Xulian", 2, 10, 4000));

		System.out.println(prueba.checkIn("Juan", 2, 5, 200));
		System.out.println(prueba.checkIn("Juan", 2, 5, 200));
		System.out.println(prueba.checkIn("Juan", 2, 5, 200));
		System.out.println( prueba.checkIn("Juan", 2, 5, 200));
		prueba.toString();
		prueba.checkOut(102);
		System.out.println("\n--------------------------------------------------\n");
		System.out.print(prueba.toString());
		System.out.println("\n--------------------------------------------------\n");

		System.out.println("Tarifa base: " + prueba.getTotalXTarifaBase());


		System.out.println("\n--------------------------------------------------\n");

		prueba.realizarCargoHabitaciones(100, 1200);

		prueba.toString();


  
	}
		
}
