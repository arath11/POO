//JULIO ARATH ROSALES OLIDEN
//A01630738

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Diana{
	protected Color colorCentro;

	
	protected int xPos,
				yPos,
				ancho;
	
	
	public Diana(int xPos, int yPos) {
		this.xPos=xPos;
		this.yPos=yPos;
		ancho=200;
		colorCentro=Color.RED;
	}
	
	public void setAncho(int ancho) {
		this.ancho=ancho;
	}
	public int getAncho() {
		return this.ancho;
	}
	
	public void setColorCentro(Color colorCentro) {
		this.colorCentro=colorCentro;
	}
	
	public Color getColorCentro() {
		return this.colorCentro;
	}
	
	public void setPosicionInicial(int xPos, int yPos) {
		this.xPos=xPos;
		this.yPos=yPos;
	}
			
	

	public void pintaFigura(Graphics g) {
		for(int i=6;i>0;i--) {
			int rX=this.ancho/12*i;
			int rY=this.ancho/12*i;
			if(i%2==0) {
				g.setColor(Color.BLACK);
			}else if(i%2!=0 && i!=1) {
				g.setColor(Color.WHITE);
				
			}else {
				g.setColor(this.colorCentro);
			}
			g.fillOval(this.xPos+(this.ancho/2 - rX), this.yPos+(this.ancho/2 - rY), 2 * rX, 2 * rY);
		}
		
	}

}	