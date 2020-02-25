public class Azbel {
    public String getMaterials() {
        return "Tritanium x 40.500.000" + "\n" + "Pyerite x 8.100.000" + "\n" + "Mexallon x 2.835.000"
                + "\n" + "Isogen x 324.000" + "\n" + "Nocxium x 60.750"  + "\n" + "Zydrine x 28.350"
                + "\n" + "Megacyte x 12.150" + "\n" + " --> Est.Sell Price(Amarr) = " + getMineralESTprice()
                + "\n" + "\n" + "Broadcast Node x 196"
                + "\n" + "Integrity Response Drones x 187" + "\n" + "Nano-Factory x 237"
                + "\n" + "Organic Mortar Applicators x 222" + "\n" + "Recursive Computing Module x 189"
                + "\n" + "Self-Harmonizing Power Core x 188  " + "\n" + "Sterile Conduits x 223"
                + "\n" + "Wetware Mainframe x 174" + "\n" + " --> Est.Sell Price(Amarr) = " + getP4ESTprice()
                + "\n" + "\n" + "Or those P2 materials :" + "\n"
                + "Biocells x 11440" + "  Construction Blocks x 7940"
                + "\n" + "Consumer Electronics x 7920" + "  Coolant x 7920"
                + "\n" + "Enriched Uranium x 3760" + "  Fertilizer x 8220"
                + "\n" + "Genetically Enhanced Livestock x 3760" + "  Livestock x 7940"
                + "\n" + "Mechanical Parts x 8180"
                + "\n" + "Nanites x 7260" + "  Microfiber Shielding x 7680"
                + "\n" + "Oxides x 8180" + "  Polyaramids x 7680"
                + "\n" + "Polytextiles x 8480" + "  Rocket Fuel x 3760"
                + "\n" + "Silicate Glass x 7680" + "  Superconductors x 8480"
                + "\n" + "Supertensile Plastics x 11440" + "  Synthetic Oil x 8220"
                + "\n" + "Test Cultures x 7260" + "  Transmitter x 11440"
                + "\n" + "Viral Agent x 8200" + "  Water-Cooled CPU x 7260"
                + "\n" + "Miniature Electronics x 8200" + "  Water x 8920"
                + "\n" + "Bacteria x 8880" + "  Reactive Metals x 9480" + "\n"
                + " --> Est.Sell Price(Amarr) = " + getP2ESTprice();
    }
    public int getP4ESTprice() {
        return 0;
    }

    public int getP2ESTprice() {
        return 0;
    }

    public int getMineralESTprice() {
        return 0;
    }
}
