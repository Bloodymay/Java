package HW2_tasks.task2;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void bubbleSort(int[] arr) throws IOException {
        Logger logger = Logger.getLogger(Program.class.getName());
        FileHandler fl = new FileHandler("log.xml", true);
        logger.addHandler(fl);
        XMLFormatter xml = new XMLFormatter();
        fl.setFormatter(xml);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    logger.info("Отсортированный массив: \n" + Arrays.toString(arr));
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {

        int[] arr = new int[] { 1, 7, 45, 22, 6 };
        bubbleSort(arr);
        //System.out.println(Arrays.toString(arr));
    }

}
