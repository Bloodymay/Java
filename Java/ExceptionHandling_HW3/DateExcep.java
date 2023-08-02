package Java.ExceptionHandling_HW3;

public class DateExcep extends Exception {
    public DateExcep() {
    }

    public void DataExcep(String i) {
        System.out.println("Exception: Incorrect date format");
        System.out.printf("Некорректный формат даты: %s", i);
        System.out.println();
    }
}