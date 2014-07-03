/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.java_course.ru;

/**
 *
 * @author azhuravlev
 */
public class LoopForWithIfTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] arg) {
        int count = 13;
        Sub1(count);
        System.out.println();
        Sub2(count);
        System.out.println();
        Sub3(count);
        System.out.println();
        Sub4(count);
        System.out.println();
        Sub5(count);
        System.out.println();
    }

    /**
     * Left triangle
     *
     * @param count
     */
    private static void Sub1(int count) {
        // Внешний цикл
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print((k == 0 || k == i || i == count - 1) ? "*" : " ");
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    /**
     * Rectangle with diagonals
     *
     * @param count
     */
    private static void Sub2(int count) {
        // Внешний цикл
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                System.out.print((row == 0 || col == 0 || row == count - 1 || col == count - 1 || col == row || col == count - row - 1) ? "*" : " ");
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    /**
     * Right triangle
     *
     * @param count
     */
    private static void Sub3(int count) {
        // Внешний цикл
        for (int row = 0; row < count; row++) {
            for (int col = 0; col < count; col++) {
                System.out.print((row == count - 1 || col == count - 1 || col == count - row - 1) ? "*" : " ");
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    /**
     * Simetrical triangle
     *
     * @param count
     */
    private static void Sub4(int count) {
        // Внешний цикл
        int half_count = (count) / 2;
        int row_count = half_count + 1;
        for (int row = 0; row < row_count; row++) {
            for (int col = 0; col < count; col++) {
                System.out.print((row == row_count - 1 || row == Math.abs(half_count - col)) ? "*" : " ");
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    /**
     * Romb
     *
     * @param count
     */
    private static void Sub5(int count) {
        // Внешний цикл
        int half_count = (int) Math.ceil(count / 2);
        int row_count = count;
        for (int row = 0; row < row_count; row++) {
            for (int col = 0; col < count; col++) {
                System.out.print(
                        (col == count - 1 && row == half_count)
                        || (row == Math.abs(half_count - col)
                        || Math.abs(row - count + 1) == Math.abs(half_count - col))
                        ? "*" : " ");
            }
            // Переход на следующую строку
            System.out.println();
        }
    }
}
