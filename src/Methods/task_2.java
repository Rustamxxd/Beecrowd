package Methods;

public class task_2 {
    public static void displayArray(int[] array) {
        for (int i : array)
            System.out.println(i);
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        task_2.displayArray(numbers);
    }
}