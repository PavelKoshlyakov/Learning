package learn.java.oop.lessons.interfaces;

import java.awt.*;

public interface HomeAnimalInterface {


    /**Отозваться*/
    void getVoice();
    /**Покушать*/
    void eat();

    default void printInfo(){
        System.out.println(this);
        getVoice();
        eat();
    }
}
