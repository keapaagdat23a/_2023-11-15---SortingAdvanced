package prep.marsvin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Marsvin implements Comparable {
  private String navn;
  private String race;
  private int foderIGram;

  public static void main(String[] args) {
    ArrayList<Marsvin> marsvin = new ArrayList<>();
    Scanner fileReader;

    try {
      fileReader = new Scanner(new File("marsvin.txt"));
      while (fileReader.hasNextLine()) {
        Marsvin m = new Marsvin();
        m.navn = fileReader.next();
        m.race = fileReader.next();
        m.foderIGram = fileReader.nextInt();
        marsvin.add(m);
      }
    } catch (IOException e) {
      System.out.println("I/O Exception: " + e.getStackTrace());
    }

    int foderSum = 0;
    for (Marsvin m : marsvin) {
      foderSum += m.foderIGram;
    }

    Collections.sort(marsvin);
    System.out.println("Marsvin sorteret på navn:" + marsvin);
  }

  @Override
  public int compareTo(Object o) {
    if (! (o instanceof Marsvin))
      return 0;
    Marsvin m = (Marsvin) o;
    // return navn.compareTo(m.navn);
      return foderIGram < ((Marsvin) o).foderIGram ? -1 : 1;
  }

  @Override
  public String toString() {
    return "Navn: " + navn + ". Race: " + race + ". Foder: " + foderIGram + "\n";
  }

  @Override
  public boolean isDrinkable() {
    return false;
  }
}
