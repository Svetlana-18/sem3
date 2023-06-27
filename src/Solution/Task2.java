// Задача 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Solution;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

// Сначала генерирую список, затем суммирую элементы (для расчета среднеарифметического), 
// и вывожу список на печать.
public class Task2 {
    public static void searchForValues(String[] args) {
        Random rndNumb = new Random();
        int length = 25;
        int minNumb, maxNumb;
        float averNumb = 0;
        ArrayList<Integer> listNumb = new ArrayList<Integer>(length);
        for (int i = 0; i < length; i++) {
            listNumb.add(rndNumb.nextInt(100));
            averNumb = averNumb + listNumb.get(i);
        }
        System.out.println("Исходный список случайных чисел равен: ");
        System.out.println(listNumb);
        Collections.sort(listNumb);
        // Сортирую массив. После этого первый (index=0) элемент будет минимальным
        // значением, последний(index=length-1)- максимальным.
        System.out.println("Отсортированный список имеет вид: ");
        System.out.println(listNumb);
        minNumb = listNumb.get(0);
        maxNumb = listNumb.get(length - 1);
        System.out.println("Сумма чисел списка = " + averNumb);
        // Вычисляю среднее арифметичекое (полученную сумму из цикла for делим на длину)
        averNumb = averNumb / length;
        System.out.println("Минимальный элемент списка = " + minNumb);
        System.out.println("Максимальный элемент списка = " + maxNumb);
        System.out.println("Среднееарифметическое списка = " + averNumb);
    }
}