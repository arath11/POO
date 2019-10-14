import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelDibujoMultilineas extends JPanel {
	private int lineas;
	//private PanelControlMultilineas pcm;
	
	//public PanelDibujoMultilineas(PanelControlMultilineas pcm){
	public PanelDibujoMultilineas(){
		super();
		//this.pcm=pcm;
		this.setPreferredSize(new Dimension(600,600));
		
		
	}
	public void setLineas(int l){
		this.lineas = l;
		this.repaint();
	}
	public void setLineas(String lin){
		try{
			int x=Integer.parseInt(lin);
			if(x<16 && x>0){
				this.lineas=Integer.parseInt(lin);
				this.repaint();
			}
			else{
				JOptionPane.showMessageDialog(null, "Numero de lineas no permitido introduce un numero mayor a 0 y menor a 16");
			}
		}
		catch(NumberFormatException a){
			JOptionPane.showMessageDialog(null,"Ingresa un numero mayor a 0 y menor a 16");
		}
		
	}
	public void paintComponent(Graphics g){
		int x = 0, y = this.getHeight();
		super.paintComponent(g);
		
		for(int i=0; i<this.lineas; i++){
			g.drawLine(this.getWidth(), this.getHeight(), x, y);
			y=y-this.getHeight()/this.lineas;
			x=x+this.getWidth()/this.lineas;
			
			
		}
		x=this.getWidth();
		y=this.getHeight();
		for(int i=0; i<this.lineas;i++){
			g.drawLine(0, this.getHeight(), x, y);
			y = y-this.getHeight()/this.lineas;
			x = x-this.getWidth()/this.lineas;
		}
		
		x=this.getWidth();
		y=this.getHeight();
		
		for(int i=0;i<this.lineas;i++){
			
			g.drawLine(this.getWidth(),0,x,y);
			x=x-this.getWidth()/this.lineas;
			y=y-this.getHeight()/this.lineas;
		}
		 x=0; y=this.getHeight();
		for(int i=0; i<this.lineas;i++){
			g.drawLine(0, 0, x, y);
			y = y -this.getHeight()/this.lineas;
			x = x + this.getWidth()/this.lineas;
		}
	}

}
