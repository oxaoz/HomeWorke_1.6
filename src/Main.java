public class Main {
    public static void main(String[] args) {

        // Задание 1, Задача 1.
        System.out.println("Задание 1, Задача 1");

        for(int i = 0; i < 10; i++) {
            System.out.println("Итарация числа - " + i);
        }

        // Задание 1, Задача 2.
        System.out.println("Задание 1, Задача 2.");

        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация числа - " + i);
        }

        // Задание 1, Задача 3.
        System.out.println("Задание 1, Задача 3.");

        for (int i = 0; i < 17; i = i+2) {
            System.out.println("Каждое четное число до 17 - " + i);
        }

        // Задание 1, Задача 4.
        System.out.println("Задание 1, Задача 4.");

        for (int i = 10; i > -10; i--) {
            System.out.println("Все числа от 10 до -10 = " + i);
        }
    }
}