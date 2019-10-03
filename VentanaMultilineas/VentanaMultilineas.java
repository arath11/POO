import java.awt.BorderLayout;//Julio Cesar Gonzalez Uribe A01229898

import javax.swing.JFrame;

public class VentanaMultilineas extends JFrame {
	public VentanaMultilineas(){
		super("Multilineas Mejorado");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelControlMultilineas pcm = new PanelControlMultilineas();
		PanelDibujoMultilineas pdm = new PanelDibujoMultilineas(pcm);
		pcm.setPanelDibujoMultilineas(pdm);
		this.add(pdm);
		this.add(pcm,BorderLayout.WEST);
		this.pack();
		this.setVisible(true);

		
	}
	public static void main(String []args){
		VentanaMultilineas window=new VentanaMultilineas();
		window.setVisible(true);
		
	}

}
