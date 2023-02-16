package learn.java.oop.lessons.equals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        testEquals();
//        testCollectionEquals();
        testCollectionHashCode();
    }

    public static void printHashCode(Address... addresses){
        for (Address address : addresses) {
            System.out.println(address.hashCode());
        }
    }
    public static void testEquals() {
        Address address1 = new Address("Молодёжная", 13, 44);
        Address address2 = new Address("Молодёжная", 13, 44);
        Address address3 = address1;

        printHashCode(address1, address2, address3);

        System.out.println("============ Сравнение по ссылкам ============");
        System.out.println(address1 == address2);
        System.out.println(address1 == address3);

        System.out.println("============ Сравнение объектов ============");
        System.out.println(address1.equals(address2));
        System.out.println(address1.equals(address1));
        System.out.println(address2.equals(address2));
    }

    public static void testCollectionEquals() {
        Address address1 = new Address("Молодёжная", 13, 44);
        Address address2 = new Address("Молодёжная", 13, 44);

        ArrayList<Address> district = new ArrayList<>(List.of(address1));

        System.out.println(district.contains(address2));
        System.out.println(district.indexOf(address2));
    }

    public static void testCollectionHashCode() {
        Address address1 = new Address("Молодёжная", 13, 44);
        Address address2 = new Address("Молодёжная", 13, 44);
        HashSet<Address> set = new HashSet<>();

        set.add(address1);
        set.add(address2);
        System.out.println(set.size());

        System.out.println(set);
    }

}
