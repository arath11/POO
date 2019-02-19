import java.util.Random;

public class Baraja{
	private Naipe[] cartas; //objetos de tipo naipe
	
	public Baraja(){	
		this.cartas=new Naipe[52];
		int c=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				this.cartas[c++]=new Naipe(j,i);
			}
		}
	}
	
	public String toString(){
		String acum="";
		for(int i=0;i<this.cartas.length;i++){
			acum+=this.cartas[i]+"\n";
		}
		return acum;
	}
	
	public void mezcla(){
		Random aleatorio=new Random();
		int posA;
		Naipe tmp;
		for(int i=0;i<this.cartas.length;i++){
			posA=aleatorio.nextInt(52);
			tmp=this.cartas[i];
			this.cartas[i]=this.cartas[posA];
			this.cartas[posA]=tmp;
		}
	}
		
	public static void main(String[] args){
		Baraja baraja=new Baraja();
		for(int i=0;i<52;i++){
			System.out.println(baraja.cartas[i]);
		}
		System.out.println(baraja);		
		baraja.mezcla();
		System.out.println();
		System.out.println(baraja);		
	}
}