package graphics.start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * public class Main и public static void main(String[] args) должно быть обязательно!
 * Вся программа должна быть написана внутри фигурных скобок public static void main(String[] args)
 */
public class MainButton {
    public static void main(String[] args) {
        //ЗДЕСЬ ДОЛЖНЕН БЫТЬ НАПИСАН КОД.
        //ЗА ФИГУРНЫЕ СКОБКИ НЕ ВЫХОДИТЬ!!!
        int width = 400;    //Переменная для ширины окна
        int height = 300;   //Переменная для высоты окна

        JFrame frame = new JFrame();            //Главное окно приложения
        frame.setSize(width, height);    //Установка ширины.
        frame.setLocation(500, 200);        //Местоположение окна. Принимает два параметра. Первый - свдиг по горизонтали, второй - сдвиг по вертикали
        frame.setVisible(true);                 //Делаем окошко приложения видимым. По-умолчанию оно невидимо и если не написать эту команду, то мы ничего не увидим

        //Кнопка
        JButton button = new JButton("Нажми на меня!"); //Внутри скобок, в кавычках, пишется текст кнопки
        frame.setLayout(new FlowLayout());                  //Обязательная строка, чтобы можно красиво размещать элементы. Элементы будут занимать столько места, сколько им необходимо
        frame.add(button);                                  //Добавление кнопки в окно приложения

        /**ДЕЙСТВИЯ, КОТОРЫЕ БУДУТ ПРОИСХОДИТЬ ПРИ НАЖАТИИ НА КНОПКУ*/
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //ЗДЕСЬ ПИШУТСЯ САМИ ДЕЙСТВИЯ
                System.out.println("Кнопка на форме была нажата");
            }
        });

    }
}
