package graphics.start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * public class Main и public static void main(String[] args) должно быть обязательно!
 * Вся программа должна быть написана внутри фигурных скобок public static void main(String[] args)
 */
public class MainButton3 {
    //Тут объявляются переменные, которые должны изменяться при нажатии на кнопку. Если их тут не разместить, то java их не увидит!!!
    static int width = 400;    //Переменная для ширины окна
    static int height = 300;   //Переменная для высоты окна


    public static void main(String[] args) {
        //ЗДЕСЬ ДОЛЖНЕН БЫТЬ НАПИСАН КОД.
        //ЗА ФИГУРНЫЕ СКОБКИ НЕ ВЫХОДИТЬ!!!
        JFrame frame = new JFrame();            //Главное окно приложения
        frame.setLayout(new FlowLayout());                  //Обязательная строка, чтобы можно красиво размещать элементы. Элементы будут занимать столько места, сколько им необходимо
        frame.setSize(width, height);    //Установка ширины.
        frame.setLocation(500, 200);        //Местоположение окна. Принимает два параметра. Первый - свдиг по горизонтали, второй - сдвиг по вертикали
        frame.setVisible(true);                 //Делаем окошко приложения видимым. По-умолчанию оно невидимо и если не написать эту команду, то мы ничего не увидим

        //Кнопка
        JButton plusButton = new JButton("Добавить кнопку"); //Внутри скобок, в кавычках, пишется текст кнопки

        /**ДЕЙСТВИЯ, КОТОРЫЕ БУДУТ ПРОИСХОДИТЬ ПРИ НАЖАТИИ НА КНОПКУ*/
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //ЗДЕСЬ ПИШУТСЯ САМИ ДЕЙСТВИЯ
                JButton newButton = new JButton("Кнопка");
                frame.add(newButton);
                /**Три команды, которые перезагружают окошко, после добавления элементов.
                 * Если не написать эти команды - мы нек увидим изменений на форме.*/
                frame.invalidate();
                frame.validate();
                frame.repaint();

            }
        });
        frame.add(plusButton);                                  //Добавление кнопки в окно приложения

    }
}
