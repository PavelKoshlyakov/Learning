package learn.java.oop.examples.dealers;

import java.util.ArrayList;

public class Dealers {
    private String name;
    private String addres;
    private ArrayList<Car> cars = new ArrayList<>();              // Список автомобилей в салоне
    private ArrayList<Client> clients = new ArrayList<>();        // Список клиентов автосалона

    public Dealers(String name, String address) {
        this.name = name;
        this.addres = address;
    }

    /**Метод добавления машин в список автосалона (машины находяшиеся у дилера)*/
    public void addCar(Car car) {
        cars.add(car);
    }

    /**Метод добавления клиентов в список автосалона*/
    public void addClient(Client client) {
        clients.add(client);
    }

    /**Метод получения списка машин в автосалоне*/
    public ArrayList<Car> getCars() {
        return cars;
    }

    /**Метод продажи автомобиля */
    public void salesCar(String brand, String model, Client client) {
        ArrayList<Car> necessaryBrand = new ArrayList<>();
        Car necessaryCar = null;

        //Проверка наличия марки (формирование списка машин необходимой марки)
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getBrand().equalsIgnoreCase(brand)) {
               necessaryBrand.add(cars.get(i));
            }
        }
        if (necessaryBrand.isEmpty()) {
            System.out.println("Данного бренда нет в продаже");
            return;
        }


        for (int i = 0; i < necessaryBrand.size();i++) {
            if (necessaryBrand.get(i).getModel().equalsIgnoreCase(model)) {
                necessaryCar = necessaryBrand.get(i);
                break;
            }
        }
        if (necessaryCar == null){
            System.out.println("Данной марки нет в продаже");
            return;
        }

        if (client.getBalance() < necessaryCar.getCost()){
            System.out.println("На Вашем счёте недостаточно средств");
            return;
        }

        boolean isClient = false;
        for (int i = 0; i < clients.size(); i++){
            if (clients.get(i).getLastName().equalsIgnoreCase(client.getLastName())){
                isClient = true;
                break;
            }
        }
        if (!isClient) {
            clients.add(client);
        }
        cars.remove(necessaryCar);
        System.out.println("Продажа совершена!");
        System.out.println();
    }

    public void printAllCars(){
        for (int i = 0; i < cars.size(); i++){
            cars.get(i).printInfoCar();
            System.out.println();
        }
    }
}