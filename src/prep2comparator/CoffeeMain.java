package prep2comparator;

import java.util.ArrayList;
import java.util.Collections;

public class CoffeeMain {
  public static void main(String[] args) {
    new CoffeeMain().run();
  }

  private void run() {
    ArrayList<Coffee> drinks = new ArrayList<>();

    drinks.add(new Coffee("Americano", 30, 25.0));
    drinks.add(new Coffee("Latte", 20, 35.0));
    drinks.add(new Coffee("Espresso", 40, 20.0));
    drinks.add(new Coffee("Cappuccino", 25, 30.0));
    drinks.add(new Coffee("Mocha", 35, 40.0));
    drinks.add(new Coffee("Macchiato", 22, 28.0));
    drinks.add(new Coffee("Flat White", 18, 32.0));
    drinks.add(new Coffee("Iced Coffee", 28, 45.0));
    drinks.add(new Coffee("Irish Coffee", 50, 50.0));
    drinks.add(new Coffee("Decaf", 5, 22.0));
    drinks.add(new Coffee("Vanilla Latte", 25, 38.0));
    drinks.add(new Coffee("Hazelnut Coffee", 30, 42.0));
    drinks.add(new Coffee("Turkish Coffee", 45, 48.0));
    drinks.add(new Coffee("Pumpkin Spice Latte", 15, 40.0));
    drinks.add(new Coffee("Coconut Mocha", 40, 45.0));

    System.out.println("\nUnsorted:");
    for(Coffee c : drinks)
      System.out.printf("%-20s%5d%8.2f%n", c.getName(), c.getCaffeineInMg(), c.getPriceInDkk());

    Collections.sort(drinks, new CoffeeNameComparator());
    System.out.println("\nSorted by name:");
    for(Coffee c : drinks)
      System.out.printf("%-20s%5d%8.2f%n", c.getName(), c.getCaffeineInMg(), c.getPriceInDkk());

    Collections.sort(drinks, new CoffeeCaffeinComparator());
    System.out.println("\nSorted by caffeine:");
    for(Coffee c : drinks)
      System.out.printf("%-20s%5d%8.2f%n", c.getName(), c.getCaffeineInMg(), c.getPriceInDkk());
  }
}
