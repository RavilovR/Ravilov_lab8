package mirea.l3;

import javax.swing.*;

public class Window {
    public static void main(String[] args) throws InterruptedException {
        JFrame w = new JFrame("Window");
        w.setSize(900, 700);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // w.add();
        MovingCircle movingCircle = new MovingCircle();
        w.add(movingCircle);
        w.setVisible(true);
    }
}
