package Methods;

public class task_5 {
    public static double calculateAverage(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
            }
        return (double) sum / array.length;
        }
    public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5};
    double average = calculateAverage(numbers);
    System.out.println("Среднее значение: " + average);
    }
}

