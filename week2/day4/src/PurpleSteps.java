import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        int x = 10;
        int y = 10;
        int w = 10;
        int h = 10;
        for (int i = 0; i < 15; i++) {

            graphics.drawRect(x,y,w,h);
            graphics.setColor(Color.MAGENTA);
            graphics.fillRect(x, y, w, h);
            graphics.setColor(Color.black);
            x = x + 10;
            y = y + 10;


        }
    }
    public static void squareDraw (int x, int y, Graphics graphics){
        graphics.setColor(Color.green);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(3));
        graphics.drawRect(x,y,30,30);
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