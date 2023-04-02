import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        String l = console.next();// нужно ввести полный путь к файлу
        File fl = new File(l);
        Scanner F = new Scanner(fl);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        //переводим содержимое файла в список
        while (F.hasNextInt()) { nums.add(F.nextInt());
        }
        F.close();
        //сортировка списка нужна для поиска кратчайшего пути
        Collections.sort(nums);
        //вычисление количесва итераций для приведения всех элеменов к единому числу
        int median = nums.size()/2;
        int delta = 0;
        for (int i=0; i<nums.size(); i++){
           delta += Math.abs(nums.get(i)-nums.get(median));
        }
        System.out.println(delta);
    }
}