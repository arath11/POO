public class Naipe{
	private int valor;//0-as, 1-dos-10joto,11reina, 12rey 
	private int figura;//0 -espadas, 1- corazones, 2- tréboles y 3- dimiantes
	private static String[] valores={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Joto","Reina","Rey"};
	private static String[] figuras={"Espadas","Corazones","Treboles","Diamantes"};

	public Naipe(int valor, int figura){
		this.valor=valor;
		this.figura=figura;	
	}

	public String toString(){		
		return 	Naipe.valores[this.valor]+" de "+ Naipe.figuras[this.figura];
	}

	public static void main(String[] args){
		Naipe reinaCorazones=new Naipe(11,1);	
		System.out.println(reinaCorazones);
		Naipe ochoDiamantes=new Naipe(7,3);
		System.out.println(ochoDiamantes);	
	}

}