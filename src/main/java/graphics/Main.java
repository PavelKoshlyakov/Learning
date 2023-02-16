package graphics;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(1024, 768);
        window.setLocation(100, 0);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel myPanel = new MyPanel();
        window.add(myPanel);

        //Управление кнопками
        //addKeyListener применяется для того, чтобы "ловить" нажатия на кнопку на клавиатуре. При каждом нажатии будет срабатывать код,
        //который написан в keyPressed
        window.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {}

            //Этот код вызывается при каждом нажатии на клавишу
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                //keyEvent.getKeyCode() - номер(код) кнопки
                //KeyEvent.VK_RIGHT - кнопка вправо
                //KeyEvent.VK_LEFT - кнопка влево


                //Нажатие на кнопку "Вправо"
                if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT){
                    myPanel.moveRight();    //Функция, которая написана в классе MyPanel
                }

                //Нажатие на кнопку "Влево"
                if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT){
                    myPanel.moveLeft();    //Функция, которая написана в классе MyPanel
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {}
        });
    }
}
