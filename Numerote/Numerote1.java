import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


import javax.swing.*;


public class Numerote {
	
	
	byte[] numerote;
	boolean signo = true;
		
	public Numerote() {
		this("0");
	}
	
	public Numerote(String a) {
		String[] aSplit=a.split("");
		if(aSplit[0].equals("-")) {
			this.signo = false;
			this.numerote = new byte[a.length()-1];
			String[] arreglo = new String[a.length()-1];
			for(int i=1; i<aSplit.length;i++) {
				arreglo[i-1] = aSplit[i];
			}
			for(int i=0;i<arreglo.length;i++) {
				this.numerote[i] = (byte) Integer.parseInt(arreglo[i]);
			}
		}else {
			this.numerote = new byte[aSplit.length];
			for(int i=0;i<aSplit.length;i++) {
				this.numerote[i] = (byte) Integer.parseInt(aSplit[i]);
			}
		}
		for(int i=0; i<this.numerote.length/2; i++){
			byte temp = this.numerote[i];
			this.numerote[i] = this.numerote[this.numerote.length -i -1];
			this.numerote[this.numerote.length -i -1] = temp;
		}
	}
	/*
		String num = a.toString();		
		int ind = a.length()-1;
		if(num.startsWith("-")){
			this.signo=false;
			num=num.substring(1);   
			String[] aSplit=num.split("");
			ind=aSplit.length-1;
			numerote = new byte[a.length()-1];
			for(int i=0; i<num.length()-1; i++) {
				numerote[ind--] = Byte.parseByte(aSplit[i]);
				}
		}else {
			String[] aSplit=num.split("");
			numerote = new byte[aSplit.length];
			for(int i=0; i<a.length()-2; i++) {
				numerote[ind--] = Byte.parseByte(aSplit[i]);
			}
		}
	}*/
	
	/*public Numerote multiplicacion(Numerote a) {
		Numerote resultado=new Numerote("0");
		String renglon,
				ceros = "";

		int carry;
		System.out.println("A: "+this.numerote[this.numerote.length-1]+"..."+ this.numerote[0]);
		for(int i=0; i<a.numerote.length; i++) {
      		renglon = "";
      		carry = 0;
      		for(int j=0; j<this.numerote.length; j++) {
      			renglon += (a.numerote[i]*this.numerote[j] + carry)%10;
      			carry = (a.numerote[i]*this.numerote[j]+carry)/10;
      		
          }
      	
      	renglon += String.valueOf(carry);
      	resultado = resultado.suma(new Numerote(new StringBuilder(renglon).reverse().toString()+ceros));
      	ceros += "0";
      	}
			if(this.signo==a.signo) {
				resultado.signo=true;
			}else {
				resultado.signo=false;
			}
		return resultado;
	}
	*/
	
	public Numerote multiplicacion(Numerote a) {
		Numerote numeroteTemporal=new Numerote();
		if(a.numerote.length<=this.numerote.length) {
			for(int i=0;i<a.numerote.length;i++) {
				String agregarCeros="";
				if(i!=0) {
					for(int k=0;k<i;k++) {
						agregarCeros+="0";
					}
					}
				String suma=agregarCeros;
				int carry=0;
				int contador=0;
				for(int j=0;j<this.numerote.length;j++) {
					contador+=1;
					suma=Integer.toString((this.numerote[j]*a.numerote[i]+carry)%10)+suma;
					carry=((this.numerote[j]*a.numerote[i]+carry)/10);		
				}
				if(carry!=0) {
					suma=Integer.toString(carry)+suma;
				}
		
				Numerote Pba=new Numerote(suma);
				numeroteTemporal=numeroteTemporal.suma(Pba);	
			}
		}else if(this.numerote.length<a.numerote.length) {
			for(int i=0;i<this.numerote.length;i++) {
				String agregarCeros="";
				if(i!=0) {
					for(int k=0;k<i;k++) {
						agregarCeros+="0";
					}
				}
				String suma=agregarCeros;
				int carry=0;
				for(int j=0;j<a.numerote.length;j++) {
					suma=Integer.toString((this.numerote[i]*a.numerote[j]+carry)%10)+suma;
					carry=((this.numerote[i]*a.numerote[j]+carry)/10);
				}if(carry!=0) {
					suma=Integer.toString(carry)+suma;
				}
		
				Numerote Pba=new Numerote(suma);
				numeroteTemporal=numeroteTemporal.suma(Pba);	
			}
		}
		if(this.signo==a.signo) {
			numeroteTemporal.signo=true;
		}else {
			numeroteTemporal.signo=false;
		}
		return numeroteTemporal;
	}
	
	
	public Numerote suma(Numerote a) {
			String suma="";
			int carry=0;
			Numerote numeroteTemporal=new Numerote();			
			if(this.signo == a.signo) {
				if (a.numerote.length<=this.numerote.length){//this mayor
					for(int i=0; i<this.numerote.length;i++) {
						try {
							suma=Integer.toString((this.numerote[i]+a.numerote[i]+carry)%10)+suma;		
							carry=((this.numerote[i]+a.numerote[i]+carry)/10);
						}catch(ArrayIndexOutOfBoundsException error) {
							suma=Integer.toString((this.numerote[i]+carry)%10)+suma;
							carry=((this.numerote[i]+carry)/10);	
						}	
					}
					if(carry!=0) {
						suma=Integer.toString(carry)+suma;
					}
				}else if(this.numerote.length<a.numerote.length) {
					for(int i=0; i<a.numerote.length;i++) {
						try {
							suma=Integer.toString((this.numerote[i]+a.numerote[i]+carry)%10)+suma;		
							carry=((this.numerote[i]+a.numerote[i]+carry)/10);
						}catch(ArrayIndexOutOfBoundsException error) {
							suma=Integer.toString((a.numerote[i]+carry)%10)+suma;
							carry=((a.numerote[i]+carry)/10);	
						}	
					}
					if(carry!=0) {
						suma=Integer.toString(carry)+suma;
					}
				}
				
				
				numeroteTemporal=new Numerote(suma);
				if((this.signo && a.signo)==false) {
					numeroteTemporal.signo=false;
				}else {
					numeroteTemporal.signo=true;	
				}
			}else {
				//llama el metodo resta
			}
			return numeroteTemporal;
	}
	
	
	/*
	if (a.numerote.length<this.numerote.length){//this mayor
		for(int i=0;i<a.numerote.length;i++) {
			suma=Integer.toString((this.numerote[i]+a.numerote[i])%10+carry)+suma;		
			carry=((this.numerote[i]+a.numerote[i])/10);
		}
		for(int tamaño=a.numerote.length;tamaño<this.numerote.length;tamaño++) {
			suma=Integer.toString(this.numerote[tamaño]+carry)+suma;
			carry=0;
		}
	}else if(this.numerote.length<a.numerote.length){//a mayor 
		for(int i=0;i<this.numerote.length;i++) {
			suma=Integer.toString((this.numerote[i]+a.numerote[i])%10+carry)+suma;		
			carry=((this.numerote[i]+a.numerote[i])/10);
		}
		for(int tamaño=this.numerote.length;tamaño<a.numerote.length;tamaño++) {
			suma=Integer.toString(a.numerote[tamaño]+carry)+suma;
			carry=0;
		}
	}else{
		for(int i=0;i<a.numerote.length;i++) {//iguales 
			suma=Integer.toString((this.numerote[i]+a.numerote[i])%10+carry)+suma;		
			carry=((this.numerote[i]+a.numerote[i])/10);
		}
		if(carry!=0) {
			suma=Integer.toString(carry)+suma;
		}
	}*/
	

	public Numerote resta(Numerote a) {
		Numerote numeroteTemporal=new Numerote();
		if(this.signo==a.signo) {//restas
			
		}else {
			if(this.signo==true) {
				this.signo=a.signo=true;
				System.out.println(1);
				numeroteTemporal=this.suma(a);
				numeroteTemporal.signo=true;
			}else {
				this.signo=a.signo=true;
				System.out.println(2);
				numeroteTemporal=this.suma(a);
				numeroteTemporal.signo=false;
			}			
		}
		return numeroteTemporal;
	}


	
	public String toString() { 
		String completo="";
		for(int i=this.numerote.length-1;i>-1;i--) {
			completo+=this.numerote[i];	
		}
		if(this.signo==false) {
			completo="-"+completo;
		}
		System.out.println(this.signo);
		return completo;
	}
	
	public static void ejecutarArchivo(String entrada, String salida) {
		try {
			String lineaCompleta,
					numeroThis,
					numeroA,
					operacion;
			StringTokenizer st;
			BufferedReader bf= new BufferedReader(new FileReader(entrada+".txt"));
			PrintWriter pw= new PrintWriter(new FileWriter(salida+".txt"));
			while((lineaCompleta=bf.readLine())!=null) {
				st =new StringTokenizer(lineaCompleta,",");
				numeroThis=st.nextToken();
				numeroA=st.nextToken();
				operacion=st.nextToken();
				if(operacion.equals("r")) {
					Numerote numeroteTemporal=new Numerote(numeroThis);
					pw.println(numeroteTemporal.resta(new Numerote(numeroA)));
					
					System.out.println(numeroteTemporal);
				}else if(operacion.equals("s")) {
					Numerote numeroteTemporal=new Numerote(numeroThis);
					pw.println(numeroteTemporal.suma(new Numerote(numeroA)));
			
					System.out.println(numeroteTemporal.suma(new Numerote(numeroA)));
				}else if(operacion.equals("m")) {
					Numerote numeroteTemporal=new Numerote(numeroThis);
					pw.println(numeroteTemporal.multiplicacion(new Numerote(numeroA)));
					
					System.out.println(numeroteTemporal.multiplicacion(new Numerote(numeroA)));
				}else {
					System.out.println("error loop");
				}
			}
			bf.close();
			pw.close();
		}catch(FileNotFoundException error) {
			System.out.println(error);
		}catch(IOException error) {
			System.out.println(error);
		}
	}
	public static void main(String[] args) {
		String a=JOptionPane.showInputDialog("Inserta el numero ");
		Numerote prueba= new Numerote(a);
		System.out.println(prueba.toString());
		String b=JOptionPane.showInputDialog("Inserta el numero "); 
		Numerote prueba2= new Numerote(b);
		System.out.println(prueba2.toString());
		Numerote c= new Numerote();
		c=prueba.multiplicacion(prueba2);
		System.out.println(c);
		/*
		String e="entrada";
		String s="salida2";
		ejecutarArchivo(e,s);
		System.out.println("Termine");
		*/
	}
}
