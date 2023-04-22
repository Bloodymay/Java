package HW2_tasks.task3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Program {
    private static Logger logger;

    public static void main(String[] args) throws Exception {
        try {
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
            Logger logger = Logger.getLogger(Program.class.getName());
            FileHandler fl = new FileHandler("log.xml", true);
            logger.addHandler(fl);
            XMLFormatter xml = new XMLFormatter();
            fl.setFormatter(xml);
            switch (oper) {
                case '/':
                    try {
                        result = a / b;
                        logger.info("\n Произведено деление. \n");
                    } catch (ArithmeticException e) {
                        System.out.println("Делить на ноль нельзя!");
                        logger.warning("\n Попытка деления на 0! \n");
                    }
                    break;
                case '*':
                    result = a * b;
                    System.out.println(result);
                    logger.info("\n Произведено умножение. \n");
                    break;
                case '-':
                    result = a - b;
                    System.out.println(result);
                    logger.info("\n Произведено вычитание. \n");
                    break;
                case '+':
                    result = a + b;
                    System.out.println(result);
                    logger.info("\n Произведено сложение. \n");
                    break;
                case 'p':
                    result = Math.pow(a, b);
                    System.out.println(result);
                    logger.info("\n Возведение в степень. \n");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный оператор/число. Повторите ввод");
            logger.warning("\n Попытка ввода недопустимого числа или оператора \n");

        }

    }

}
