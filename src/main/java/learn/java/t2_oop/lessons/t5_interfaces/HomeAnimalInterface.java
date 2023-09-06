package learn.java.t2_oop.lessons.t5_interfaces;

//public interface HomeAnimalInterface extends Walkable{
public interface HomeAnimalInterface{
    int a = 50;                 //Является public static final переменной

    /**Отозваться*/
    void getVoice();
    /**Покушать*/
    void eat();


    default void printInfo(){
        System.out.println(this);
        getVoice();
        eat();
    }
}
