//slide 2 - Capítulo 1 – Página 2
// RedRect.java: O maior retângulo possível em vermelho

import java.awt.*;
import java.awt.event.*;

public class RedRect extends Frame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		new RedRect();
	}
	
	RedRect() {
		super("RedRect");
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize (200, 100);
		add("Center", new CvRedRect());
		setVisible(true);
		
	}

}