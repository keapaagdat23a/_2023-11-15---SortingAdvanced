package prep2comparator;

import java.util.Formatter;

public class Coffee {
  private String name;
  private int caffeineInMg;
  private double priceInDkk;

  public Coffee(String name, int caffeineInMg, double priceInDkk) {
    this.name = name;
    this.caffeineInMg = caffeineInMg;
    this.priceInDkk = priceInDkk;
  }

  public String getName() {
    return name;
  }

  public int getCaffeineInMg() {
    return caffeineInMg;
  }

  public double getPriceInDkk() {
    return priceInDkk;
  }

  @Override
  public String toString() {
    // Note: It's NOT pretty to format the output here! Normally, use getters and then format output in main class.
    return new Formatter().format("%-15s%5d%8.2f", name, caffeineInMg, priceInDkk).toString();
  }
}
