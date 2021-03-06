import org.json.JSONObject;

import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GUI implements ActionListener {

    //todo : add comments
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

    private static HttpURLConnection athanorItemCon;
    private static HttpURLConnection athanorMineralsCon;
    private static HttpURLConnection athanorP4Con;
    private static HttpURLConnection athanorP2Con;
    private static HttpURLConnection astrahusItemCon;
    private static HttpURLConnection astrahusMineralsCon;
    private static HttpURLConnection astrahusP4Con;
    private static HttpURLConnection astrahusP2Con;
    String url;
    URL urlObject;
    boolean isAthanorRequestAlreadyDone = false;
    boolean isAstrahusRequestAlreadyDone = false;

    public static void main(String[] args) throws IOException {
        new GUI();
    }

    public GUI() throws IOException {

        setWindow();
        setPictures();
        panel = new JPanel();
        setButtons();
        setResult_label();
        addComponentsToPanel();

        window.add(panel);
        window.validate();

        instanciateCitadels();

        setBaseUrl();

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
            if (!isAstrahusRequestAlreadyDone) {
                try {
                    sendAstrahusPostRequest();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
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
            if (!isAthanorRequestAlreadyDone) {
                try {
                    sendAthanorPostRequest();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
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

    public String getAthanorUrlParameters(String type){
        String returnValue = "";
        switch (type) {
            case "minerals":
                returnValue = "market=amarr&raw_textarea=Tritanium x 7.650.000\n" +
                        "Pyerite x 1.530.000\n" +
                        "Mexallon x 535.500\n" +
                        "Isogen x 61.200\n" +
                        "Nocxium x 11.475\n" +
                        "Zydrine x 5.355\n" +
                        "Megacyte x 2.295&persist=no&format=json";
                break;
            case "P2":
                returnValue = "market=amarr&raw_textarea=Biocells x 1860  Construction Blocks x 1760\n" +
                        "Consumer Electronics x 2000  Coolant x 2000\n" +
                        "Enriched Uranium x 1280  Fertilizer x 1820\n" +
                        "Genetically Enhanced Livestock x 1280  Livestock x 1760\n" +
                        "Mechanical Parts x 1800\n" +
                        "Nanites x 1640  Microfiber Shielding x 1700\n" +
                        "Oxides x 1800  Polyaramids x 1700\n" +
                        "Polytextiles x 1620  Rocket Fuel x 1280\n" +
                        "Silicate Glass x 1700  Superconductors x 1620\n" +
                        "Supertensile Plastics x 1860  Synthetic Oil x 1820\n" +
                        "Test Cultures x 1640  Transmitter x 1860\n" +
                        "Viral Agent x 1560  Water-Cooled CPU x 1640\n" +
                        "Miniature Electronics x 1560  Water x 1520\n" +
                        "Bacteria x 2000  Reactive Metals x 1640&persist=no&format=json";
                break;
            case "P4":
                returnValue = "market=amarr&raw_textarea=Broadcast Node x 21\n" +
                        "Integrity Response Drones x 40\n" +
                        "Nano-Factory x 41\n" +
                        "Organic Mortar Applicators x 50\n" +
                        "Recursive Computing Module x 32\n" +
                        "Self-Harmonizing Power Core x 64    \n" +
                        "Sterile Conduits x 38\n" +
                        "Wetware Mainframe x 50&persist=no&format=json";
                break;
            case "item":
                returnValue = "market=amarr&raw_textarea=1 x Athanor&persist=no&format=json";
                break;
        }
        return returnValue;
    }

    public String getAstrahusUrlParameters(String type){
        String returnValue = "";
        switch (type) {
            case "minerals":
                returnValue = "market=amarr&raw_textarea=Tritanium x 8.550.000\n" +
                        "Pyerite x 1.710.000\n" +
                        "Mexallon x 598.500\n" +
                        "Isogen x 68.400\n" +
                        "Nocxium x 12.825\n" +
                        "Zydrine x 5.985\n" +
                        "Megacyte x 2.565&persist=no&format=json";
                break;
            case "P2":
                returnValue = "market=amarr&raw_textarea=Biocells x 2620  Construction Blocks x 2560\n" +
                        "Consumer Electronics x 2180  Coolant x 2180\n" +
                        "Enriched Uranium x 760  Fertilizer x 2160\n" +
                        "Genetically Enhanced Livestock x 760  Livestock x 2560\n" +
                        "Mechanical Parts x 1500\n" +
                        "Nanites x 1840  Microfiber Shielding x 2220\n" +
                        "Oxides x 1500  Polyaramids x 2220\n" +
                        "Polytextiles x 1480  Rocket Fuel x 760\n" +
                        "Silicate Glass x 2220  Superconductors x 1480\n" +
                        "Supertensile Plastics x 2620  Synthetic Oil x 2160\n" +
                        "Test Cultures x 1840  Transmitter x 2620\n" +
                        "Viral Agent x 1880  Water-Cooled CPU x 1840\n" +
                        "Miniature Electronics x 1880  Water x 2960\n" +
                        "Bacteria x 2200  Reactive Metals x 2160&persist=no&format=json";
                break;
            case "P4":
                returnValue = "market=amarr&raw_textarea=Integrity Response Drones x 20\n" +
                        "Nano-Factory x 54\n" +
                        "Organic Mortar Applicators x 55\n" +
                        "Recursive Computing Module x 38\n" +
                        "Self-Harmonizing Power Core x 38 \n" +
                        "Sterile Conduits x 74\n" +
                        "Wetware Mainframe x 54&persist=no&format=json";
                break;
            case "item":
                returnValue = "market=amarr&raw_textarea=1 x Astrahus&persist=no&format=json";
                break;
        }
        return returnValue;
    }

    public void sendAthanorPostRequest() throws IOException {
        //Send Item post request
        athanorItemCon = (HttpsURLConnection) urlObject.openConnection();
        athanorItemCon.setRequestMethod("POST");
        athanorItemCon.setRequestProperty("User-Agent", "Mozilla/5.0");
        athanorItemCon.setDoOutput(true);

        DataOutputStream wrItem = new DataOutputStream(athanorItemCon.getOutputStream());
        wrItem.writeBytes(getAthanorUrlParameters("item"));
        wrItem.flush();
        wrItem.close();
        BufferedReader inItem = new BufferedReader(
                new InputStreamReader(athanorItemCon.getInputStream()));
        String inputLineItem;
        StringBuilder responseItem = new StringBuilder();
        while ((inputLineItem = inItem.readLine()) != null) {
            responseItem.append(inputLineItem);
        }
        inItem.close();
        JSONObject jsonObjectItem = new JSONObject(responseItem.toString());
        Athanor.estSellPrice = jsonObjectItem.getJSONObject("appraisal").getJSONObject("totals").getDouble("sell");

        //Send minerals post request
        athanorMineralsCon = (HttpsURLConnection) urlObject.openConnection();
        athanorMineralsCon.setRequestMethod("POST");
        athanorMineralsCon.setRequestProperty("User-Agent", "Mozilla/5.0");
        athanorMineralsCon.setDoOutput(true);
        DataOutputStream wrMinerals = new DataOutputStream(athanorMineralsCon.getOutputStream());
        wrMinerals.writeBytes(getAthanorUrlParameters("minerals"));
        wrMinerals.flush();
        wrMinerals.close();
        BufferedReader inMinerals = new BufferedReader(
                new InputStreamReader(athanorMineralsCon.getInputStream()));
        String inputLineMinerals;
        StringBuilder responseMinerals = new StringBuilder();
        while ((inputLineMinerals = inMinerals.readLine()) != null) {
            responseMinerals.append(inputLineMinerals);
        }
        inMinerals.close();
        JSONObject jsonObjectMinerals = new JSONObject(responseMinerals.toString());
        Athanor.estMineralsSellPrice = jsonObjectMinerals.getJSONObject("appraisal").getJSONObject("totals").getDouble("sell");

        //Send P4 post request
        athanorP4Con = (HttpsURLConnection) urlObject.openConnection();
        athanorP4Con.setRequestMethod("POST");
        athanorP4Con.setRequestProperty("User-Agent", "Mozilla/5.0");
        athanorP4Con.setDoOutput(true);
        DataOutputStream wrP4 = new DataOutputStream(athanorP4Con.getOutputStream());
        wrP4.writeBytes(getAthanorUrlParameters("P4"));
        wrP4.flush();
        wrP4.close();
        BufferedReader inP4 = new BufferedReader(
                new InputStreamReader(athanorP4Con.getInputStream()));
        String inputLineP4;
        StringBuilder responseP4 = new StringBuilder();
        while ((inputLineP4 = inP4.readLine()) != null) {
            responseP4.append(inputLineP4);
        }
        inMinerals.close();
        JSONObject jsonObjectP4 = new JSONObject(responseP4.toString());
        Athanor.estP4SellPrice = jsonObjectP4.getJSONObject("appraisal").getJSONObject("totals").getDouble("sell");

        //Send P2 post request
        athanorP2Con = (HttpsURLConnection) urlObject.openConnection();
        athanorP2Con.setRequestMethod("POST");
        athanorP2Con.setRequestProperty("User-Agent", "Mozilla/5.0");
        athanorP2Con.setDoOutput(true);
        DataOutputStream wrP2 = new DataOutputStream(athanorP2Con.getOutputStream());
        wrP2.writeBytes(getAthanorUrlParameters("P2"));
        wrP2.flush();
        wrP2.close();
        BufferedReader inP2 = new BufferedReader(
                new InputStreamReader(athanorP2Con.getInputStream()));
        String inputLineP2;
        StringBuilder responseP2 = new StringBuilder();
        while ((inputLineP2 = inP2.readLine()) != null) {
            responseP2.append(inputLineP2);
        }
        inMinerals.close();
        JSONObject jsonObjectP2 = new JSONObject(responseP2.toString());
        Athanor.estP2SellPrice = jsonObjectP2.getJSONObject("appraisal").getJSONObject("totals").getDouble("sell");


        isAthanorRequestAlreadyDone = true;
    }

    public void sendAstrahusPostRequest() throws  IOException {
        //Send Item post request
        astrahusItemCon = (HttpsURLConnection) urlObject.openConnection();
        astrahusItemCon.setRequestMethod("POST");
        astrahusItemCon.setRequestProperty("User-Agent", "Mozilla/5.0");
        astrahusItemCon.setDoOutput(true);

        DataOutputStream wrItem2 = new DataOutputStream(astrahusItemCon.getOutputStream());
        wrItem2.writeBytes(getAstrahusUrlParameters("item"));
        wrItem2.flush();
        wrItem2.close();
        BufferedReader inItem2 = new BufferedReader(
                new InputStreamReader(astrahusItemCon.getInputStream()));
        String inputLineItem2;
        StringBuilder responseItem2 = new StringBuilder();
        while ((inputLineItem2 = inItem2.readLine()) != null) {
            responseItem2.append(inputLineItem2);
        }
        inItem2.close();
        JSONObject jsonObjectItem2 = new JSONObject(responseItem2.toString());
        Astrahus.estSellPrice = jsonObjectItem2.getJSONObject("appraisal").getJSONObject("totals").getDouble("sell");

        //Send minerals post request
        astrahusMineralsCon = (HttpsURLConnection) urlObject.openConnection();
        astrahusMineralsCon.setRequestMethod("POST");
        astrahusMineralsCon.setRequestProperty("User-Agent", "Mozilla/5.0");
        astrahusMineralsCon.setDoOutput(true);
        DataOutputStream wrMinerals2 = new DataOutputStream(astrahusMineralsCon.getOutputStream());
        wrMinerals2.writeBytes(getAstrahusUrlParameters("minerals"));
        wrMinerals2.flush();
        wrMinerals2.close();
        BufferedReader inMinerals2 = new BufferedReader(
                new InputStreamReader(astrahusMineralsCon.getInputStream()));
        String inputLineMinerals2;
        StringBuilder responseMinerals2 = new StringBuilder();
        while ((inputLineMinerals2 = inMinerals2.readLine()) != null) {
            responseMinerals2.append(inputLineMinerals2);
        }
        inMinerals2.close();
        JSONObject jsonObjectMinerals2 = new JSONObject(responseMinerals2.toString());
        Astrahus.estMineralsSellPrice = jsonObjectMinerals2.getJSONObject("appraisal").getJSONObject("totals").getDouble("sell");

        //Send P4 post request
        astrahusP4Con = (HttpsURLConnection) urlObject.openConnection();
        astrahusP4Con.setRequestMethod("POST");
        astrahusP4Con.setRequestProperty("User-Agent", "Mozilla/5.0");
        astrahusP4Con.setDoOutput(true);
        DataOutputStream wrP42 = new DataOutputStream(astrahusP4Con.getOutputStream());
        wrP42.writeBytes(getAstrahusUrlParameters("P4"));
        wrP42.flush();
        wrP42.close();
        BufferedReader inP42 = new BufferedReader(
                new InputStreamReader(astrahusP4Con.getInputStream()));
        String inputLineP42;
        StringBuilder responseP42 = new StringBuilder();
        while ((inputLineP42 = inP42.readLine()) != null) {
            responseP42.append(inputLineP42);
        }
        inMinerals2.close();
        JSONObject jsonObjectP42 = new JSONObject(responseP42.toString());
        Astrahus.estP4SellPrice = jsonObjectP42.getJSONObject("appraisal").getJSONObject("totals").getDouble("sell");

        //Send P2 post request
        astrahusP2Con = (HttpsURLConnection) urlObject.openConnection();
        astrahusP2Con.setRequestMethod("POST");
        astrahusP2Con.setRequestProperty("User-Agent", "Mozilla/5.0");
        astrahusP2Con.setDoOutput(true);
        DataOutputStream wrP22 = new DataOutputStream(astrahusP2Con.getOutputStream());
        wrP22.writeBytes(getAstrahusUrlParameters("P2"));
        wrP22.flush();
        wrP22.close();
        BufferedReader inP22 = new BufferedReader(
                new InputStreamReader(astrahusP2Con.getInputStream()));
        String inputLineP22;
        StringBuilder responseP22 = new StringBuilder();
        while ((inputLineP22 = inP22.readLine()) != null) {
            responseP22.append(inputLineP22);
        }
        inMinerals2.close();
        JSONObject jsonObjectP22 = new JSONObject(responseP22.toString());
        Astrahus.estP2SellPrice = jsonObjectP22.getJSONObject("appraisal").getJSONObject("totals").getDouble("sell");


        isAstrahusRequestAlreadyDone = true;
    }

    public void setPictures() throws IOException {
        fortizar_image = ImageIO.read(new File("D:/programmes/WorkSpace_2/eve_citadel_materials/images/fortizar.jpg"));
        fortizar_picture = new JLabel(new ImageIcon(fortizar_image));
        astrahus_image = ImageIO.read(new File("D:/programmes/WorkSpace_2/eve_citadel_materials/images/astrahus.jpg"));
        astrahus_picture = new JLabel(new ImageIcon(astrahus_image));
        keepstar_image = ImageIO.read(new File("D:/programmes/WorkSpace_2/eve_citadel_materials/images/keepstar.jpg"));
        keepstar_picture = new JLabel(new ImageIcon(keepstar_image));
        raitaru_image = ImageIO.read(new File("D:/programmes/WorkSpace_2/eve_citadel_materials/images/raitaru.jpg"));
        raitaru_picture = new JLabel(new ImageIcon(raitaru_image));
        azbel_image = ImageIO.read(new File("D:/programmes/WorkSpace_2/eve_citadel_materials/images/azbel.jpg"));
        azbel_picture = new JLabel(new ImageIcon(azbel_image));
        sotiyo_image = ImageIO.read(new File("D:/programmes/WorkSpace_2/eve_citadel_materials/images/sotiyo.jpg"));
        sotiyo_picture = new JLabel(new ImageIcon(sotiyo_image));
        athanor_image = ImageIO.read(new File("D:/programmes/WorkSpace_2/eve_citadel_materials/images/athanor.jpg"));
        athanor_picture = new JLabel(new ImageIcon(athanor_image));
        tatara_image = ImageIO.read(new File("D:/programmes/WorkSpace_2/eve_citadel_materials/images/tatara.jpg"));
        tatara_picture = new JLabel(new ImageIcon(tatara_image));
        palatineKeepstar_image = ImageIO.read(new File("D:/programmes/WorkSpace_2/eve_citadel_materials/images/palatine_keepstar.jpg"));
        palatine_keepstar_picture = new JLabel(new ImageIcon(palatineKeepstar_image));
    }

    public void setButtons(){
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
        palatine_keepstar_button.setPreferredSize(new Dimension(150, 30));
    }

    public void setResult_label() {
        result_label = new JTextArea("Click on a citadel" + "to see materials" + "\n" +
                "1. Minerals" + "\n" + "2. P4 products" + "\n" + "3. or P2 products");
        result_label.setEditable(false);
        result_label.setBackground(null);
    }

    public void addComponentsToPanel() {
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
    }

    public void setWindow() {
        window = new JFrame("Eve citadels materials");
        window.setVisible(true);
        window.setSize(620, 950);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
    }

    public void instanciateCitadels() {
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

    public void setBaseUrl() throws MalformedURLException {
        //Base URL
        url =  "https://evepraisal.com/appraisal.json";
        urlObject = new URL(url);

    }
}

