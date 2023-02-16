package learn.java.algorithms.dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Simple {
    public static void main(String[] args) {
        int[][] ways = {
                {0, 3, 1, 3, 0, 0},
                {3, 0, 4, 0, 0, 0},
                {1, 4, 0, 0, 7, 5},
                {3, 0, 0, 0, 0, 2},
                {0, 0, 7, 0, 0, 4},
                {0, 0, 5, 2, 4, 0}
        };

        int[] t = new int[ways.length];                 //Кратчайшие пути
        Arrays.fill(t, Integer.MAX_VALUE);              //Заполнение массива максимальными числами

        int v = 0;                                      //Стартовая вершина
        t[v] = 0;                                       //Для стартовой вершины задаём нулевой вес

        HashSet<Integer> viewed = new HashSet<>();      //Просмотренные вершины
        viewed.add(v);
        
        while (v != -1){
            ArrayList<Integer> connectedWays = getLink(v, ways);
            for (Integer way : connectedWays) {
                //Если вершина ещё не просмотрена
                if (!viewed.contains(way)){
                    int weight = t[v] + ways[v][way];
                    if (weight < t[way]) t[way] = weight;
                }
            }
            v = getMinWay(t, viewed);
            if (v > 0) viewed.add(v);
        }
        System.out.println(Arrays.toString(t));
    }

    /**Поиск путей к вершинам от указанной
     * @param v вершина, от которой происходит поиск путей
     * @param matrix матрица смежности
     * @return список вершин, к которым идут пути*/
    public static ArrayList<Integer> getLink(int v, int[][] matrix){
        ArrayList<Integer> result = new ArrayList<>();
        int[] row = matrix[v];
        for (int i = 0; i < row.length; i++) {
            if (row[i] > 0) result.add(i);
        }
        return result;
    }

    public static int getMinWay(int[] t, HashSet<Integer> set){
        int indexMin = -1;                          //Номер вершины с минимальным значением
        int min = getMax(t);
        for (int i = 0; i < t.length; i++) {
            if (t[i] < min && !set.contains(i)){
                min = t[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
