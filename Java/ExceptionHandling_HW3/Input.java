package Java.ExceptionHandling_HW3;

import java.util.Scanner;

public class Input {
    public String[] InputData() {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) : ");
            String s = scan.nextLine();
            String[] str = s.split(" ");
            if (str.length == 6) {
                return str;
            } else if (str.length < 6) {
                System.out.println("Введено меньше шести параметров!");
            } else
                System.out.println("Введено больше шести параметров!");

        }

    }
 
}
