public class Persona{
	private String nombre;
	private Double saldo;
	private int noCta;



	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setSaldo(Double saldo){
		this.saldo=saldo;
	}
	
	public double getSaldo(){
		return saldo;
	}

	public void setNoCta(int no){
		this.noCta=no;
	}

	public int getNoCta(){
		return noCta;
	}
	
	
}
