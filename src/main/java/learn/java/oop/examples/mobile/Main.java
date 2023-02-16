package learn.java.oop.examples.mobile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Color color = Color.BLACK;
//        System.out.println(color);
//
//        String str = color.toString();
//        System.out.println(str);

        ArrayList<MobilePhone> mobilePhones = new ArrayList<>(List.of(
                new MobilePhone("+7-915-988-88-00", "МТС", Color.BLACK),
                new MobilePhone("+7-915-988-96-77", "Билайн", Color.RED)
        ));
        ArrayList<LandlineTelephone> landlineTelephones= new ArrayList<>();
        LandlineTelephone landlineTelephone = new LandlineTelephone("21-18-20");
        landlineTelephone.setWired(false);
        landlineTelephones.add(landlineTelephone);

        landlineTelephone = new LandlineTelephone("00-84-69");
        landlineTelephone.setWired(true);
        landlineTelephones.add(landlineTelephone);

        //Приведение типов дочерних объектов к родительским
//        MobilePhone mp = new MobilePhone("8-900-564-00-00", "Мегафон", Color.BLACK);
//        Telephone telephone = mp;
//        System.out.println(telephone.getNumber());

//        telephone.setNumber("8-900-564-00-01");
//        MobilePhone newPhone = (MobilePhone) telephone;
//        System.out.println(newPhone.getNumber());
//        System.out.println(newPhone.getMobileOperator());


        //Вывод телефонных номеров списков
//        for (MobilePhone mobilePhone : mobilePhones){
//            System.out.println(mobilePhone.getNumber());
//        }
//        for (LandlineTelephone tel: landlineTelephones){
//            System.out.println(tel.getNumber());
//        }

//        ArrayList<Telephone> telephoneList = new ArrayList<>();
//        telephoneList.addAll(mobilePhones);
//        telephoneList.addAll(landlineTelephones);
//        for(Telephone tel: telephoneList){
//            System.out.println(tel.getNumber());
//        }

        //Начался новый год. Нужно увеличить возраст каждого телефона.
//        ArrayList<Telephone> telephones = new ArrayList<>();
//        telephones.addAll(mobilePhones);
//        telephones.addAll(landlineTelephones);
//        for (int i = 0; i < telephones.size(); i++) {
//            telephones.get(i).aging();
//        }
//        for (Telephone tp: telephones){
//            System.out.println(tp.getNumber() + " " + tp.getAge());
//        }


        //Получить список мобильных телефонов из списка телефонов
        ArrayList<Telephone> telephones = new ArrayList<>(List.of(
                new MobilePhone("+7-915-988-88-00", "МТС", Color.BLACK),
                new MobilePhone("+7-915-988-96-77", "Билайн", Color.RED),
                new LandlineTelephone("21-18-20"),
                new LandlineTelephone("00-84-69")
        ));

        ArrayList<MobilePhone> result = new ArrayList<>();
        for (Telephone tp : telephones){
            if (tp instanceof MobilePhone){
                result.add((MobilePhone) tp);
            }
        }

        for (MobilePhone mobile : result){
            System.out.println(mobile.getNumber() + " " + mobile.getMobileOperator() + " " + mobile.getColor());
        }
    }
}
