package learn.java.algorithms.dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Dijkstra {
    private int[][] ways = {
            {0, 3, 1, 3, 0, 0},
            {3, 0, 4, 0, 0, 0},
            {1, 4, 0, 0, 7, 5},
            {3, 0, 0, 0, 0, 2},
            {0, 0, 7, 0, 0, 4},
            {0, 0, 5, 2, 4, 0}
    };
    int[] shortest = new int[ways.length];  //Массив кратчайших путей
    HashSet<Integer> viewed = new HashSet<>();


    public Dijkstra() {
        Arrays.fill(shortest, Integer.MAX_VALUE);   //Заполнение массива максимальными значениями
        shortest[0] = 0;
        viewed.add(0);
    }

    public void find(){
        int vertex = 0;
        while (vertex != -1){
            ArrayList<Integer> connectedWays = getLink(vertex, ways);
            for (Integer way : connectedWays) {
                //Если вершина ещё не просмотрена
                if (!viewed.contains(way)){
                    int weight = shortest[vertex] + ways[vertex][way];
                    if (weight < shortest[way]) shortest[way] = weight;
                }
            }
            vertex = getMinWay(shortest, viewed);
            if (vertex > 0) viewed.add(vertex);
        }

        System.out.println(Arrays.toString(shortest));
    }

    /**Поиск путей к вершинам от указанной вершины
     * @return список ВЕРШИН, к которым идут пути
     * */
    public ArrayList<Integer> getLink(int vertex, int[][] matrix){
        ArrayList<Integer> result = new ArrayList<>();
        int[] row = matrix[vertex];
        for (int i = 0; i < row.length; i++) {
            if (row[i] > 0) result.add(i);
        }
        return result;
    }

    public int getMinWay(int[] shortest, HashSet<Integer> viewed){
        int indexmin = -1;
        int min = getMax(shortest);
        for (int i = 0; i < shortest.length; i++) {
            if (shortest[i] < min && !viewed.contains(i)){
                min = shortest[i];
                indexmin = i;
            }
        }
        return indexmin;
    }

    private int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }
}
