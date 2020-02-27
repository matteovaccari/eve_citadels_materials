import java.text.DecimalFormat;

public class Athanor {

    public static double estSellPrice;
    public static double roundedEstSellPrice;
    public static double estMineralsSellPrice;
    public static String roundedMineralsSellPrice;
    public static double estP2SellPrice;
    public static String roundedP2SellPrice;
    public static double estP4SellPrice;
    public static String roundedP4SellPrice;
    public static String billionUnit;

    public String getMaterials() {

        return "Tritanium x 7.650.000" + "\n" + "Pyerite x 1.530.000" + "\n" + "Mexallon x 535.500"
                + "\n" + "Isogen x 61.200" + "\n" + "Nocxium x 11.475" + "\n" + "Zydrine x 5.355"
                + "\n" + "Megacyte x 2.295" + "\n" + " --> Est.Sell Price(Amarr) = " + getMineralESTprice() + billionUnit + "\n" + "\n"
                + "Broadcast Node x 21"
                + "\n" + "Integrity Response Drones x 40" + "\n" + "Nano-Factory x 41"
                + "\n" + "Organic Mortar Applicators x 50" + "\n" + "Recursive Computing Module x 32"
                + "\n" + "Self-Harmonizing Power Core x 64    " + "\n" + "Sterile Conduits x 38"
                + "\n" + "Wetware Mainframe x 50" + "\n" + " --> Est.Sell Price(Amarr) = " + getP4ESTprice() + billionUnit + "\n" + "\n"
                + "Or those P2 materials :"
                + "\n" + "Biocells x 1860" + "  Construction Blocks x 1760"
                + "\n" + "Consumer Electronics x 2000" + "  Coolant x 2000"
                + "\n" + "Enriched Uranium x 1280" + "  Fertilizer x 1820"
                + "\n" + "Genetically Enhanced Livestock x 1280" + "  Livestock x 1760"
                + "\n" + "Mechanical Parts x 1800"
                + "\n" + "Nanites x 1640" + "  Microfiber Shielding x 1700"
                + "\n" + "Oxides x 1800" + "  Polyaramids x 1700"
                + "\n" + "Polytextiles x 1620" + "  Rocket Fuel x 1280"
                + "\n" + "Silicate Glass x 1700" + "  Superconductors x 1620"
                + "\n" + "Supertensile Plastics x 1860" + "  Synthetic Oil x 1820"
                + "\n" + "Test Cultures x 1640" + "  Transmitter x 1860"
                + "\n" + "Viral Agent x 1560" + "  Water-Cooled CPU x 1640"
                + "\n" + "Miniature Electronics x 1560" + "  Water x 1520"
                + "\n" + "Bacteria x 2000" + "  Reactive Metals x 1640" + "\n"
                + " --> Est.Sell Price(Amarr) = " + getP2ESTprice() + billionUnit
                + "\n" + " 1 x Athanor --> Est.Price = " + getItemESTprice() + billionUnit;
    }

    public String getP4ESTprice() {
        //Reduce size to XXX.X... Million ISK
        estP4SellPrice = estP4SellPrice / 1000000;
        //Put price value into String
        roundedP4SellPrice = String.valueOf(estP4SellPrice);
        //Reduce decimals numbers
        roundedP4SellPrice = roundedP4SellPrice.substring(0, Math.min(roundedP4SellPrice.length(), 5));
        billionUnit  = " Million ISK";
        return roundedP4SellPrice;
    }

    public String getP2ESTprice() {
        //Reduce size to XXX.X... Million ISK
        estP2SellPrice = estP2SellPrice / 1000000;
        //Put price value into String
        roundedP2SellPrice = String.valueOf(estP2SellPrice);
        //Reduce decimals numbers
        roundedP2SellPrice = roundedP2SellPrice.substring(0, Math.min(roundedP2SellPrice.length(), 5));
        billionUnit  = " Million ISK";
        return roundedP2SellPrice;
    }

    public String getMineralESTprice() {
       //Reduce size to XXX.X... Million ISK
        estMineralsSellPrice = estMineralsSellPrice / 1000000;
        //Put price value into String
        roundedMineralsSellPrice = String.valueOf(estMineralsSellPrice);
        //Reduce decimals numbers
        roundedMineralsSellPrice = roundedMineralsSellPrice.substring(0, Math.min(roundedMineralsSellPrice.length(), 5));
            billionUnit  = " Million ISK";
        return roundedMineralsSellPrice;
    }
    public double getItemESTprice() {
        roundedEstSellPrice = Math.round(estSellPrice);
        if (roundedEstSellPrice >= 1000000000) {
            billionUnit = " Billion ISK";
            return roundedEstSellPrice / 1000000000;
        } else
            billionUnit  = " Million ISK";
        return roundedEstSellPrice;
    }
}

