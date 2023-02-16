package learn.java.oop.lessons.t2_enums;

public class Human {
    String name;
    String surname;
    /**Половая принадлежность человека (Мальчик/Девочка)*/
    String sex;

    public Human(String name, String surname, Gender sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex.toString();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
