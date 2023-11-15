package prep.demo1beersorter;

import java.util.Formatter;

public class Beer implements Comparable<Beer> {
  private String name;
  private int sizeInCl;
  private double alcoholPercentage;
  private double priceInDkk;
  private static SortCriteria sortCriteria = SortCriteria.NAME;

  @Override
  public int compareTo(Beer o) {
    return 0;
  }

  public enum SortCriteria {
    NAME,
    SIZE_IN_CL,
    ALCOHOL_PERCENTAGE,
    PRICE_IN_DKK;
  }

  public Beer(String name, int sizeInCl, double alcoholPercentage, double priceInDkk) {
    this.name = name;
    this.sizeInCl = sizeInCl;
    this.alcoholPercentage = alcoholPercentage;
    this.priceInDkk = priceInDkk;
  }

  public static void setSortCriteria(SortCriteria sortCriteria) {
    Beer.sortCriteria = sortCriteria;
  }

  public static SortCriteria getSortCriteria() {
    return sortCriteria;
  }

  /*
  @Override
  public int compareTo(Beer o) {
    switch (sortCriteria) {
      case NAME -> {
        return name.compareTo(o.name);
      }
      case SIZE_IN_CL -> {
        return sizeInCl - o.sizeInCl;
      }
      case ALCOHOL_PERCENTAGE -> {
        return (alcoholPercentage - o.alcoholPercentage > 0 ) ? 1 : -1;
      }
      case PRICE_IN_DKK -> {
        return (priceInDkk > o.priceInDkk) ? 1 : -1;
      }
      default -> { return 0; }
    }
  }
   */

  @Override
  public String toString() {
    return new Formatter().format("%-40s%4d%6.1f%8.2f", name, sizeInCl, alcoholPercentage, priceInDkk).toString();
  }
}
