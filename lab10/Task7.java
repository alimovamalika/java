import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task7 extends JFrame implements KeyListener {

    char symbol = ' ';

    public Task7() {
        setTitle("Task 7 - Клавиатура");
        setSize(400, 300);

        addKeyListener(this);
        setFocusable(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        symbol = e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("Символ: " + symbol, 100, 150);
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new Task7();
    }
}