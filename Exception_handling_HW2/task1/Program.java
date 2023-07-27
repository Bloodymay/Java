//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

package Exception_handling_HW2.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        for (;;) {
            Scanner iScanner = new Scanner(System.in);
            try {

                System.out.print("Введите десятичное число: ");
                float a = iScanner.nextFloat();
                System.out.println(a);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный формат!");

            }

        }

    }
}
