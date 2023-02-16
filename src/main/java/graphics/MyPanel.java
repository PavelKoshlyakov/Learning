package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel{
    int x = 0;
    int y = 0;
    int d = 290;
    int startAngle = 30;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillArc(x, y, d, d, startAngle, 300);
        repaint();
    }

    //public и void- обязательно
    //moveRight - просто придуманное название
    //Функция выполняет сдвиг пакмена вправо на один шаг
    public void moveRight(){
        x += 1;
        startAngle = 30;
    }

    //public и void- обязательно
    //moveLeft - просто придуманное название
    //Функция выполняет сдвиг пакмена влево на один шаг
    public void moveLeft(){
        x -= 1;
        startAngle = 210;
    }
}
