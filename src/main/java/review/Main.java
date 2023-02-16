package review;

public class Main {
    public static void main(String[] args) {
       String string = "    Как       дела?    ";
       string = string.trim();

       int i = 0;
        while (i < string.length()){
            if (string.charAt(i) == ' ' && string.charAt(i + 1) == ' '){
                string = string.substring(0, i) + string.substring(i + 1);
            } else {
                i++;
            }
        }

        System.out.println(string);
    }
}
