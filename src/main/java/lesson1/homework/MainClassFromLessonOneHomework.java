package lesson1.homework;

import org.jetbrains.annotations.NotNull;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class MainClassFromLessonOneHomework {
    public static void main(String[] args) {
//         OneDimensionalArrMaxMin();

//         int[] arr = new int[]{3,2,2,3};
//         int val = 3;
//         MovementsInArray(arr, val);

//        SayHiToLocalTime();
    }

    private static void SayHiToLocalTime() {
//        В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

        System.out.println("Как вас зовут?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        if (hour >= 5 && hour < 12){
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >= 12 && hour < 18){
            System.out.println("Добрый день, " + name + "!");
        } else if (hour >= 18 && hour < 23){
            System.out.println("Добрый вечер, " + name + "!");
        } else{
            System.out.println("Доброй ночи, " + name + "!");
        }
    }

   public static void MovementsInArray(int @NotNull [] arr, int val) {
//        Дан массив = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

        int[] res = new int[arr.length]; // новый массив с такой же длинной
        Arrays.fill(res, val); // заполняем массив тройками

        for (int i = 0, j = 0; i < res.length; i++) {
            if (arr[i] != val) {
                res[j] = arr[i]; // перезапись
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }

    private static void OneDimensionalArrMaxMin() {
//        Задать одномерный массив и найти в нем минимальный и максимальный элементы

        int[] arr = new int[] {1, 67, 56, 34, 27, 8};
        int min = arr[0];
        int max = arr[0];

        for (int j : arr) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
        }
        System.out.printf("Minimum array element is %d", min);
        System.out.println();
        System.out.printf("Maximum array element is %d", max);
    }
}
