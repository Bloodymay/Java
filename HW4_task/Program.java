// Реализовать консольное приложение, которое:

// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
// Если введено exit, завершаем программу




package HW4_task;

import java.util.LinkedList;
import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строки. Для печати введите - 'print', для удаления предыдущего элемента - 'revert', для выхода - 'exit'");
            LinkedList<String> list = new LinkedList<>();
            while (true) {
                String command = sc.nextLine();
                if (command.equals("exit")) {
                    break;
                }
                else if (command.equals("print")) {
                    System.out.println(list); 

                }
                else if (command.equals("revert")) {
                    if (!list.isEmpty()) {
                        list.removeFirst();                       
                        // System.out.println(list);
                    } else {
                        System.out.println("Нет сохраненных строк");
                    }

                } else {
                    list.addFirst(command);
                }
            }
        }
    }


