
public class EjemploException {
	public void metodoA() throws Exception {
		this.metodoB();
	}	
	public void metodoB() throws Exception{
		this.metodoC();
	}
	
	public void metodoC() throws Exception{
		this.metodoD();
	}
	public void metodoD() throws Exception{
		if(true) {
			throw new Exception("Ocurrio un error");
		}
	}
	public static void main(String[] args) {
		try {
		EjemploException ee=new EjemploException();		
		ee.metodoA();
		}catch(Exception ex){
			System.out.println("Erroe en main "+ex);
		}
	}
}
