package map;
import java.util.*;
public class Collections {
    public static void main(String[] args){
        setDemo();
         // listDemo();
        // queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        var i = fruit.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
    public static void mapDemo(){

        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);
    }

}

