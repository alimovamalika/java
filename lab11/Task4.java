import javax.swing.*;
import java.awt.event.*;

public class Task4 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        JTextField field = new JTextField();
        JButton btn = new JButton("Посчитать");

        field.setBounds(50, 50, 200, 30);
        btn.setBounds(50, 100, 200, 30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = field.getText();
                String[] parts = text.split(" ");

                double a = Double.parseDouble(parts[0]);
                String op = parts[1];
                double b = Double.parseDouble(parts[2]);

                double result = 0;

                switch (op) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break;
                }

                field.setText(String.valueOf(result));
            }
        });

        frame.add(field);
        frame.add(btn);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}