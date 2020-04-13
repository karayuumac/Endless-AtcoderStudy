package Review;

import java.util.Random;

/**
 * @author karayuu
 */
public class RandomViewer {
  public static void main(String[] args) {
    int[] a = new int[1000];
    Random random = new Random();
    for (int i = 0; i < 1000; i++) {
      int randInt = random.nextInt(19) + 1;
      a[i] = randInt;
    }

    println(a);

    for (int i = 1; i < 20; i++) {
      int count = 0;
      for (int j = 0; j < 1000; j++) {
        if (a[j] == i) count++;
      }
      double percentage = (double) count / 1000;
      System.out.println(formattedNumber(i) + "が出た割合は" + percentage + "です。");
    }
  }

  /**
   * 配列を出力し改行します.(2 10 19 5のような感じ)
   * @param a 出力すべき配列
   */
  private static void println(int[] a) {
    for (int i : a) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  /**
   * 与えられた数字を整形して返します.
   * 具体的には1桁の数は前に半角スペースを,2桁の数はそのまま返します.
   *
   * @param i 整形する整数(ただし非負整数)
   * @return 整形された文字列
   */
  private static String formattedNumber(int i) {
    if (0 <= i && i <= 9) {
      return " " + i;
    } else {
      return "" + i;
    }
  }
}
