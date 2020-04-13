package Review;

/**
 * @author karayuu
 */
public class LoadingAnimation {
  private static Thread thread = new Thread(() -> {
    for (int i = 0; i <= 100; i++) {
      System.out.print("\r");
      System.out.print("読み込み中..." + decoration(i) + " " + i + "％終了。");
      try {
        //私の環境だと描画が追いついていなさそうだったので遅延を大きくしてあります。
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println();
    System.out.println("Loading complete.");
  });

  private static String decoration(int i) {
    switch (i % 4) {
      case 0: return "｜";
      case 1: return "／";
      case 2: return "ー";
      case 3: return "＼";
    }
    return "";
  }

  public static void main(String[] args) {
    thread.start();
  }
}