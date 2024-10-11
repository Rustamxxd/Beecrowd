package Methods;
import java.util.Arrays;

public class task_10 {
    public static int[] squareArray(int[] array) {
        int[] squaredArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squaredArray[i] = array[i] * array[i];
        }
        return squaredArray;
    }
    public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5};
    int[] squaredNumbers = squareArray(numbers);
    System.out.print(Arrays.toString(squaredNumbers));
    }
}