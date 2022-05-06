
// Задача угадать число.

import java.util.Scanner;

public class HomeWorck1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Угадай ка целое число от 0 до 100, которое загадал компьютер");

        int mashineNumber = (int) (Math.random() * 100);

        while (1 > 0) {
            System.out.println("Введите свое целое число");
            int userNumber = sc.nextInt();
            if (mashineNumber == userNumber) {
                System.out.println("Молодец ты угадал");
                break;
            } else if (mashineNumber < userNumber) {
                System.out.println("К сожалению ты не угадал, мое число меньше твоего");
            } else {
                System.out.println(" к сожалению не угадал мое число больше твоего ");
            }

        }

    }
}
