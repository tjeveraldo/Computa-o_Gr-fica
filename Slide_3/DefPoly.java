//slide 3
//capítulo 1
// DefPoly.java: Desenhando um polígono.

import java.awt.*;
import java.awt.event.*;

public class DefPoly extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new DefPoly();
	}
	
	DefPoly() {
		super("Defina os vértices do polígono clicando");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setSize (500, 300);
		add("Center", new CvDefPoly());
		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		setVisible(true);
	}
}