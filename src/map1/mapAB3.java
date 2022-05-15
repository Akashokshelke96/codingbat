package map1;

import java.util.HashMap;
import java.util.Map;

public class mapAB3 {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        map1.put("a","hhh");

        map1.put("c","candy");
        System.out.println(mapAB3(map1));
    }
    public static Map<String, String> mapAB3(Map<String, String> map) {
        if(map.containsKey("a") && (!(map.containsKey("b")))){
            map.put("b",map.get("a"));
            return map;
        }else if(map.containsKey("b") && (!(map.containsKey("a")))){
            map.put("a",map.get("b"));
        }
        return map;
    }

}
