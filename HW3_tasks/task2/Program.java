// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package HW3_tasks.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = iScanner.nextInt();
        List<Integer> array = new ArrayList<>(n);
        System.out.print("Введите числа для заполнения массива по одному:\n ");
        for (int i = 0; i < n; i++) {

            int a = iScanner.nextInt();
            array.add(i, a);

        }
        iScanner.close();
        Iterator<Integer> arrIterator = array.iterator();
        System.out.println(array);
        while (arrIterator.hasNext()) {
            Integer nextInteger = arrIterator.next();
            if (nextInteger % 2 == 0) {
                arrIterator.remove();

            }

        }
        System.out.println(array);
    }
}
