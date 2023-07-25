package Exception_handling_HW1.Task2;

import java.util.Arrays;



class Answer {
  public int[] subArrays(int[] a, int[] b) throws ArrayIndexOutOfBoundsException {

    int[] c = new int[a.length];
    int[] x = new int[1];
    try {

      if (a.length == b.length) {

        for (int i = 0; i < c.length; i++) {
          c[i] = a[i] - b[i];

        }

      }
    } catch (Exception e) {
      if (a.length != b.length) {
        // int[]x = new int[1];
        x = Arrays.copyOfRange(c, 0, 0);

      }

    }
    if (a.length == b.length) {
      return c;
    } else {
      return x;
    }

  }
}

// Введите свое решение ниже

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Program {
  public static void main(String[] args) {
    int[] a = {};
    int[] b = {};

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      a = new int[] { 4, 5, 6, 12 };
      b = new int[] { 1, 2, 3, 10 };
    } else {
      a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
      b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
    }

    Answer ans = new Answer();
    String itresume_res = Arrays.toString(ans.subArrays(a, b));
    System.out.println(itresume_res);
  }
}
