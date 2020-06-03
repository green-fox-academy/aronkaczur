import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.awt.Window.getOwnerlessWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNights {
    public static void mainDraw(Graphics graphics) throws InterruptedException {


        graphics.setColor(Color.black);
        graphics.fillRect(0,0,WIDTH,HEIGHT);
        Random random = new Random ();


            for (int j = 0; j < 386740; j++) {
                int r = random.nextInt(256);
                int g = random.nextInt(256);
                int b = random.nextInt(256);
                int x = random.nextInt(WIDTH-20);
                int y = random.nextInt(HEIGHT-20);
                int c = random.nextInt(4);
                int size = random.nextInt(30);
                int size2 = random.nextInt(30);
                graphics.setColor(new Color(r,g,b));
                graphics.fillRect(x,y,size,size);

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
            try {
                mainDraw(graphics);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}