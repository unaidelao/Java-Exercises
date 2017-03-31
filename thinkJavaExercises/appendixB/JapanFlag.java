/**
 * Think Java v.6 - Appendix B, Exercise B.1
 *
 * Draw the flag of Japan: a red circle on a white background that is wider
 * than it is tall.
 *
 * @author Unai de la O
 */

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class JapanFlag extends Canvas {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Japan Flag");
    Canvas canvas = new JapanFlag();
    canvas.setSize(600, 400);
    canvas.setBackground(Color.white);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
  }

  public void paint(Graphics g) {
    g.setColor(Color.red);
    g.fillOval(150, 50, 300, 300);
  }
}
