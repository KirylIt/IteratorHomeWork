import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //С помощью iterator просмотрите коллекцию из чисел,
        // выведите чётные числа на экрана,а нечётные - удалите из коллекции.
        Integer [] nums = {10,25,45,38,36,24,88,77};
        ArrayList <Integer> numList = new ArrayList<>(Arrays.asList(nums));
        Iterator <Integer> numListIter = numList.iterator();
        while (numListIter.hasNext()){
            int a = numListIter.next();
            if (a%2!=0){
                numListIter.remove();
            }
        }
        System.out.println(numList);
    }
}