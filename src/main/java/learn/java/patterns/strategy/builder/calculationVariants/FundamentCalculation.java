package learn.java.patterns.strategy.builder.calculationVariants;

public class FundamentCalculation implements Calculation{
    @Override
    public void calculation() {
        System.out.println("Считаем площадь фундамента");
        System.out.println("Строим опалубок");
        System.out.println("Выбираем марку бетона");
        System.out.println("Заказываем бетон");
        System.out.println("Делаем расчёт стоимости");
        System.out.println("Заливаем");
    }
}
