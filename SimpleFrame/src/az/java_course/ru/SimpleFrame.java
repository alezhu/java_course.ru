/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package az.java_course.ru;

import javax.swing.JFrame;

/**
 *
 * @author azhuravlev
 */
public class SimpleFrame extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создали экземпляр класса - объект
        JFrame sf = new JFrame();
        // Установим заголовок
        sf.setTitle("First window");
        // Установим свойство - завершить приложение при закрытии окна
        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Выставим координаты и размеры 
        // Верхний левый угол - первые два числа 100 и 100
        // Ширина и высота - вторы два числа 400 и 200
        sf.setBounds(100, 100, 400, 200);
        // Отобразим окно, сделав его видимым
        sf.setVisible(true);
        // Теперь у нас на экране появилось окно, которым
        // можно управлять - перетаскивать, менять размеры.
        // Разве не красиво ?
    }
    
}