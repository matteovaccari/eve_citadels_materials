public class Raitaru {
    public String getMaterials() {
        return "Tritanium x 5.400.000" + "\n" + "Pyerite x 1.080.000" + "\n" + "Mexallon x 378.000"
                + "\n" + "Isogen x 43.200" + "\n" + "Nocxium x 8.100"  + "\n" + "Zydrine x 3.780"
                + "\n" + "Megacyte x 1.620"  + "\n" + " --> Est.Sell Price(Amarr) = " + getMineralESTprice()
                + "\n" + "\n" + "Broadcast Node x 21"
                + "\n" + "Integrity Response Drones x 24" + "\n" + "Nano-Factory x 37"
                + "\n" + "Organic Mortar Applicators x 37" + "\n" + "Recursive Computing Module x 27"
                + "\n" + "Self-Harmonizing Power Core x 31   " + "\n" + "Sterile Conduits x 31"
                + "\n" + "Wetware Mainframe x 23"  + "\n" + " --> Est.Sell Price(Amarr) = " + getP4ESTprice()
                + "\n" + "\n" + "Or those P2 materials :" + "\n"
                + "Biocells x 1440" + "  Construction Blocks x 1080"
                + "\n" + "Consumer Electronics x 1200" + "  Coolant x 1200"
                + "\n" + "Enriched Uranium x 620" + "  Fertilizer x 1200"
                + "\n" + "Genetically Enhanced Livestock x 620" + "  Livestock x 1080"
                + "\n" + "Mechanical Parts x 1220"
                + "\n" + "Nanites x 1000" + "  Microfiber Shielding x 1040"
                + "\n" + "Oxides x 1220" + "  Polyaramids x 1040"
                + "\n" + "Polytextiles x 1220" + "  Rocket Fuel x 620"
                + "\n" + "Silicate Glass x 1040" + "  Superconductors x 1220"
                + "\n" + "Supertensile Plastics x 1440" + "  Synthetic Oil x 1200"
                + "\n" + "Test Cultures x 1000" + "  Transmitter x 1440"
                + "\n" + "Viral Agent x 1100" + "  Water-Cooled CPU x 1000"
                + "\n" + "Miniature Electronics x 1100" + "  Water x 1240"
                + "\n" + "Bacteria x 1480" + "  Reactive Metals x 1480"
                + "\n" + " --> Est.Sell Price(Amarr) = " + getP2ESTprice();
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
