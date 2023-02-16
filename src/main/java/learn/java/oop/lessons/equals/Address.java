package learn.java.oop.lessons.equals;

import java.util.Objects;

public class Address {
    private String street;
    private int numberBuilding;
    private int numberRoom;

    public Address(String street, int numberBuilding, int numberRoom) {
        this.street = street;
        this.numberBuilding = numberBuilding;
        this.numberRoom = numberRoom;
    }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public int getNumberBuilding() { return numberBuilding; }
    public void setNumberBuilding(int numberBuilding) { this.numberBuilding = numberBuilding; }

    public int getNumberRoom() { return numberRoom; }
    public void setNumberRoom(int numberRoom) { this.numberRoom = numberRoom; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;
        return numberBuilding == address.numberBuilding
                && numberRoom == address.numberRoom
                && Objects.equals(street, address.street);
    }
    @Override
    public int hashCode() {
        return Objects.hash(street, numberBuilding, numberRoom);
    }

//    @Override
//    public int hashCode() {
//        int result = numberBuilding;
//        result = 31 * result + numberRoom;
//        result = 31 * result + (street != null ? street.hashCode() : 0);
//        return result;
//    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", numberBuilding=" + numberBuilding +
                ", numberRoom=" + numberRoom +
                '}';
    }
}
