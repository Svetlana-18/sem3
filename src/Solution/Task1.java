// Задача 2. Пусть дан произвольный список целых чисел, удалить из него четные числа

package Solution;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void generationList(String[] args) {
        Random rndNumb = new Random();
        int length = 25;
        ArrayList<Integer> listNumb = new ArrayList<Integer>(length);
        ArrayList<Integer> listEvenNumb = new ArrayList<Integer>(length);
        for (int i = 0; i < length; i++) {
            listNumb.add(rndNumb.nextInt(100));
        }
        System.out.println("Исходный массив случайных чисел равен: ");
        System.out.println(listNumb);
        for (int i = 0; i < length; i++) {
            if ((listNumb.get(i) % 2) == 0) {
                listEvenNumb.add(listNumb.get(i));
            }
        }
        listNumb.removeAll(listEvenNumb);
        System.out.println("Массив после удаления всех четных чисел: ");
        System.out.println(listNumb);
    }
}