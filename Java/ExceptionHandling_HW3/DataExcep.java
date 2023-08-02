package Java.ExceptionHandling_HW3;

public class DataExcep extends Exception{
    public DataExcep() {
    }

    public void dataExcep(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Неверный формат данных: %s", i);
        System.out.println();
    }
}