package gui.domain;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class ObserverWindow extends JFrame implements Observer {
	
	static int index = 0;
	private Rectangle r = new Rectangle();
	
	private final int width = 220;
	private final int height = 220;
	private final int buffer = 10;
	private Image image;	
	
	public ObserverWindow(Background background){
		setSize(width, height);
		setLocation(width, ((height * index) + buffer));
		index++;
		setVisible(true);
		image = background.getImage();
	}
	
	public void paint(Graphics g) {
		if (image != null) {
			g.drawImage(image, 0, 0, getWidth(), getHeight(), 
					r.x, r.y, 
					r.x + height, r.y + width, 
					null);
		}		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		r = (Rectangle)arg1;
		paint(this.getGraphics());
	}
}