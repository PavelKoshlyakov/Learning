package learn.java.oop.examples.mobile;

public class MobilePhone extends Telephone {

    /**Мобильный оператор*/
    private String mobileOperator;
    /**Цвет телефона*/
    private Color color;

    MobilePhone(String number, String mobileOperator, Color color) {
        super(number);
        this.mobileOperator = mobileOperator;
        this.color = color;
    }

    public String getMobileOperator() { return mobileOperator; }
    public void setMobileOperator(String mobileOperator) { this.mobileOperator = mobileOperator; }

    public Color getColor() { return color; }
    public void setColor(Color color) { this.color = color; }
}
