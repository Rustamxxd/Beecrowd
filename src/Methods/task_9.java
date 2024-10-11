package Methods;

public class task_9 {
    public static int sumArray(int[] array) {
    int sum = 0;
    for (int el : array) {
        sum += el;
    }
    return sum;
    }
    public static void main(String[] args) {
        int[] elements = {1,2,3,4,5};
        int totalSum = sumArray(elements);
        System.out.print("Сумма элементов: " + totalSum);
    }
}
