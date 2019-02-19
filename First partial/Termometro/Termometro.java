public class Termometro{
	private int temp;

	public Termometro(){
		temp=24;
	}

	public Termometro(int t){
		temp=t;
	}

	
	public int getTemp(){
		return temp;
	}

	public void setTemp(int t){
		temp=t;
	}

	public static void main(String[] args){
		Termometro gda=new Termometro()	;
		Termometro cob=new Termometro(21);
		
		System.out.println("La temperatura en Ciudad Obregon es " + cob.temp);
		System.out.println("La temperatura en Guadalajara es de " + gda.temp);

		cob.temp=27;
		gda.temp=27;

		System.out.println("La temperatura en Ciudad Obregon es " + cob.temp);
		System.out.println("La temperatura en Guadalajara es de " + gda.temp);

	}

}