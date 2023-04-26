package sem3_tasks.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = iScanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>(size);
        iScanner.close();
        Random rnd = new Random();
        // double a = Math.random();
        for (int i = 0; i < size; i++) {
            array.add(rnd.nextInt(2, 10));
        }
        System.out.printf("Исходный массив:\n " + array);
        Collections.sort(array);
        System.out.printf("Отсортированный массив:\n " + array);
    }

}
