// * +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
package HW1_tasks.task4;
// Безуспешная попытка устроить пользовательский ввод

// import java.util.Scanner;
// Scanner iScanner = new Scanner(System.in);
// System.out.print("Введите выражение: ");
// String expression = iScanner.nextLine();
// String[] parts = expression.split("=");
// int myNum = Integer.parseInt(parts[1].trim());
// String myString = parts[0];
// String [] leftPart = myString.split("+");
// leftPart = myString.split("??");
// System.out.println(leftPart);

public class Program {
    public static void main(String[] args) throws Exception {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + j * 10 + 5 == 69) {
                    count ++;
                    System.out.println("Решение №" + count + " 2" + i + " + " + j + "5" + " = 69");
                }
            }
        }

        if (count == 0) {
            System.out.println("Решений нет");
        }

    }

}
