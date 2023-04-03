package learn.java.patterns.strategy.builder;

import learn.java.patterns.strategy.builder.calculationVariants.FundamentCalculation;
import learn.java.patterns.strategy.builder.calculationVariants.RoofCalculation;

public class Main {
    public static void main(String[] args) {
        /**Stratygy pattern - способ легкого добавления функционала существующему объекту*/
        Builder builder = new Builder("Иван", new FundamentCalculation());
        builder.calculation();

        System.out.println();

        builder.setCalculation(new RoofCalculation());
        builder.calculation();
    }
}
