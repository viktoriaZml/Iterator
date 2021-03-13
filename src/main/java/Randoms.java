import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
  protected Random random;
  private int min;
  private int max;

  public Randoms(int min, int max) {
    random = new Random();
    this.min = min;
    this.max = max;
  }

  public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
      public boolean hasNext() {
        return true;
      }

      public Integer next() {
        return random.nextInt(max - min + 1) + min;
      }
    };
  }
}