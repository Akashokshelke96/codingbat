package map1;

import java.util.HashMap;
import java.util.Map;

public class mapAB2 {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        map1.put("a","hhh");
        map1.put("b","hhh");
        map1.put("c","candy");
        System.out.println(mapAB2(map1));
    }
    public static Map<String, String> mapAB2(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b") ){
            if(map.get("a").equals(map.get("b"))){
                map.remove("b");
                map.remove("a");
            }
            else{
                return map;
            }
        }
        return map;
    }
}
