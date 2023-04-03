package learn.java.patterns.fabric.entity;

/**Кондитерское изделие*/
public abstract class Pastry {
    /**Вес изделия*/
    protected double weight;
    /**Количество хранимых дней*/
    private int daysToSave;
    /**Изначальный вес*/
    protected double maxWeight;

    public Pastry(double weight, int daysToSave) {
        this.weight = weight;
        this.daysToSave = daysToSave;
        this.maxWeight = weight;
    }

    public double getWeight() { return weight; }
    public int getDaysToSave() { return daysToSave; }

    public void doLessDays(){
        if (daysToSave > 0) daysToSave--;
    }

    public void biteOff(){
        if (weight > 0) weight -= maxWeight * (1/4.);
        else weight = 0;
    }

    @Override
    public String toString() {
        return "weight=" + weight +
                ", daysToSave=" + daysToSave;
    }
}
