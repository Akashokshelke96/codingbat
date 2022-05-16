package map1;

import java.util.HashMap;
import java.util.Map;

public class mapAB4 {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        map1.put("a","hhh");
        map1.put("b","tttt");
        map1.put("c","candy");
        System.out.println(mapAB4(map1));

    }
    public static Map<String, String> mapAB4(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            int alen = map.get("a").length();
            int blen = map.get("b").length();
            if(alen > blen){
                map.put("c", map.get("a"));
            }else if(blen > alen){
                map.put("c", map.get("b"));
            }else{
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

}
