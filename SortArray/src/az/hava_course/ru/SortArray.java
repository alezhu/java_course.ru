/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.hava_course.ru;

import java.util.Timer;

/**
 *
 * @author azhuravlev
 */
public class SortArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int COUNT  = 100;
        long startTime;
        startTime = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            Sort2();
            if (i == 0) {
                startTime = System.nanoTime();
            }
        }
        System.out.println(System.nanoTime() - startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            Sort1();
            if (i == 0) {
                startTime = System.nanoTime();
            }
        }
        System.out.println(System.nanoTime() - startTime);

    }

    private static void Sort1() {
        int[] sample = {12, 56, 7, 34, 89, 43, 23, 9};

        // выставляем признак "обмена" переменных в true, чтобы начать цикл
        boolean changed = true;

        // цикл длится до тех пор, пока при проверке массива ни одного обмена не произошло
        while (changed) {
            // Надеемся, что обмена данных не будет
            changed = false;
            // Проходим по всему массиву
            for (int i = 0; i < sample.length - 1; i++) {
                // Если впереди стоящее число больше, чем следующее - меняем
                // их местами и выставляем признак, что был обмен
                if (sample[i] > sample[i + 1]) {
                    // Производим обмен с использованием дополнительной переменной
                    int tmp = sample[i];
                    sample[i] = sample[i + 1];
                    sample[i + 1] = tmp;
                    // Выставляем признак обмена в true
                    changed = true;
                }
            }
        }
//        // Выводим отсортрованный массив
//        for (int i = 0; i < sample.length; i++) {
//            System.out.println(sample[i]);
//        }
    }

    private static void Sort2() {
        int[] sample = {12, 56, 7, 34, 89, 43, 23, 9};
        for (int top = sample.length; top > 0; top--) {

            // Проходим по всему массиву
            for (int i = 0; i < top - 1; i++) {
                // Если впереди стоящее число больше, чем следующее - меняем
                // их местами и выставляем признак, что был обмен
                if (sample[i] > sample[i + 1]) {
                    // Производим обмен с использованием дополнительной переменной
                    int tmp = sample[i];
                    sample[i] = sample[i + 1];
                    sample[i + 1] = tmp;
                }
            }
        }
//        // Выводим отсортрованный массив
//        for (int i = 0; i < sample.length; i++) {
//            System.out.println(sample[i]);
//        }
    }

}
