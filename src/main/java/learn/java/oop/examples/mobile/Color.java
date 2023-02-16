package learn.java.oop.examples.mobile;

public enum Color {
    RED     ("Красный"),
    WHITE   ("Белый"),
    PINK    ("Розовы"),
    GRAY    ("Серый"),
    GOLD    ("Золотой"),
    BLACK   ("Чёрный");

    private String title;
    Color(String title){
        this.title = title;
    }

    //Превращает объект в строку. При передаче объекта в print или println вызывается автоматически
    @Override
    public String toString() {
        return title;
    }
}
