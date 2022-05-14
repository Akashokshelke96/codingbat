package map1;

import java.util.HashMap;
import java.util.Map;

public class mapShare {
    public static void main(String[] args) {
       // Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
        // In all cases remove the key "c", leaving the rest of the map unchanged.
        Map map1 = new HashMap();
        map1.put("spinach","pepper");
        map1.put("beef","potato");
        map1.put("a","candy");
        map1.put("b","dirt");
        System.out.println(mapShare(map1));

    }
    public static Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a")){

            map.put("b",map.get("a"));
        }
        map.remove("c");
        return map;
    }

}

