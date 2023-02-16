package graphics.start;

import javax.swing.*;

/**
 * public class Main и public static void main(String[] args) должно быть обязательно!
 * Вся программа должна быть написана внутри фигурных скобок public static void main(String[] args)
 */
public class Main2 {
    public static void main(String[] args) {
        //ЗДЕСЬ ДОЛЖНЕН БЫТЬ НАПИСАН КОД.
        //ЗА ФИГУРНЫЕ СКОБКИ НЕ ВЫХОДИТЬ!!!
        int width = 400;    //Переменная для ширины окна
        int height = 300;   //Переменная для высота окна

        JFrame frame = new JFrame();            //Главное окно приложения
        frame.setSize(width, height);    //Установка ширины.
        frame.setLocation(500, 200);        //Местоположение окна. Принимает два параметра. Первый - свдиг по горизонтали, второй - сдвиг по вертикали
        frame.setVisible(true);                 //Делаем окошко приложения видимым. По-умолчанию оно невидимо и если не написать эту команду, то мы ничего не увидим

    }
}
