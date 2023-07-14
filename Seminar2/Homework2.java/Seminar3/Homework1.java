import java.util.Arrays;
import java.util.ArrayList;

// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

public class Homework1 {
  public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,9,56,220,11,23,12,443));

// 1) Нужно удалить из него чётные числа      
            for (int i = array.size()-1; i >= 0; i--) {
                if (array.get(i) % 2 == 0)
                array.remove(i);
                else 
                System.out.println(array);
            }
// 2) Найти минимальное значение
// 3) Найти максимальное значение
        int min = array.get(0);
        int max = array.get(0);
            for (Integer i: array) {
                if(i < min) 
                min = i;
                if(i > max) 
                max = i;
            }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);

// 4) Найти среднее значение
        double sum = 0;
        double average = 0;
            if (array.size() > 0) {
                for (int j = 0; j < array.size(); j++) {
                    sum += array.get(j);
                }
                average = sum / array.size();
        System.out.println("Среднее число: " + average);
            }
                
    }
}









 

