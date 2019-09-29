
import javax.swing.JFrame;

public class VentanaPalomino extends JFrame{

    public VentanaPalomino() {
        super("Proyecto Palomino");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        PalominoPanelDibujo palomino= new PalominoPanelDibujo();
        this.add(palomino);
       
        // this.setSize(500, 500);
        this.setVisible(true);
        this.pack();
    }

    public static void main(String[] args) {
    	VentanaPalomino Ventana =new VentanaPalomino();


    }
}



