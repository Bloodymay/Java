//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
package Exception_handling_HW2.task4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String a = iScanner.nextLine();
        if (!a.isEmpty()) {
            System.out.println("Ваша строка: " + a);
        } else {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
    }
}



