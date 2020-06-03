
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics){
        // create a function that draws one square and takes 3 parameters:
        int x=0;
        int y=0;
        for (int i = 0; i < 10; i++) {
           squareDraw(x,y,graphics);
           x=x+50;
           y=y+50;

        }

        // the x and y coordinates of the square's top left corner and the graphics
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.00



    }
    public static void squareDraw (int x, int y, Graphics graphics){
        graphics.setColor(Color.green);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(3));
        graphics.drawLine(x - 50, y, x - 50, y - 50);
        graphics.drawLine(x - 50, y - 50, x + 50, y - 50);
        graphics.drawLine(x + 50, y - 50, x + 50, y + 50);
        graphics.drawLine(x + 50, y + 50, x - 50, y + 50);
        graphics.drawLine(x - 50, y + 50, x - 50, y);
    }
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }

}