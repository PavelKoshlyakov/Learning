package learn.java.patterns.strategy.builder.calculationVariants;

public class RoofCalculation implements Calculation{
    @Override
    public void calculation() {
        System.out.println("Считаем площадь крыши");
        System.out.println("Выбираем страпильную систему");
        System.out.println("Выбираем кровельный материал");
        System.out.println("Делаем расчёт стоимости");
        System.out.println("Строим крышу");
    }
}
