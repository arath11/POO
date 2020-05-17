


import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DianaPanelDibujo extends JPanel implements MouseListener, MouseMotionListener{
//public class DianaPanelDibujo extends JPanel implements MouseListener, MouseMotionListener{
	private DianaNumerada diana;
	
	public DianaPanelDibujo() {
		super();
		this.setPreferredSize(new Dimension(800,600));
		this.diana=new DianaNumerada(200,200);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.setBackground(Color.GRAY);
	}
	
	public DianaNumerada getDiana() {
		return this.diana;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.diana.pintaFigura(g);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.diana.setAncho((int)Math.sqrt(Math.pow(e.getX(), 2)+Math.pow(e.getY(), 2)));
		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.diana.setPosicionInicial(e.getX(), e.getY());
		this.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}




	
	
	

