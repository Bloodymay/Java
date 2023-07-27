package Exception_handling_HW2.task3;
//public static void main(String[] args) throws Exception {
   //try {
       //int a = 90;
       //int b = 3;
       //System.out.println(a / b);
       //printSum(23, 234);
       //int[] abc = { 1, 2 };
       //abc[3] = 9;
  // } catch (Throwable ex) {
       //System.out.println("Что-то пошло не так...");
   //} catch (NullPointerException ex) {
       //System.out.println("Указатель не может указывать на null!");
//} catch (IndexOutOfBoundsException ex) 
       //System.out.println("Массив выходит за пределы своего размера!");
   //}
//}
//public static void printSum(Integer a, Integer b) throws FileNotFoundException {
  // System.out.println(a + b);
//}
//}


public class Program {
    public static void printSum(Integer a, Integer b) { // удален отлов  FileNotFoundException (нет нужды отлавливать исключение файл не найден,т.к. работа  с файлами не проводится )
    System.out.println(a + b);
}
    public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } 
   //catch (Throwable ex) {
       //System.out.println("Что-то пошло не так..."); //отлов исключения через класс-предок лучше опустить в самый низ,тк  
       //все нижеуказанные catch не будут отрабатываться ни в каком случае
    catch(ArithmeticException e){
        System.out.println("Делить на 0 нельзя!");// Добавлен отлов исключения при делении на  0
    }catch (IndexOutOfBoundsException e) {
       System.out.println("Массив выходит за пределы своего размера!");
   }catch (Throwable e) {
       System.out.println("Что-то пошло не так...");
}
}
}

