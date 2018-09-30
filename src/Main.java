public class Main
{
    public static void main(String[] args)
    {
        int birth=1*60*7;
        int death=1*60*13;
        int newimmigrant=1*45;
        int population= 312032486;

        double beregning=population+((365*60)*birth-death*newimmigrant);
        System.out.println("Beregning " +beregning);

    }
}
