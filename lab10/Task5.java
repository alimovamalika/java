import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task5 extends JFrame implements ActionListener {

    JTextField xField, yField;
    JButton button;

    int x = 50;
    int y = 50;

    public Task5() {
        setTitle("Task 5 - Координаты");
        setSize(400, 400);
        setLayout(new FlowLayout());

        xField = new JTextField(5);
        yField = new JTextField(5);
        button = new JButton("Нарисовать");

        add(new JLabel("X:"));
        add(xField);
        add(new JLabel("Y:"));
        add(yField);
        add(button);

        button.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            x = Integer.parseInt(xField.getText());
            y = Integer.parseInt(yField.getText());
            repaint();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Введите числа!");
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLUE);
        g.fillOval(x, y, 50, 50);
    }

    public static void main(String[] args) {
        new Task5();
    }
}