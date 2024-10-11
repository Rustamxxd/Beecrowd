package Methods;

public class task_6 {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
    double fahrenheit = 50;
    double celsius = fahrenheitToCelsius(fahrenheit);
    System.out.print("Температура в градусах Цельсия: " + celsius);
    }
}
