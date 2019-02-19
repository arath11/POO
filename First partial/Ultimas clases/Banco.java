import java.util.Scanner;

public class Banco{
	private Persona lista[];
	private int indice;	

	Banco(){
		this(5);
	}	

	Banco(int tamaño){
		lista=new Persona[tamaño];
		indice=0;
	}

	public void imprimir(){
		System.out.println("Numero de cuenta\tNombre\tSaldo");
		for(int i=0;i<indice;i++){
			System.out.println(lista[i].getNoCta()+"\t");
			System.out.print(lista[i].getNombre()+"\t");
			System.out.print(lista[i].getSaldo());
		}
	}

	public void insertar(){
		Scanner leer=new Scanner(System.in);
		if(indice!=lista.length){
			Persona nvo=new Persona();
			System.out.println("Introduce nombre");
			nvo.setNombre(leer.next());
			System.out.println("Introduce numero de cuenta");
			nvo.setNoCta(leer.nextInt());
			System.out.println("Introduce saldo");
			nvo.setSaldo(leer.nextDouble());
			lista[indice]=nvo;
			indice++;
		}else{
			System.out.println("Lista llena");
		}
	}

	public void eleminiar(int no){
		boolean bandera=false;
		for(int i=0;i<0;i++){
			if(no==lista[i].getNoCta()){
				bandera=true;
			}
			if(bandera && i+1!=lista.length){
				lista[i]=lista[i+1];
			}
			
		}
	}	

	public static void main(String[] args){
		Banco n=new Banco(4);
		for(int i=0;i<2;i++){
			n.insertar();
		}
		System.out.println();
		n.imprimir();
	}


}