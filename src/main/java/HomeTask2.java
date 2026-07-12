import java.awt.print.Book;

public class HomeTask2 {
    public static void main(String[] args) {
        // Задание 1
        int chi = 8;

        if (chi % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

        // Задание 2
        int age = 18;

        if (age >= 18) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

        // Задание 3
        int a = 0;
        int b = 1;

        if (a > b) {
            System.out.println("Число a больше");
        } else {
            System.out.println("Число b больше");
        }

        // Задание 4
        int score = 78;

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 75) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else if (score >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Некорректный балл");
        }

        // Задание 5
        double cost = 650;
        int discount = 0;

        if (cost < 100) {
            discount = 0;
        } else if (cost < 500) {
            discount = 10;
        } else {
            discount = 20;
        }
        System.out.println(discount);

        // Задание 6
        int dish = 2;

        if (dish == 1) {
            System.out.println("Пицца - 700 руб.");
        } else if (dish == 2) {
            System.out.println("Бургер - 450 руб.");
        } else if (dish == 3) {
            System.out.println("Салат - 350 руб.");
        } else if (dish == 4) {
            System.out.println("Кофе - 200 руб.");
        } else {
            System.out.println("Такого блюда нет.");
        }

        // Задание 7
        int count = 0;

        for (int i = 1; i <= 18; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Четных чисел: " + count);

        // Задание 8
        int sum = 0;

        for (int i = 1; i <= 7; i++) {
            sum += i;
        }
        System.out.println(sum);

        // Задание 9
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // Задание 10
        int number = 10;
        while (number >= 1) {
            System.out.println(number);
            number--;
        }

        // Задание 11
        int number1 = 123456;
        int count1 = 0;

        while (number1 != 0) {
            number1 = number1 / 10;
            count1++;
        }
        System.out.println("Количество цифр: " + count1);
    }
}