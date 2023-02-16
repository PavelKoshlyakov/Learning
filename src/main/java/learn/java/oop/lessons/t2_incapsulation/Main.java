package learn.java.oop.lessons.t2_incapsulation;

public class Main {
    public static void main(String[] args) {
//========================================= ДО ИНКАПСУЛЯЦИИ ======================================================
//    HumanSimple humanSimple = new HumanSimple("Василий", "Иванов", 23);
//    humanSimple.printInfo();
//    humanSimple.age = -5;           //Можно установить некорректное значение!!!
//    humanSimple.printInfo();

    ///15 выстрелов
//    for (int i = 0; i < 15; i++){
//        humanSimple.shoot();
//        humanSimple.numberPatrons++;
//    }


//========================================= С ИНКАПСУЛЯЦИЕЙ ======================================================
        Human human = new Human("ИВАН", "ИвАнОв", 26);
        human.printInfo();

        System.out.println();
        System.out.println("======= ПРИМЕНИЛИ СЕТТЕР ИМЕНИ =======");
        System.out.println();

        human.setName("иВаН");
        human.printInfo();
//        human.age = -5;           //Так больше не сделать
        human.setAge(-15);          //Не установит это значение, из-за прописанной логики в методе setAge()
        human.printInfo();

        for (int i = 0; i < 18; i++) {
            human.shoot();
        }

        human.reload();

        for (int i = 0; i < 16; i++) {
            human.shoot();
        }
    }
}
