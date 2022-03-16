package polygon;

import javax.swing.JFrame;

public class Frame extends JFrame {

	PolygonPanel p;

	Frame() {

		p = new PolygonPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add(p);
		this.pack();
		this.setVisible(true);
	}
}