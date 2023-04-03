package learn.java.patterns.strategy.hospital;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Иван", "Иванов");
        System.out.println(human);
        human.setDiseaseStatus(new SickStatus());
        System.out.println(human);
    }
}
