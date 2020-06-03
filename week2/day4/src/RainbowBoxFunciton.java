import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        Color[] Color ={java.awt.Color.RED, java.awt.Color.orange, java.awt.Color.yellow, java.awt.Color.green, java.awt.Color.blue ,java.awt.Color.PINK, java.awt.Color.cyan};
        int x = 160-125;
        int y = 40;
        int size = 250;
        for (int i = 0; i < Color.length; i++) {

            graphics.fillRect(x,y,size,size);
            size = size - 40;
            graphics.setColor(Color[i]);
            // something similar.

        }

    }
;









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