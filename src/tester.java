//Dorin Tihon
import java.util.Random;


public class tester {
    public static void main(String[] args){

        Random rand = new Random();

        int year = rand.nextInt(99) +1900;

        int firstYear = (year/10) *10;
        Decade decade = new Decade(firstYear);

        decade.printInfo();
    }
}