
public class Vertex {
	protected double x,
					y;
	public  Vertex(double x, double y) {
		this.x=x;
		this.y=y;
	}
		
	public String toString(){
		return (this.x+", "+this.y);
	}	

	public static void main(String[] args) {
		Vertex prueba=new Vertex(1,2);
		System.out.println(prueba);
	}
}
