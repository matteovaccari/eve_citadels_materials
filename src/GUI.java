import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JFrame window;
    JPanel panel;
    JTextArea result_label;
    JButton athanor_button;
    JButton tatara_button;
    JButton fortizar_button;
    JButton astrahus_button;
    JButton keepstar_button;
    JButton raitaru_button;
    JButton azbel_button;
    JButton sotiyo_button;
    JButton palatine_keepstar_button;
    Astrahus astrahus;
    Fortizar fortizar;
    Keepstar keepstar;

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        window = new JFrame("Eve citadels materials");
        window.setVisible(true);
        window.setSize(500, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        astrahus_button = new JButton("Astrahus");
        astrahus_button.addActionListener(this);
        astrahus_button.setPreferredSize(new Dimension(150,30));
        fortizar_button = new JButton("Fortizar");
        fortizar_button.addActionListener(this);
        fortizar_button.setPreferredSize(new Dimension(150,30));
        keepstar_button = new JButton("Keepstar");
        keepstar_button.addActionListener(this);
        keepstar_button.setPreferredSize(new Dimension(150,30));
        raitaru_button = new JButton("Raitaru");
        raitaru_button.addActionListener(this);
        raitaru_button.setPreferredSize(new Dimension(150,30));
        azbel_button = new JButton("Azbel");
        azbel_button.addActionListener(this);
        azbel_button.setPreferredSize(new Dimension(150,30));
        sotiyo_button = new JButton("Sotiyo");
        sotiyo_button.addActionListener(this);
        sotiyo_button.setPreferredSize(new Dimension(150,30));
        athanor_button = new JButton("Athanor");
        athanor_button.addActionListener(this);
        athanor_button.setPreferredSize(new Dimension(150,30));
        tatara_button = new JButton("Tatara");
        tatara_button.addActionListener(this);
        tatara_button.setPreferredSize(new Dimension(150,30));
        palatine_keepstar_button = new JButton("Palatine Keepstar");
        palatine_keepstar_button.addActionListener(this);
        palatine_keepstar_button.setPreferredSize(new Dimension(400,30));

        result_label = new JTextArea("Click on a citadel" + "to see materials" + "\n" +
                "1. Minerals" + "\n" + "2. P4 products" + "\n" + "3. or P2 products");
        result_label.setEditable(false);
        result_label.setBackground(null);

        panel.add(astrahus_button);
        panel.add(fortizar_button);
        panel.add(keepstar_button);
        panel.add(raitaru_button);
        panel.add(azbel_button);
        panel.add(sotiyo_button);
        panel.add(athanor_button);
        panel.add(tatara_button);
        panel.add(palatine_keepstar_button);

        panel.add(result_label);

        window.add(panel);
        window.validate();
        astrahus = new Astrahus();
        fortizar = new Fortizar();
        keepstar = new Keepstar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == astrahus_button) {
            result_label.setText(astrahus.getMaterials());
        }
        else if (e.getSource() == fortizar_button) {
            result_label.setText(fortizar.getMaterials());
        }
        else if (e.getSource() == keepstar_button) {
            result_label.setText(keepstar.getMaterials());
        }
    }
}

