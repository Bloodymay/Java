package Exception_handling_HW2.task2;
//Если необходимо, исправьте данный код 
//try {
//   int d = 0;
  // double catchedRes1 = intArray[8] / d;
   //System.out.println("catchedRes1 = " + catchedRes1);
//} catch (ArithmeticException e) {
//   System.out.println("Catching exception: " + e);
//}



public class Program {
    public static void main(String[] args) {
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7 }; //определен массив
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) { // отловлено исключение выход за пределы массива
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
