package Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // to create a map, we need the initiate it with the type of map first, inside <> give the type of the key and value
        HashMap<String,String> myMap = new HashMap<>();

        // to add values to a map we need to call the method put
        myMap.put("Jim", "UK number");
        myMap.put("Frederica", "Mexican number");
        myMap.put("Olun", "Nigerian number");
        myMap.put("Merlene", "French number");
        myMap.put("Zineb", "Moroccan number");

        // to retrieve a value we use the get method, it is case-sensitive
        System.out.println(myMap.get("Jim"));

        // to print all the key OR all the values
        for(String i: myMap.keySet()) {
            System.out.println(i);
        }

        for(String i: myMap.values()) {
            System.out.println(i);
        }

        // to get all the keys and values
        for(String name: myMap.keySet()) {
            String key = name;
            String value = myMap.get(name);
            System.out.println(key +": "+value);
        }

        // ------OR-----
        for(Map.Entry<String,String> i: myMap.entrySet()) {
            System.out.println(i);
            // System.out.println(i.getKey() +" "+ i.getValue()); // works as well
        }
    }
}
