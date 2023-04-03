package learn.java.patterns.strategy.builder;

import learn.java.patterns.strategy.builder.calculationVariants.Calculation;

public class Builder {
    private String name;
    private Calculation calculation;

    public Builder(String name, Calculation calculation) {
        this.name = name;
        this.calculation = calculation;
    }

    public String getName() {return name; }

    public void setCalculation(Calculation calculation){
        this.calculation = calculation;
    }
    public void calculation(){
        calculation.calculation();
    }
}
