import java.util.*;

public class Main {

  static int max = 0;

  static void rs(char[][] arr, int y, int x) {

    char tmp = arr[y][x];
    arr[y][x] = arr[y][x + 1];
    arr[y][x + 1] = tmp;
  }

  static void cs(char[][] arr, int y, int x) {
    char tmp = arr[y][x];
    arr[y][x] = arr[y + 1][x];
    arr[y + 1][x] = tmp;
  }

  static void rc(char[][] arr, int y) {
    int cnt = 1;
    for (int i = 0; i < arr[0].length - 1; i++) {
      if (arr[y][i] == arr[y][i + 1]) {
        cnt++;
        if (max < cnt)
          max = cnt;
      } else
        cnt = 1;
    }
  }

  static void cc(char[][] arr, int x) {
    int cnt = 1;
    for (int i = 0; i < arr[0].length - 1; i++) {
      if (arr[i][x] == arr[i + 1][x]) {
        cnt++;
        if (max < cnt)
          max = cnt;
      } else
        cnt = 1;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    scanner.nextLine();
    char[][] arr = new char[N][];

    for (int i = 0; i < N; i++) {

      arr[i] = scanner.nextLine().toCharArray();
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < (N - 1); j++) {
        rs(arr, i, j);
        rc(arr, i);
        cc(arr, j);
        cc(arr, j + 1);
        rs(arr, i, j);

        cs(arr, j, i);
        rc(arr, j);
        rc(arr, j + 1);
        cc(arr, i);
        cs(arr, j, i);
      }
    }
    System.out.println(max);

  }
}
