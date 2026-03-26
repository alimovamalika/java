import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task4 extends JFrame implements ActionListener {

    JButton button;
    Color currentColor = Color.RED;
    int count = 0;

    public Task4() {
        setTitle("Task 4 - Смена цвета");
        setSize(300, 300);
        setLayout(new FlowLayout());

        button = new JButton("Сменить цвет");
        add(button);

        button.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        count++;

        if (count % 3 == 0) {
            currentColor = Color.RED;
        } else if (count % 3 == 1) {
            currentColor = Color.GREEN;
        } else {
            currentColor = Color.BLUE;
        }

        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(currentColor);
        g.fillOval(100, 100, 80, 80);
    }

    public static void main(String[] args) {
        new Task4();
    }
}