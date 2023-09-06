package learn.java.t2_oop.lessons.t6_Generics;

/**Разработчик*/
public class Devs extends Worker{

    /**Язык программирования*/
    private String language;

    /**Конструктор с зарплатой по умолчанию*/
    public Devs(String name, String language) {
        super(name, 70000);
        this.language = language;
    }

    public Devs(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
}
