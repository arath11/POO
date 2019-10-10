
public class Polygon {
	private Vertex[] Nombre;
	
	public Polygon(double[] x, double[] y) {
		this.Nombre=new Vertex[x.length];
		for(int i=0; i<x.length; i++) {
				this.Nombre[i]=new Vertex(x[i],y[i]);
		}
	}

	public double getPerimeter(){
		double d=0;
		for(int i=0;i<this.Nombre.length-1;i++) {
			d+=Math.sqrt((this.Nombre[i+1].x-this.Nombre[i].x)*(this.Nombre[i+1].x-this.Nombre[i].x)+(this.Nombre[i+1].y-this.Nombre[i].y)*(this.Nombre[i+1].y-this.Nombre[i].y));
		}
		d+=Math.sqrt((this.Nombre[this.Nombre.length-1].x-this.Nombre[0].x)*(this.Nombre[this.Nombre.length-1].x-this.Nombre[0].x)+(this.Nombre[this.Nombre.length-1].y-this.Nombre[0].y)*(this.Nombre[this.Nombre.length-1].y-this.Nombre[0].y));
		return d;  
	}
	
	public String toString() {
		String a="";
		for(int i=0;i<this.Nombre.length;i++) {
			a+=(this.Nombre[i].x+", "+this.Nombre[i].y+"\n");
		}	
		
		return(a);
	}
	
		
	public static void main(String[] args) {
		//double[] b= {1,1,3,3};
		//double[] c= {1,2,2,1};
		double[] b= {0,0,3};
		double[] c= {0,4,0};
		Polygon a =new Polygon(b,c);
		System.out.println("Los puntos del poligono son:\n"+a);
		System.out.println("El perimetro del poligono es de:\n"+a.getPerimeter());
	}

}

