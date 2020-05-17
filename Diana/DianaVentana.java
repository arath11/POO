

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class DianaVentana extends JFrame{
	public DianaVentana() {
		super("Diana");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		DianaPanelDibujo pd=new DianaPanelDibujo();
		this.add(pd);
		//this.add(new PanelControles(pd),BorderLayout.WEST);
		//this.add(new MyPanelControles(pd),BorderLayout.WEST);
		//.add() adds components in order to be able to visualize them on the display.
		this.pack();
		this.setVisible(true);
	}
		
	public static void main(String[] args) {
		DianaVentana prueba=new DianaVentana();
	}
}	


