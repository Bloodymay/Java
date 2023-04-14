// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

package sem1_tasks.task3;

public class Program {
    public static void main(String[] args) {
        int[] arr = new int[] { 7, 2, 3, 2, 4, 6, 3, 2 };
        int val = 3;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == val) {
                    arr[i] = arr[j];
                    arr[j] = val;

                }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
