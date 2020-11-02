package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Application {

    public static void main(String[] args) {

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
	     */
    int[] array = new int[20];
            
	    /* 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     */
    FibonacciInitializer fibonacciInitializer = new FibonacciInitializer();
    fibonacciInitializer.initialize(array);
          
        /* 2. Найти сумму элементов массива.
         */
    int sumfib = 0;
    for (int i = 0; i < array.length; i++){
        sumfib =sumfib + array[i];
        }
      
	     /* 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     */
    RandomInitializer randomInitializer = new RandomInitializer(-50, +50);
	randomInitializer.initialize(array);
          
	     /* 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     */

    BubbleSort buble = new BubbleSort();
	buble.sort(array);
                 
         /* 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */
    RandomInitializer randomInitializer2 = new RandomInitializer(-50, +50);
        randomInitializer.initialize(array);
         /* 6. Отсортировать массив с использованием
         *    сортировки выбором.
         */
    SelectionSort selection = new SelectionSort();
        selection.sort(array);
     
         /* 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */
    RandomInitializer randomInitializer3 = new RandomInitializer(-50, +50);
	randomInitializer.initialize(array);
        /* 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    ShellSort shell = new ShellSort();
        shell.sort(array);
         
    }
}
