package learn.java.patterns.fabric;

import learn.java.patterns.fabric.entity.Cake;
import learn.java.patterns.fabric.entity.Candie;
import learn.java.patterns.fabric.entity.Pastry;
import learn.java.patterns.fabric.entity.Sweet;

/**Кондитерская*/
public class Confectionery {
    public Pastry orderPastry(PastryType pastryType){
        Pastry pastry = null;
        switch (pastryType){
            case CAKE -> pastry = new Cake();
            case SWEET -> pastry = new Sweet();
            case CANDIE -> pastry = new Candie();
        }

        return pastry;
    }
}
