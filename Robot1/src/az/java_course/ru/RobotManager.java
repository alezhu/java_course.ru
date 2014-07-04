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
public class RobotManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создаем объекта класса Robot
        Robot robot = new Robot();

        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        // Курс 90 градусов - не самый правильный способ
        // но давайте пока остановимся на нем
        robot.course = 90;
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        // Курс 45 градусов
        robot.course = 45;
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();
    }

}
