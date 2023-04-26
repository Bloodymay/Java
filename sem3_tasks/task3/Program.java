package sem3_tasks.task3;

import java.util.ArrayList;
import java.util.Iterator;

public class Program {
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        array.add("Anna");
        array.add("1");
        array.add("Regina");
        array.add("2");
        array.add("Polina");
        array.add("3");
        array.add("Mayya");
        array.add("4");
        System.out.println(array);

        Iterator<String> arrIterator = array.iterator();

        while (arrIterator.hasNext()) {
            String nextInteger = arrIterator.next();
            if (isDigit(nextInteger) == true) {
                arrIterator.remove();

            }

        }

        System.out.println(array);
    }
}
