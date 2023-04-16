// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HW1_tasks.task1;

import java.math.BigInteger;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int n = iScanner.nextInt();
        int i = 1;
        int res = 0;

        while (i <= n) {
            res = res + i;
            i++;
        }

        BigInteger fact = BigInteger.ONE;
        i = 1;
        while (i <= n) {
            fact = fact.multiply(BigInteger.valueOf(i));
            i++;
        }
        System.out.printf("N-ое треугольное число: " + res);
        System.out.printf("\nФакториал числа N: " + fact);
    }

}
