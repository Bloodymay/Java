// Вывести все простые числа от 1 до 1000

package HW1_tasks.task2;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        int n = 1000;
        List<Integer> array = new ArrayList<>(n);
        for (int i = 2; i <= n; i++) {
            boolean a = true;
            int b = (int) Math.sqrt(i);
            for (int j = 2; j <= b; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                array.add(i);
            }

        }
        System.out.println(array + " - простые числа от 1 до 1000");

    }

}
