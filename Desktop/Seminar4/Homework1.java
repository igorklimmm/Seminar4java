import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

//Формат сдачи: ссылка на подписанный git-проект.
//        Задание
//        1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//        2 *. Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
//        3. В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию.
//        Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.
public class Homework1 {
    // Метод который возвращает перевернутый список.
    public static void main (String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> itr = list.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "/" );
        }
        System.out.println(list);
        
        
    }

    public static void element (String[] args) {
        // возвращает первый элемент из очереди и удаляет его
        ArrayDeque<Integer> num = new ArrayDeque<Integer>();
        num.add(10);
        num.add(11);
        num.add(12);
        System.out.println("Удаление первого элемента " + num.pollFirst());
        System.out.println(num);
    }
}
