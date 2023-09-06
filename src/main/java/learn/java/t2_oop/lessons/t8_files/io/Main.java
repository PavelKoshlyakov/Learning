package learn.java.t2_oop.lessons.t8_files.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final String PATH_SCRIPT_FILE = "test.txt";
    public static void main(String[] args) {

//================================ ЗАПИСЬ =======================================
//ДОПИСЫВАНИЕ В ФАЙЛ
//        try(PrintWriter pwAdding = new PrintWriter(new FileWriter("C:\\Users\\Pavel\\IdeaProjects\\Learning\\src\\main\\java\\learn\\java\\t2_oop\\lessons\\t8_files\\io\\test.txt", true));) {
//            pwAdding.println();
//            pwAdding.println("!!!!");
//        } catch (Exception ex){
//            ex.printStackTrace();
//        }

// ПЕРЕЗАПИСЬ ФАЙЛА
//        try(PrintWriter pw = new PrintWriter("C:\\Users\\Pavel\\IdeaProjects\\Learning\\src\\main\\java\\learn\\java\\t2_oop\\lessons\\t8_files\\io\\test.txt")){
////            pw.println("НОВАЯ СТРОКА");     //Перезаписать файл
//            pw.println("НОВАЯ ВТОРАЯ СТРОКА");
//            pw.append("ДОБАВОЧНОЕ ЗНАЧЕНИЕ");
//        } catch (FileNotFoundException exception){
//            exception.printStackTrace();
//        }

//================================ ЧТЕНИЕ =======================================


//        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pavel\\IdeaProjects\\Learning\\src\\main\\java\\learn\\java\\t2_oop\\lessons\\t8_files\\io\\test.txt"))){
////            int c;
////            while ((c = br.read()) != -1){
////                System.out.println((char) c);
////            }
//            String line;
//            while ((line = br.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
