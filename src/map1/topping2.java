package map1;

import java.util.HashMap;
import java.util.Map;

public class topping2 {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        map1.put("spinach","pepper");
        map1.put("beef","potato");
        map1.put("a","candy");
        map1.put("b","dirt");
        System.out.println(topping2(map1));

    }
    public static Map<String, String> topping2(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("yogurt",map.get("ice cream"));
        }
        if(map.containsKey("spinach")){
            map.put("spinach","nuts");
        }
        return map;
    }
}
