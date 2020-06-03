import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {

        Random random = new Random();

        int x = 0;
        int y= 0;
        int size = WIDTH;
        int step = 10;
        int width= WIDTH/2;


        for (int i = 0; i < width; i+=step) {
            int r= random.nextInt(255);
            int g = random.nextInt(255);
            int b = random.nextInt(255);
            graphics.setColor(new Color(r,g,b));
            graphics.drawLine(width,i,i+width,width);
            graphics.setColor(new Color(r,g,b));
            graphics.drawLine(width,i,width-i,width);
            graphics.setColor(new Color(r,g,b));
            graphics.drawLine(width,HEIGHT-i,width-i,width);
            graphics.setColor(new Color(r,g,b));
            graphics.drawLine(width,HEIGHT-i,i+width,width);
            x= x+20;
            y= y+20;

        }
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