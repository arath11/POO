//JULIO ARATH ROSALES OLIDEN
//A01630738

import java.awt.Color;
import java.awt.Graphics;

public class DianaNumerada extends Diana{

	public DianaNumerada(int xPos, int yPos) {
		super(xPos, yPos);		
		
	}
	
	public void pintaFigura(Graphics g) {
		super.pintaFigura(g);
		
		
		int cA=((this.ancho/2)+this.xPos-(this.ancho/24));
		int cB=((this.ancho/2)+this.yPos+(this.ancho/36));
		
		for(int i=5; i>0;i--) {
			g.drawString("10", cA, cB);
			
			int numeros=-i+10;
		
			String num= Integer.toString(numeros);
			
			if(i%2!=0) {
				g.setColor(Color.WHITE);
			}else {
				g.setColor(Color.BLACK);
			}
			g.drawString(num, cA-(i*(this.ancho/12)), cB);
			g.drawString(num, cA+(i*(this.ancho/12))+(1*(this.ancho/24)), cB);
			g.drawString(num, cA+(1*(this.ancho/12))/3, cB-(i*(this.ancho/12))-(1*(this.ancho/24)));
			g.drawString(num, cA+(1*(this.ancho/12))/3, cB+(i*(this.ancho/12))+(1*(this.ancho/24)));
			
			
			}
			
	}
		
}


