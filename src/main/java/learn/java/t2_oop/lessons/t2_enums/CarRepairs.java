package learn.java.t2_oop.lessons.t2_enums;

public enum CarRepairs {
    ENGINE, GEARBOX, REPAINT;

    String color;

    CarRepairs(){}

    CarRepairs(String color){
        this.color = color;
    }

}
