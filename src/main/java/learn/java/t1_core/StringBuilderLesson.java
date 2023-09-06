package learn.java.t1_core;

public class StringBuilderLesson {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Какая-то строка для удаления");
        String s = builder.toString();
        if (s.contains("строка")){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
