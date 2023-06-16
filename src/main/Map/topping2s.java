import java.util.Map;

public class topping2s {

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("spinach")){
            map.put("spinach","nuts");
        }
        if (map.containsKey("ice cream")){
            map.put("yogurt",map.get("ice cream"));
        }
        return map;
    }

}
