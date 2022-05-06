// текст задачи (взят из чата группа 224: Создай массив из заданного количества случайных целых чисел из заданного отрезка.
// Выведи массив на экран. Выведи количество четных чисел

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorckN3 {
        int max;                //  задает верхнюю граница залданного диапазона чисел.
        int min;               // задает границу заданного диапазона
        int sizeOfArray;      //какое количество чисел вы хотели бы проверить из указанного диапазона (по сути - это длина массива которую задает
                             //  пользователь
        int [] array;


        public HomeWorckN3 ()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("введите максимальное число диапазона");
            max = sc.nextInt();

            System.out.println("введите минимальное число  диапазона");
            min = sc.nextInt();

            System.out.println("Введите количество чисел, которое Вы хотите проанализировать");
            sizeOfArray = sc.nextInt();

            array = new int [sizeOfArray];

            for (int i = 0; i < array.length; i ++ ){
                array[i] = (int) ((Math.random() * (max - min) + min));
            }
        }

        public static void getEvenNumbers(int[] e)
        {   System.out.println("вот ваши числа");
            System.out.println(Arrays.toString(e));
            int count = 0;
            System.out.println("четные числа");
            for(int i = 0; i < e.length; i ++ )
            {
                if(e[i] % 2 == 0)
                {
                    System.out.println(e[i] + " ");
                    count ++;
                }

            }
            System.out.println("количество четных чисел - " + count);
        }



        public static void main(String [] args){

            HomeWorckN3 a1 = new HomeWorckN3();
            HomeWorckN3.getEvenNumbers(a1.array);

        }
    }



