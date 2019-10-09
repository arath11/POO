//Julio Arath Rosales Oliden
//A01630738
//Espiral.java y PolygonsPanel
//20/03/19

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

class PolygonsPanel extends JPanel {
		private int figura, 
		vertices;

		private double radio;
		protected void paintComponent(Graphics g) {
	    super.paintComponent(g);

	   figura = 4;
	   vertices = 25;
	   radio=1.1;
	    int xCenter = getWidth() / 2;
	    int yCenter = getHeight() /2;
	    int radius = 15;
	    int[] x = new int[vertices];
	    int[] y = new int[vertices];
	    
	    
	    for(int i=0;i<vertices;i++) {
	    	 x[i]=(int)(xCenter + (radius*(i*radio)) *Math.cos(i * 2 * Math.PI / figura));
	    	y[i]=(int)(yCenter - (radius*(i*radio)) *Math.sin(i * 2 * Math.PI / figura));	 
	    }

	    g.setColor(Color.black);
	    g.drawPolyline(x, y, vertices);
	      
		}    
		public void setRadio(int radio) {
			this.radio=radio;
			this.repaint();
		}
		public void setFigura(int figura) {
			this.figura=figura;
			this.repaint();
		}
		public void setVertices(int radio) {
			this.vertices=vertices;
			this.repaint();
		}
		
}    
	 