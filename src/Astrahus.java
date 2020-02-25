public class Astrahus {

    public String getMaterials() {

        return "Tritanium x 8.550.000" + "\n" + "Pyerite x 1.710.000" + "\n" + "Mexallon x 598.500"
                + "\n" + "Isogen x 68.400" + "\n" + "Nocxium x 12.825"  + "\n" + "Zydrine x 5.985"
                + "\n" + "Megacyte x 2.565"  + "\n" + " --> Est.Sell Price(Amarr) = "+ getMineralESTprice()
                + "\n" + "\n" + "Broadcast Node x 73"
                + "\n" + "Integrity Response Drones x 20" + "\n" + "Nano-Factory x 54"
                + "\n" + "Organic Mortar Applicators x 55" + "\n" + "Recursive Computing Module x 38"
                + "\n" + "Self-Harmonizing Power Core x 38 " + "\n" + "Sterile Conduits x 74"
                + "\n" + "Wetware Mainframe x 54" + "\n" + " --> Est.Sell Price(Amarr) = " + getP4ESTprice()
                + "\n" + "\n" + "Or those P2 materials : "
                + "\n" + "Biocells x 2620" + "  Construction Blocks x 2560"
                + "\n" + "Consumer Electronics x 2180" + "  Coolant x 2180"
                + "\n" + "Enriched Uranium x 760" + "  Fertilizer x 2160"
                + "\n" + "Genetically Enhanced Livestock x 760" + "  Livestock x 2560"
                + "\n" + "Mechanical Parts x 1500"
                + "\n" + "Nanites x 1840" + "  Microfiber Shielding x 2220"
                + "\n" + "Oxides x 1500" + "  Polyaramids x 2220"
                + "\n" + "Polytextiles x 1480" + "  Rocket Fuel x 760"
                + "\n" + "Silicate Glass x 2220" + "  Superconductors x 1480"
                + "\n" + "Supertensile Plastics x 2620" + "  Synthetic Oil x 2160"
                + "\n" + "Test Cultures x 1840" + "  Transmitter x 2620"
                + "\n" + "Viral Agent x 1880" + "  Water-Cooled CPU x 1840"
                + "\n" + "Miniature Electronics x 1880" + "  Water x 2960"
                + "\n" + "Bacteria x 2200" + "  Reactive Metals x 2160" + "\n" +
                " --> Est.Sell Price(Amarr) = " + getP2ESTprice();
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
