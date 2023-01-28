// Задача 36: Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.
// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0


int [] FillArrayWithRandom(int [] array) // Метод, рандомные числа
{
    for (int i = 0; i < array.Length; i++)
    {
    array[i] = new Random().Next (1, 100);
    }
    return array;
}

int [] array = new int [4]; // 4 элемента
FillArrayWithRandom(array);
System.Console.WriteLine("Рандомный массив: ");
System.Console.WriteLine(string.Join(',' , array));

int number = 0;

for (int i = 0; i < array.Length; i=i+2)
{
   number += array[i];
   
}
System.Console.WriteLine("Сумма элементов на нечетных позициях: "+ number);
