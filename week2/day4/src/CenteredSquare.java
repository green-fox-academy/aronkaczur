import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

    public static void mainDraw(Graphics graphics) {
       int xmiddle = 160;
       int ymiddle = 160;
        graphics.setColor(Color.red);
        graphics.drawLine(0,160,320,160);

        // draw a green vertical line to the canvas' middle.
        graphics.setColor(Color.red);
        graphics.drawLine(160,320,160,0);


        graphics.setColor(Color.green);
        Graphics2D g2 = (Graphics2D) graphics;
            g2.setStroke(new BasicStroke(3));
        graphics.drawLine(xmiddle-20,ymiddle,xmiddle-20,ymiddle-20);
        graphics.drawLine(xmiddle-20,ymiddle-20,xmiddle+20,ymiddle-20);
        graphics.drawLine(xmiddle+20,ymiddle-20,xmiddle+20,ymiddle+20);
        graphics.drawLine(xmiddle+20,ymiddle+20, xmiddle-20,ymiddle+20);
        graphics.drawLine(xmiddle-20,ymiddle+20,xmiddle-20,ymiddle);




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