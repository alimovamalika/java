import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task2 extends JFrame implements ActionListener {

    JButton btn;
    JLabel label;

    public Task2() {
        setTitle("Task 2");
        setSize(300, 200);
        setLayout(new FlowLayout());

        btn = new JButton("Click");
        label = new JLabel("");

        add(btn);
        add(label);

        btn.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Hello Java");
    }

    public static void main(String[] args) {
        new Task2();
    }
}