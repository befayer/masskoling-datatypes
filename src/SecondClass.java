import java.util.Scanner;

public class SecondClass {

    // Напишите программу на Java, которая принимает на вход строку,
    // содержащую числа, разделенные пробелами.
    // Программа должна вычислить среднее арифметическое всех чисел и
    // вывести его на экран с точностью до двух знаков после запятой.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку чисел, разделенных пробелами: ");

        /*
        *Тип данных* input = scanner.nextLine();

        *Тип данных* numbers = input.split(" ");
        *Тип данных* sum = 0;

        for (*Тип данных* num : numbers) {
            sum += Integer.parseInt(num);
        }

        *Тип данных* average = (*Тип данных*) sum / numbers.length;

        System.out.printf("Среднее арифметическое: %.2f", average);
         */
    }
}
