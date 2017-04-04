/**
 * Think Java v.6 - Appendix B, Exercise B.3
 *
 * Draw and experiment with Moire patterns.
 *
 * @author Unai de la O
 */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Moire extends Canvas {

  public void paint(Graphics g) {
    int x = 0;
    int y = 0;
    int width = getWidth();
    int height = getHeight();

    while (x < getWidth()) {
      g.drawOval(x, y, width, height);
      width -= 10;
      height -= 10;
      x += 5;
      y += 5;
    }

    // declaring variables for g.drawLine() method
    int x1 = 0;
    int y1 = 0;
    int x2 = 400;
    int y2 = 400;

    /*
     * prints 10 equidistant lines passing through the center of the circle
     * along the x-axis
     */
    while (x1 <= 400) {
      g.drawLine(x1, y1, x2, y2);

        x1 += 40;
        x2 -= 40;
    }

    /*
     * prints 10 equidistant lines passing through the center of the circle
     * along the y-axis
     */
    while (y1 <= 400) {
      g.drawLine(x1, y1, x2, y2);

      y1 += 40;
      y2 -= 40;
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Moire Pattern");
    Canvas canvas = new Moire();
    canvas.setSize(400, 400);
    canvas.setBackground(Color.white);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
  }
}
