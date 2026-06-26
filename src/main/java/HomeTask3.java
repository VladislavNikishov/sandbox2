import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {

        // Задание 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String fname = scanner.nextLine();
        System.out.println("Привет " + fname);

        // Задание 2
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt();
        System.out.println("Через год вам будет " + (age + 1) + " лет.");

        // Задание 3
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        System.out.println("Сумма: " + (num1 + num2));
        System.out.println("Разность: " + (num1 - num2));
        System.out.println("Произведение: " + (num1 * num2));

        // Задание 4
        Faker faker = new Faker();
        String name1 = faker.name().username();
        String city = faker.address().city();
        String company = faker.company().name();
        System.out.println("Информация о заказе:");
        System.out.println("Клиент: " + name1);
        System.out.println("Город: " + city);
        System.out.println("Организация: " + company);

        // Задание 5
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String name = scanner4.nextLine();
        Faker faker2 = new Faker();
        String name3 = faker2.name().firstName();
        if (name.contains(name3)) {
            System.out.println("Поздравляем! Вы выиграли!");
        }
        else System.out.println("Вы не выиграли");

        // Задание 6
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        System.out.println(Arrays.toString(numbers));

        // Задание 7
        int[] numbers12 = {1, 2, 3, 4, 5};
        numbers12[0] = 10;
        numbers12[4] = 50;
        for (int i = 0; i < numbers12.length; i++) {
            numbers12[i]++;
        }
        System.out.println(Arrays.toString(numbers12));

        // Задание 8
        String[] week = new String[7];
        week[0] = "monday";
        week[1] = "tuesday";
        week[2] = "wednesday";
        week[3] = "thursday";
        week[4] = "friday";
        week[5] = "saturday";
        week[6] = "sunday";
        for (int i = 0; i < week.length; i++) {
            week[i] = week[i].toUpperCase();
        }
        System.out.println(Arrays.toString(week));
    }
}
