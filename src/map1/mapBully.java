package map1;

import java.util.HashMap;
import java.util.Map;

public class mapBully {
    public static void main(String[] args) {
        //Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
        // and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing
        // it with the empty string.
        Map map1 = new HashMap();
        map1.put("spinach","pepper");
        map1.put("beef","potato");
        map1.put("a","candy");
        map1.put("b","dirt");
        System.out.println(mapBully(map1));

    }
    public  static  Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
