package graphics.start;

import javax.swing.*;

/**
 * public class Main и public static void main(String[] args) должно быть обязательно!
 * Вся программа должна быть написана внутри фигурных скобок public static void main(String[] args)
 */
public class Main {
    public static void main(String[] args) {
        //ЗДЕСЬ ДОЛЖНЕН БЫТЬ НАПИСАН КОД.
        //ЗА ФИГУРНЫЕ СКОБКИ НЕ ВЫХОДИТЬ!!!

        JFrame frame = new JFrame();            //Главное окно приложения
        frame.setSize(400, 300);    //Установка ширины (первая цифра) и высоты (вторая цифра) в пикселях. Ширина = 400, высота = 300
        frame.setLocation(500, 200);        //Местоположение окна. Принимает два параметра. Первый - свдиг по горизонтали, второй - сдвиг по вертикали
        frame.setVisible(true);                 //Делаем окошко приложения видимым. По-умолчанию оно невидимо и если не написать эту команду, то мы ничего не увидим

    }
}
