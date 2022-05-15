package map1;

import java.util.HashMap;
import java.util.Map;

public class topping3 {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        map1.put("spinach","pepper");
        map1.put("beef","potato");
        map1.put("a","candy");
        map1.put("b","dirt");
        map1.put("potato","love");

        System.out.println(topping3(map1));
    }
    public static Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("potato")){
            map.put("fries",map.get("potato"));
        }
        if(map.containsKey("salad")){
            map.put("spinach",map.get("salad"));
        }
        return map;
    }
}
