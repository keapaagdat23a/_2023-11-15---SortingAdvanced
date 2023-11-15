package prep.demo1beersorter;

import java.util.ArrayList;
import java.util.Collections;

public class BeerSorter {

  public enum SortCriteria {
    NAME,
    SIZE_IN_CL,
    ALCOHOL_PERCENTAGE,
    PRICE_IN_DKK;
  }

  public static void main(String[] args) {
    new BeerSorter().run();
  }

  private void run() {
    ArrayList<Beer> beers = new ArrayList<>();

    beers.add(new Beer("Tuborg Classic", 33, 4.6, 11.95));
    beers.add(new Beer("Carlsberg Pilsner", 33, 5, 12.50));
    beers.add(new Beer("Faxe Kondi", 33, 0, 10.75));
    beers.add(new Beer("Mikkeller American Dream", 33, 4.6, 15.25));
    beers.add(new Beer("To Øl Gose to Hollywood", 33, 3.8, 13.99));
    beers.add(new Beer("Ebeltoft Gårdsbryggeri Pale Ale", 33, 5.5, 14.75));
    beers.add(new Beer("Thisted Bryghus Limfjords-Porter", 50, 7.9, 24.25));
    beers.add(new Beer("Nørrebro Bryghus Bombay Pale Ale", 33, 6, 16.50));
    beers.add(new Beer("Fanø Bryghus Sønderho Stout", 50, 6.5, 17.25));
    beers.add(new Beer("Skagen Bryghus Påskebryg", 33, 5.5, 14.95));
    beers.add(new Beer("Bryggeriet Refsvindinge Ale No. 16", 33, 7.2, 19.80));
    beers.add(new Beer("Amager Bryghus Hr. Frederiksen", 50, 10.5, 25.00));
    beers.add(new Beer("Gourmetbryggeriet All In", 33, 6.9, 17.75));
    beers.add(new Beer("Hancock Påskebryg", 33, 5.8, 13.50));
    beers.add(new Beer("Thisted Bryghus Limfjords-Porter", 33, 7.9, 18.00));

    System.out.println("\nUnsorted:");
    for (Beer b : beers) System.out.println(b);

    Beer.setSortCriteria(Beer.SortCriteria.SIZE_IN_CL);
    System.out.println("\nSort by: " + Beer.getSortCriteria());
    Collections.sort(beers);
    for (Beer b : beers) System.out.println(b);

    Beer.setSortCriteria(Beer.SortCriteria.NAME);
    System.out.println("\nSort by: " + Beer.getSortCriteria());
    Collections.sort(beers);
    for (Beer b : beers) System.out.println(b);

    Beer.setSortCriteria(Beer.SortCriteria.ALCOHOL_PERCENTAGE);
    System.out.println("\nSort by: " + Beer.getSortCriteria());
    Collections.sort(beers);
    for (Beer b : beers) System.out.println(b);

    Beer.setSortCriteria(Beer.SortCriteria.PRICE_IN_DKK);
    System.out.println("\nSort by: " + Beer.getSortCriteria());
    Collections.sort(beers);
    for (Beer b : beers) System.out.println(b);

  }
}
