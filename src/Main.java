import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = arrayRandom(30);
        /**
         * Сумма расходов (задача 1)
         */
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("Сумма расходов за месяц = " + sum);
        /**
         * Максимальный и минимальный
         */
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный расход = " + min + " , максимальный расход = " + max);
        /**
         * Средний расход
         */
        System.out.printf("Средний расход за месяц = %.2f \n" ,(double)sum/ array.length);
        /**
         * Буквы наоборот
         */
        String string = "вонавИ чивонавИ навИ";
        char[] stringToChar = string.toCharArray();
        for (int i = stringToChar.length -1; i >=0 ; i--) {
            System.out.print(stringToChar[i]);
        }
    }
    /**
     *Ветка для пула
     */



    public static int[] arrayRandom(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }
}
