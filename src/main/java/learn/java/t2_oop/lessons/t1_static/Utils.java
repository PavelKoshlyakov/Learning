package learn.java.t2_oop.lessons.t1_static;

import java.util.ArrayList;

public class Utils {
    /**Количество раз, сколько происходило обращений к классу Utils*/
    static int countCall = 0;


    /**Метод получения индекса максимального элемента списка.
     * @param list список целых чисел
     * @return индекс максимального элемента. Если их несколько, то будет возвращен индекс элемента, который был встречен раньше.*/
    public static int getIndexMax(ArrayList<Integer> list){
        countCall++;
        if (list.size() == 0) return -1;
        int max = list.get(0);
        int indexMax = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
                indexMax = i;
            }
        }
        return indexMax;
    }
}
