package ru.avalon.java.dev.j10.labs.initialization;

import static java.lang.Math.random;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    private int a;
    private int b;

    public RandomInitializer(int a, int b) {
        this.a = a;
        this.b = b;
    }
 
       
    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    public void initialize(int[] array) {
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
   for (int i = 0; i < array.length; i++) {
   array[i] = (int) (random() *(b-a))+a;
   }  
}
}