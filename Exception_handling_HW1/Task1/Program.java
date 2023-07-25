package Exception_handling_HW1.Task1;



class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        
        Integer[] arr = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(arr[11]);
      
}

    public static void divisionByZero() {
        int result = 10/0;
        System.out.println(result);
}

    public static void numberFormatException() {
        String str = new String("Hello");
        System.out.println(Integer.parseInt(str));

        // Напишите свое решение ниже
       
 }
}

public class Program {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}