public class ZonaHoraria{
	private Clock[] zonaHorarias;

	public ZonaHoraria(){
		this.zonaHorarias=new Clock[10];	
	}

	public void ponerHora(int pos,int hr, int min, int sec, String cd){
		if(this.zonaHorarias[pos]==null){//creo uno nuevo
			this.zonaHorarias[pos]=new Clock(hr,min,sec,cd);			
		}else{//no creo uno nuevo
			this.zonaHorarias[pos].setTime(hr,min,sec);
			this.zonaHorarias[pos].setCiudad(cd);		
		}

			
	}

	public String toString(){
		String resultado="";
		for(int i=0;i<this.zonaHorarias.length;i++){
			if(this.zonaHorarias[i]!=null){
				resultado+=this.zonaHorarias[i].toString()+"\n";
			}
		}
		return resultado;
	}
	
	public void cambiarHorarioInvierno(){
		for(int i=0;i<this.zonaHorarias.length;i++){
			if(this.zonaHorarias[i]!=null){
				this.zonaHorarias[i].incrementHours();
			}
		}
	}


	public static void main(String[] args){
		Clock reloj=new Clock(5,8,40,"Zapopan");
		System.out.println(reloj);
		//to string de clock

		ZonaHoraria zh=new ZonaHoraria();
		zh.ponerHora(0,10,26,30,"NY");
		zh.ponerHora(1,10,26,30,"PARIS");
		zh.ponerHora(2,10,26,30,"MOSCU");

		zh.ponerHora(3,8,26,30,"Guadalajara");
		System.out.println(zh);
		zh.cambiarHorarioInvierno();
		System.out.println("---Cambiamos a hoario de invierno---");
		System.out.println(zh.toString());
	}	
}