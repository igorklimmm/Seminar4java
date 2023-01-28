// Задача 38: Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.
// [3.7; 7.2; 2.1; 7.8] -> 5.7


double[] FillArrayWithRandom(double[] array)
{
    for(int i = 0; i < array.Length; i++)
    {
        array[i] = Convert.ToDouble (new Random().Next(0, 100)) / 10;
    }
    return array;
}

Console.WriteLine("Введите длинну массива: ");
int size = Convert.ToInt32(Console.ReadLine());
double [] array = new double [size];
FillArrayWithRandom(array);
Console.Write("Ваш случайный массив: ");
Console.WriteLine(string.Join("; ", array));

double min = Int32.MaxValue;
double max = Int32.MinValue;
double raznica =  0;

for (int i = 0; i < array.Length; i++)
{
    if (array[i] > max)
        {
            max = array[i];
        }
    if (array[i] < min)
        {
            min = array[i];
        }
raznica = max-min;
}
Console.WriteLine("Разница равна: " + raznica);


