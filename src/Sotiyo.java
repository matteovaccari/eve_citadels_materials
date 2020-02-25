public class Sotiyo {
    public String getMaterials() {
        return "Tritanium x 258.750.000" + "\n" + "Pyerite x 51.750.000" + "\n" + "Mexallon x 18.112.500"
                + "\n" + "Isogen x 2.070.000" + "\n" + "Nocxium x 388.125"  + "\n" + "Zydrine x 181.125"
                + "\n" + "Megacyte x 77.625"  + "\n" + " --> Est.Price(Amarr) = " + getMineralESTprice()
                + "\n" + "\n" + "Broadcast Node x 992"
                + "\n" + "Integrity Response Drones x 1.222" + "\n" + "Nano-Factory x 1.857"
                + "\n" + "Organic Mortar Applicators x 1.403" + "\n" + "Recursive Computing Module x 1.244"
                + "\n" + "Self-Harmonizing Power Core x 969" + "\n" + "Sterile Conduits x 1.404"
                + "\n" + "Wetware Mainframe x 1.007"  + "\n" + " --> Est.Price(Amarr) = " + getP4ESTprice()
                + "\n" + "\n" + "Or those P2 materials :" + "\n"
                + "Biocells x 69160" + "  Construction Blocks x 48220"
                + "\n" + "Consumer Electronics x 48200" + "  Coolant x 48200"
                + "\n" + "Enriched Uranium x 19380" + "  Fertilizer x 57280"
                + "\n" + "Genetically Enhanced Livestock x 19380" + "  Livestock x 48220"
                + "\n" + "Mechanical Parts x 52500"
                + "\n" + "Nanites x 45020" + "  Microfiber Shielding x 39220"
                + "\n" + "Oxides x 52500" + "  Polyaramids x 39220"
                + "\n" + "Polytextiles x 61580" + "  Rocket Fuel x 19380"
                + "\n" + "Silicate Glass x 39220" + "  Superconductors x 61580"
                + "\n" + "Supertensile Plastics x 69160" + "  Synthetic Oil x 57280"
                + "\n" + "Test Cultures x 45020" + "  Transmitter x 69160"
                + "\n" + "Viral Agent x 52520" + "  Water-Cooled CPU x 45020"
                + "\n" + "Miniature Electronics x 52520" + "  Water x 56160"
                + "\n" + "Bacteria x 56120" + "  Reactive Metals x 74280"
                + "\n" + " --> Est.Price(Amarr) = " + getP2ESTprice();
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
