import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
    Raitaru raitaru;
    Azbel azbel;
    Sotiyo sotiyo;
    Athanor athanor;
    Tatara tatara;
    PalatineKeepstar palatineKeepstar;
    JLabel fortizar_picture;
    JLabel astrahus_picture;
    JLabel keepstar_picture;
    JLabel raitaru_picture;
    JLabel azbel_picture;
    JLabel sotiyo_picture;
    JLabel athanor_picture;
    JLabel tatara_picture;
    JLabel palatine_keepstar_picture;
    BufferedImage fortizar_image;
    BufferedImage astrahus_image;
    BufferedImage keepstar_image;
    BufferedImage raitaru_image;
    BufferedImage azbel_image;
    BufferedImage sotiyo_image;
    BufferedImage athanor_image;
    BufferedImage tatara_image;
    BufferedImage palatineKeepstar_image;
    JLabel current_picture;
    String current_picture_name = "empty";

    public static void main(String[] args) throws IOException {
        new GUI();
    }

    public GUI() throws IOException {
        window = new JFrame("Eve citadels materials");
        window.setVisible(true);
        window.setSize(500, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fortizar_image = ImageIO.read(new File("F:/Programmes/projects/eve_citadels_materials/images/fortizar.jpg"));
        fortizar_picture = new JLabel(new ImageIcon(fortizar_image));
        astrahus_image = ImageIO.read(new File("F:/Programmes/projects/eve_citadels_materials/images/astrahus.jpg"));
        astrahus_picture = new JLabel(new ImageIcon(astrahus_image));
        keepstar_image = ImageIO.read(new File("F:/Programmes/projects/eve_citadels_materials/images/keepstar.jpg"));
        keepstar_picture = new JLabel(new ImageIcon(keepstar_image));
        raitaru_image = ImageIO.read(new File("F:/Programmes/projects/eve_citadels_materials/images/raitaru.jpg"));
        raitaru_picture = new JLabel(new ImageIcon(raitaru_image));
        azbel_image = ImageIO.read(new File("F:/Programmes/projects/eve_citadels_materials/images/azbel.jpg"));
        azbel_picture = new JLabel(new ImageIcon(azbel_image));
        sotiyo_image = ImageIO.read(new File("F:/Programmes/projects/eve_citadels_materials/images/sotiyo.jpg"));
        sotiyo_picture = new JLabel(new ImageIcon(sotiyo_image));
        athanor_image = ImageIO.read(new File("F:/Programmes/projects/eve_citadels_materials/images/athanor.jpg"));
        athanor_picture = new JLabel(new ImageIcon(athanor_image));
        tatara_image = ImageIO.read(new File("F:/Programmes/projects/eve_citadels_materials/images/tatara.jpg"));
        tatara_picture = new JLabel(new ImageIcon(tatara_image));
        palatineKeepstar_image = ImageIO.read(new File("F:/Programmes/projects/eve_citadels_materials/images/palatine_keepstar.jpg"));
        palatine_keepstar_picture = new JLabel(new ImageIcon(palatineKeepstar_image));
        panel = new JPanel();

        astrahus_button = new JButton("Astrahus");
        astrahus_button.addActionListener(this);
        astrahus_button.setPreferredSize(new Dimension(150, 30));
        fortizar_button = new JButton("Fortizar");
        fortizar_button.addActionListener(this);
        fortizar_button.setPreferredSize(new Dimension(150, 30));
        keepstar_button = new JButton("Keepstar");
        keepstar_button.addActionListener(this);
        keepstar_button.setPreferredSize(new Dimension(150, 30));
        raitaru_button = new JButton("Raitaru");
        raitaru_button.addActionListener(this);
        raitaru_button.setPreferredSize(new Dimension(150, 30));
        azbel_button = new JButton("Azbel");
        azbel_button.addActionListener(this);
        azbel_button.setPreferredSize(new Dimension(150, 30));
        sotiyo_button = new JButton("Sotiyo");
        sotiyo_button.addActionListener(this);
        sotiyo_button.setPreferredSize(new Dimension(150, 30));
        athanor_button = new JButton("Athanor");
        athanor_button.addActionListener(this);
        athanor_button.setPreferredSize(new Dimension(150, 30));
        tatara_button = new JButton("Tatara");
        tatara_button.addActionListener(this);
        tatara_button.setPreferredSize(new Dimension(150, 30));
        palatine_keepstar_button = new JButton("Palatine Keepstar");
        palatine_keepstar_button.addActionListener(this);
        palatine_keepstar_button.setPreferredSize(new Dimension(400, 30));

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
        raitaru = new Raitaru();
        azbel = new Azbel();
        sotiyo = new Sotiyo();
        athanor = new Athanor();
        tatara = new Tatara();
        palatineKeepstar = new PalatineKeepstar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == astrahus_button) {
            if (current_picture == null) {
                current_picture = new JLabel(new ImageIcon(astrahus_image));
                panel.add(current_picture);
                current_picture_name = "astrahus_image";
            } else if (!current_picture_name.equals("astrahus_image") && current_picture != null) {
                panel.remove(current_picture);
                current_picture = new JLabel(new ImageIcon(astrahus_image));
                panel.add(current_picture);
                current_picture_name = "astrahus_image";
            }
            result_label.setText(astrahus.getMaterials());
        } else if (e.getSource() == fortizar_button) {
            if (current_picture == null) {
                current_picture = new JLabel(new ImageIcon(fortizar_image));
                panel.add(current_picture);
                current_picture_name = "fortizar_image";
            } else if (!current_picture_name.equals("fortizar_image") && current_picture != null) {
                panel.remove(current_picture);
                current_picture = new JLabel(new ImageIcon(fortizar_image));
                panel.add(current_picture);
                current_picture_name = "fortizar_image";
            }
            result_label.setText(fortizar.getMaterials());
        }
        else if (e.getSource() == keepstar_button) {
            if (current_picture == null) {
                current_picture = new JLabel(new ImageIcon(keepstar_image));
                panel.add(current_picture);
                current_picture_name = "keepstar_image";
            } else if (!current_picture_name.equals("keepstar_image") && current_picture != null) {
                panel.remove(current_picture);
                current_picture = new JLabel(new ImageIcon(keepstar_image));
                panel.add(current_picture);
                current_picture_name = "keepstar_image";
            }
            result_label.setText(keepstar.getMaterials());
        }
        else if (e.getSource() == raitaru_button) {
            if (current_picture == null) {
                current_picture = new JLabel(new ImageIcon(raitaru_image));
                panel.add(current_picture);
                current_picture_name = "raitaru_image";
            } else if (!current_picture_name.equals("raitaru_image") && current_picture != null) {
                panel.remove(current_picture);
                current_picture = new JLabel(new ImageIcon(raitaru_image));
                panel.add(current_picture);
                current_picture_name = "raitaru_image";
            }
            result_label.setText(raitaru.getMaterials());
        }
        else if (e.getSource() == azbel_button) {
            if (current_picture == null) {
                current_picture = new JLabel(new ImageIcon(azbel_image));
                panel.add(current_picture);
                current_picture_name = "azbel_image";
            } else if (!current_picture_name.equals("azbel_image") && current_picture != null) {
                panel.remove(current_picture);
                current_picture = new JLabel(new ImageIcon(azbel_image));
                panel.add(current_picture);
                current_picture_name = "azbel_image";
            }
            result_label.setText(azbel.getMaterials());
        }
        else if (e.getSource() == sotiyo_button) {
            if (current_picture == null) {
                current_picture = new JLabel(new ImageIcon(sotiyo_image));
                panel.add(current_picture);
                current_picture_name = "sotiyo_image";
            } else if (!current_picture_name.equals("sotiyo_image") && current_picture != null) {
                panel.remove(current_picture);
                current_picture = new JLabel(new ImageIcon(sotiyo_image));
                panel.add(current_picture);
                current_picture_name = "sotiyo_image";
            }
            result_label.setText(sotiyo.getMaterials());
        }
        else if (e.getSource() == athanor_button) {
            if (current_picture == null) {
                current_picture = new JLabel(new ImageIcon(athanor_image));
                panel.add(current_picture);
                current_picture_name = "athanor_image";
            } else if (!current_picture_name.equals("athanor_image") && current_picture != null) {
                panel.remove(current_picture);
                current_picture = new JLabel(new ImageIcon(athanor_image));
                panel.add(current_picture);
                current_picture_name = "athanor_image";
            }
            result_label.setText(athanor.getMaterials());
        }
        else if (e.getSource() == tatara_button) {
            if (current_picture == null) {
                current_picture = new JLabel(new ImageIcon(tatara_image));
                panel.add(current_picture);
                current_picture_name = "tatara_image";
            } else if (!current_picture_name.equals("tatara_image") && current_picture != null) {
                panel.remove(current_picture);
                current_picture = new JLabel(new ImageIcon(tatara_image));
                panel.add(current_picture);
                current_picture_name = "tatara_image";
            }
            result_label.setText(tatara.getMaterials());
        }
        else if (e.getSource() == palatine_keepstar_button) {
            if (current_picture == null) {
                current_picture = new JLabel(new ImageIcon(palatineKeepstar_image));
                panel.add(current_picture);
                current_picture_name = "palatineKeepstar_image";
            } else if (!current_picture_name.equals("palatineKeepstar_image") && current_picture != null) {
                panel.remove(current_picture);
                current_picture = new JLabel(new ImageIcon(palatineKeepstar_image));
                panel.add(current_picture);
                current_picture_name = "palatineKeepstar_image";
            }
            result_label.setText(palatineKeepstar.getMaterials());
        }
    }
}

