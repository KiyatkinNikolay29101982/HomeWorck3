import java.util.Arrays;
import java.util.Scanner;
// задача  из группы заполните массив четными целыми числами начиная с числа 2 и выведите их на экран.
class HomeWorck2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("введите верхнюю границу массива чисел");

        int sizeOfArray = (int) sc.nextInt() / 2;

        int [] evenNumber = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i ++){
            evenNumber[i] = (i + 1) * 2;
        }

        System.out.println(Arrays.toString(evenNumber));

        System.out.println("содержание массива: ");

        for (int i = 0; i < sizeOfArray; i ++ ){

                System.out.printf(" %d %n", evenNumber[i]);
            }

    }

}