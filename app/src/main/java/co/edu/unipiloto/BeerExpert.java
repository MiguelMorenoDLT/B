package co.edu.unipiloto;

public class BeerExpert
{
    public static String getBrands(String beer)
    {
        if(beer.equals("Amber")) {
            String a = "Jack Amber\nRed Moose";

            return a;
        }
        if(beer.equals("Light")) {
            String a = "Corona\nAguila";

            return a;
        }
        if(beer.equals("Brown")) {
            String a = "Heineken\nRoot Beer";

            return a;
        }
        if(beer.equals("Dark")) {
            String a = "Coke Beer\nBlack Moose";

            return a;
        }
        return "";
    }
}
