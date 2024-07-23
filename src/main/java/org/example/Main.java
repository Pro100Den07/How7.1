package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};

        int sumNegative = 0;
        int countEven = 0;
        int countOdd = 0;
        int min = numbers[0];
        int minIndex = 0;
        int max = numbers[0];
        int maxIndex = 0;
        double averageAfterNegative = 0;
        boolean foundFirstNegative = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sumNegative += numbers[i];
            }

            if (numbers[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }

            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }

            if (foundFirstNegative) {
                averageAfterNegative += numbers[i];
            }

            if (!foundFirstNegative && numbers[i] < 0) {
                foundFirstNegative = true;
            }
        }

        averageAfterNegative /= numbers.length - minIndex;

        System.out.println("Сума від'ємних чисел: " + sumNegative);
        System.out.println("Кількість парних чисел: " + countEven);
        System.out.println("Кількість непарних чисел: " + countOdd);
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");
        System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", averageAfterNegative);
    }
}