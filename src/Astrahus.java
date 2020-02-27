public class Astrahus {

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

        return "Tritanium x 8.550.000" + "\n" + "Pyerite x 1.710.000" + "\n" + "Mexallon x 598.500"
                + "\n" + "Isogen x 68.400" + "\n" + "Nocxium x 12.825"  + "\n" + "Zydrine x 5.985"
                + "\n" + "Megacyte x 2.565"  + "\n" + " --> Est.Sell Price(Amarr) = "+ getMineralESTprice() + billionUnit
                + "\n" + "\n" + "Broadcast Node x 73"
                + "\n" + "Integrity Response Drones x 20" + "\n" + "Nano-Factory x 54"
                + "\n" + "Organic Mortar Applicators x 55" + "\n" + "Recursive Computing Module x 38"
                + "\n" + "Self-Harmonizing Power Core x 38 " + "\n" + "Sterile Conduits x 74"
                + "\n" + "Wetware Mainframe x 54" + "\n" + " --> Est.Sell Price(Amarr) = " + getP4ESTprice() + billionUnit
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
                " --> Est.Sell Price(Amarr) = " + getP2ESTprice() + billionUnit
                + "\n" + " 1 x Astrahus --> Est.Price = " + getItemESTprice() + billionUnit;
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
        System.out.println(estMineralsSellPrice);
        estMineralsSellPrice = estMineralsSellPrice / 1000000;
        System.out.println(estMineralsSellPrice);
        //Put price value into String
        roundedMineralsSellPrice = String.valueOf(estMineralsSellPrice);
        System.out.println(roundedMineralsSellPrice);
        //Reduce decimals numbers
        roundedMineralsSellPrice = roundedMineralsSellPrice.substring(0, Math.min(roundedMineralsSellPrice.length(), 5));
        System.out.println(roundedMineralsSellPrice);
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
