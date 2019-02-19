public class UsaTermometro{
	public static void main(String[] args){	
		Termometro gda=new Termometro();
		Termometro cob=new Termometro(21);
		
		System.out.println("La temperatura en Ciudad Obregon es " + cob.getTemp());
		System.out.println("La temperatura en Guadalajara es de " + gda.getTemp());

		cob.setTemp(27);
		gda.setTemp(27);

		System.out.println("La temperatura en Ciudad Obregon es " + cob.getTemp());
		System.out.println("La temperatura en Guadalajara es de " + gda.getTemp());
	}

}