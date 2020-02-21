import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JFrame window;
    JPanel panel;
    JTextArea result_label;
    JButton athanor_button;
    JButton fortizar_button;

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        window = new JFrame("Eve citadels materials");
        window.setVisible(true);
        window.setSize(250, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        athanor_button = new JButton("Athanor");
        athanor_button.addActionListener(this);
        //athanor_button.setSize(150,100);

        result_label = new JTextArea("Click on a citadel" + "\n" + "to see materials");
        result_label.setEditable(false);
        result_label.setBackground(null);

        panel.add(athanor_button);
        panel.add(result_label);

        window.add(panel);
        window.validate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == athanor_button) {
            //show athanor result
            result_label.setText("ligne 1 athanor" + "\n" + "ligne 2 athanor");
        }
    }
}

