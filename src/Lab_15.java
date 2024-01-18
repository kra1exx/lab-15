import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Lab_15 extends JFrame {
    JTextField textField;
    Lab_15() {
        setSize(250, 300);
        setLocation(500, 500);
        setLayout(null);
        JLabel label = new JLabel("Число");
        setBounds(10, 10, 50, 30);
        add(label);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textField = new JTextField("0");
        setBounds(70, 10, 50, 30);
        textField.setEditable(false);
        add(textField);
        JButton buttonOne = new JButton("+1");
        buttonOne.setBounds(130, 10, 50, 30);
        JButton buttonTwo = new JButton("-1");
        buttonTwo.setBounds(130, 40, 50, 30);
        setLayout(new FlowLayout());
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(textField.getText());
                if (value < 3) {
                    value++;
                    textField.setText(Integer.toString(value));}
            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(textField.getText());
                if (value > -5) {
                    value--;
                    textField.setText(Integer.toString(value));}
            }
        });
        add(buttonOne);
        add(buttonTwo);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Lab_15();}
}