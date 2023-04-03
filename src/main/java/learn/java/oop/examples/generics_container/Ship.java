package learn.java.oop.examples.generics_container;

import learn.java.oop.examples.generics_container.items.Item;

import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ship {
    private final int maxCountContainer;
    private HashMap<Integer, Container<? extends Item>> containers;


    public Ship(int maxCountContainer) {
        this.maxCountContainer = maxCountContainer;
        containers = new HashMap<>();
    }

    public void uploadContainer(Container<? extends Item> container){
        if (containers.size() == maxCountContainer) return;
        containers.put(container.getNumberContainer(), container);
    }

    public ArrayList<Container> getListContainers(){
        ArrayList<Container> containers = new ArrayList<>();
        containers.addAll(this.containers.values());
        return containers;
    }

    public Container getContainerByNumber(int number){
        return containers.get(number);
    }

    /**Возвращает контейнер с наибольшим объектом*/
    public Container getContainerItemBiggest(){
        ArrayList<Container> containersList = getListContainers();
        if (containersList.isEmpty()) return null;

        Container biggestContainer = containersList.get(0);
        for (Container container : containersList) {
            if (container.getSquareItem() > biggestContainer.getSquareItem()){
                biggestContainer = container;
            }
        }
        return biggestContainer;
    }

}
