package Methods;

public class task_3 {
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5};
    int maxNumber = findMax(numbers);
    System.out.println(maxNumber);
    }
}