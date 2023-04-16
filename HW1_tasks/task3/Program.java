// Реализовать простой калькулятор

package HW1_tasks.task3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.println("Введите оператор(+,-,/,=,p(для возведения в степень)): ");
        char oper;
        oper = iScanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int b = iScanner.nextInt();
        iScanner.close();
        double result = 0;
        switch (oper) {
            case '/':
                try {
                    result = a / b;
                } catch (ArithmeticException e) {
                    System.out.println("Делить на ноль нельзя!");
                }
                break;
            case '*':
                result = a * b;
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.println(result);
                break;
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case 'p':
                result = Math.pow(a, b);
                System.out.println(result);
                break;

        }

    }

}
