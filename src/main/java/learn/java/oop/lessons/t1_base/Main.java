package learn.java.oop.lessons.t1_base;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
// ============================ САМЫЙ ПРОСТОЙ И ДОЛГИЙ ВАРИАНТ ================================================
//        VolleyballPlayer player1 = new VolleyballPlayer();  //Создали объект (экземпляр) класса VolleyballPlayer
//        player1.name = "Иван";
//        player1.surname = "Иванов";
//        player1.age = 13;
//        player1.position = "Либеро";
//
//        VolleyballPlayer player2 = new VolleyballPlayer();  //Создали объект (экземпляр) класса VolleyballPlayer
//        player2.name = "Пётр";
//        player2.surname = "Петров";
//        player2.age = 14;
//        player2.position = "Диагональный";
//
//        System.out.println(player1);
//        if (player1.age > player2.age){
//            System.out.println(player1.name + " старше");
//        } else {
//            System.out.println(player2.name + " старше");
//        }

//========================== ПРИ ИСПОЛЬЗОВАНИИ КОНСТРУКТОРА =============================================
//        VolleyballPlayer player1 = new VolleyballPlayer("Иван", "Иванов", 13, "Либеро");  //Вызов конструктора
//        VolleyballPlayer player2 = new VolleyballPlayer("Пётр", "Петров", 14, "Диагональный");  //Создали объект (экземпляр) класса VolleyballPlayer
//
//        if (player1.age > player2.age){
//            System.out.println(player1.name + " старше");
//        } else {
//            System.out.println(player2.name + " старше");
//        }

//========================== Вывод информации об игроках =============================================
//        VolleyballPlayer player1 = new VolleyballPlayer("Иван", "Иванов", 13, "Либеро");
//        VolleyballPlayer player2 = new VolleyballPlayer("Пётр", "Петров", 14, "Диагональный");
////        System.out.println(player1.surname + " " + player1.name + " " + player1.age + " " + player1.position);
////        System.out.println(player2.surname + " " + player2.name + " " + player2.age + " " + player2.position);
//        player1.printInfo();
//        player2.printInfo();

//====================================== Набор из объектов =============================================
        ArrayList<VolleyballPlayer> listPlayers = new ArrayList<>();
        listPlayers.add(new VolleyballPlayer("Семён", "Семёнов", 13, "Центральный блокирующий"));
        listPlayers.add(new VolleyballPlayer("Никита", "Соловьёв", 13, "Доигровщик"));

        for (int i = 0; i < listPlayers.size(); i++) {
            listPlayers.get(i).printInfo();
        }

    }
}
