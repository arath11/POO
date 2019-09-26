import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Julio Arath Rosales Oliden 
//A01630738
//YaMeHiceBolas.java
//26/08/19

public class YaMeHiceBolas extends 	JFrame{

	private int nivel,
				largo,
				x1,
				y1;
	
	public YaMeHiceBolas() {
		super("Ya Me Hice Bolas");
		this.setSize(720,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
		this.nivel=Integer.parseInt(JOptionPane.showInputDialog("Nivel"));
		this.setVisible(true);
		x1=50;
		y1=350;
		this.largo=600;
	}
	
	public void dibujarCirculo(Graphics g, int x1, int y1, int largo) {
		g.drawOval(x1, y1, largo, largo);
	}

	

	public void pintaCirculos(Graphics g , int nive , int x1 , int y1 , int largo) {
		dibujarCirculo(g,x1,y1,largo);
		if(nive==0) {
			dibujarCirculo(g,x1,y1,largo);
		}else {
			//hace la mitad de los siguientes circulos 	
			this.pintaCirculos(g, nive-1, x1, y1+largo/4, largo/2);
			this.pintaCirculos(g, nive-1, x1+largo/2, y1+largo/4, largo/2);
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		this.pintaCirculos(g,nivel,x1,y1-300,largo);
	}	
	
	public static void main(String[] args) {
		YaMeHiceBolas prueba=new YaMeHiceBolas();
	}
}
