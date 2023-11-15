package prep2comparator;

import java.util.Comparator;

public class CoffeeCaffeinComparator implements Comparator<Coffee> {
  @Override
  public int compare(Coffee o1, Coffee o2) {
    return (o1.getCaffeineInMg() < o2.getCaffeineInMg()) ? -1 : 1;
  }
}
