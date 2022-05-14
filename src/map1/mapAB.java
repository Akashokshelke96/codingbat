package map1;

import java.util.HashMap;
import java.util.Map;

public class mapAB {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        map1.put("spinach","pepper");
        map1.put("beef","potato");
        map1.put("a","candy");
        map1.put("b","dirt");
        System.out.println(mapAB(map1));

    }
    public static Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab",(map.get("a") + map.get("b")));
        }
        return map;
    }
}
