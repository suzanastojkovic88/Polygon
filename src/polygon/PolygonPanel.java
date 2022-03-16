package polygon;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PolygonPanel extends JPanel {

	PolygonPanel() {

		this.setPreferredSize(new Dimension(1000, 1000));
	}

	public void paint(Graphics g) {

		Graphics2D polygon = (Graphics2D) g;

		int[] x = { 100, 100, 300, 500, 700, 700, 500, 300 };
		int[] y = { 300, 400, 600, 600, 400, 300, 100, 100 };
		int n = x.length;

		polygon.setPaint(Color.blue);
		polygon.drawPolygon(x, y, n);
		polygon.setPaint(Color.lightGray);
		polygon.fillPolygon(x, y, n);

		Graphics2D dot = (Graphics2D) g;
		int xDot = 300;
		int yDot = 200;
		dot.setPaint(Color.blue);
		dot.drawOval(xDot, yDot, 8, 8);
		dot.fillOval(xDot, yDot, 8, 8);
		dot.drawString("I", xDot, yDot);

		Graphics2D dots = (Graphics2D) g;

		dots.drawOval(x[0], y[0], 5, 5);
		dots.fillOval(x[0], y[0], 5, 5);
		dots.drawString("C", x[0], y[0]);
		dots.drawOval(x[1], y[1], 5, 5);
		dots.fillOval(x[1], y[1], 5, 5);
		dots.drawString("B", x[1], y[1]);
		dots.drawOval(x[2], y[2], 5, 5);
		dots.fillOval(x[2], y[2], 5, 5);
		dots.drawString("A", x[2], y[2]);
		dots.drawOval(x[3], y[3], 5, 5);
		dots.fillOval(x[3], y[3], 5, 5);
		dots.drawString("H", x[3], y[3]);
		dots.drawOval(x[4], y[4], 5, 5);
		dots.fillOval(x[4], y[4], 5, 5);
		dots.drawString("G", x[4], y[4]);
		dots.drawOval(x[5], y[5], 5, 5);
		dots.fillOval(x[5], y[5], 5, 5);
		dots.drawString("F", x[5], y[5]);
		dots.drawOval(x[6], y[6], 5, 5);
		dots.fillOval(x[6], y[6], 5, 5);
		dots.drawString("E", x[6], y[6]);
		dots.drawOval(x[7], y[7], 5, 5);
		dots.fillOval(x[7], y[7], 5, 5);
		dots.drawString("D", x[7], y[7]);

		boolean inside = false;
		for (int i = 0, j = x.length - 1; i < x.length; j = i++) {
			if (((y[i] > yDot) != (y[j] > yDot)) && (xDot < (x[j] - x[i]) * (yDot - y[i]) / (y[j] - y[i]) + x[i])) {
				inside = !inside;
			}
		}
		if (inside) {
			System.out.println("Tačka se nalazi unutar površine mnogougla.");
		} else {
			System.out.println("Tačka se nalazi izvan površine mnogougla.");
		}
	}

}