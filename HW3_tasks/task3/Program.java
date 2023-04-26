// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package HW3_tasks.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = iScanner.nextInt();
        List<Integer> array = new ArrayList<>(n);
        System.out.print("Введите числа для заполнения массива по одному:\n");
        for (int i = 0; i < n; i++) {

            int a = iScanner.nextInt();
            array.add(i, a);

        }
        iScanner.close();
        int result = 0;

        for (int i : array) {

            result += i;

        }

        System.out.println("Минимальный элемент:" + Collections.min(array));
        System.out.println("Максиимальный элемент:" + Collections.max(array));
        System.out.println("Среднее значение:" + result / array.size());
    }
}