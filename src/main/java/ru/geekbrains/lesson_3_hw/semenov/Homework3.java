package ru.geekbrains.lesson_3_hw.semenov;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        GuessingGame();
    }

    public static void GuessingGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Я загадаю случайное число от 0 до 9, угадайте его с 3х попыток!");
        Random random = new Random();
        int randomNumber = random.nextInt(9);
        int attempts = 3;
        int n = 0;
        for (int i = 0; i < attempts; i++) {
            System.out.println("Введите число от 0 до 9");
            n = i + 1;
            int enteredNumber = sc.nextInt();
            if (enteredNumber == randomNumber) {
                System.out.println("Поздравляю! Вы угадали!");
                break;
            } else if (enteredNumber > randomNumber) {
                System.out.println("Вы потратили " + n + " попытку, загаданное число меньше");
            } else {
                System.out.println("Вы потратили " + n + " попытку, загаданное число больше");
            }
            if ((i + 1) == attempts) {
                System.out.println("У вас закончились попытки... коварный компьютер оказался хитрее ;-)");
            }
        }
        System.out.println();
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int replayNumber = sc.nextInt();
        if (replayNumber == 1) {
            GuessingGame();
        }
        sc.close();
    }
}