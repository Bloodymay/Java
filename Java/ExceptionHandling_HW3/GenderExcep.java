package Java.ExceptionHandling_HW3;


public class GenderExcep extends Exception {
    public GenderExcep() {
    }

    public void GenderExcep(String i) {
        System.out.println("Exception: GenderNotCorrectData");
        System.out.printf("Неверно указан пол. Ведите m или f в зависимости от пола: %s", i);
        System.out.println();
    }
}