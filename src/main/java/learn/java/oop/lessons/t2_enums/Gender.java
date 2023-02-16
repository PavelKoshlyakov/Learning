package learn.java.oop.lessons.t2_enums;

public enum Gender {
    MALE("Мужской"),
    FEMALE("Женский");

    private String title;
    Gender(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
