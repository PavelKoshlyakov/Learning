package learn.java.oop.examples.mobile;

public class LandlineTelephone extends Telephone{

    /**Проводной ли телефон*/
    private boolean isWired = false;

    LandlineTelephone(String number) {
        super(number);
    }

    public boolean isWired() { return isWired; }

    /**@param wired - true - проводной, false - беспроводной*/
    public void setWired(boolean wired) { isWired = wired; }
}
