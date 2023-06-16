import java.util.Map;

public class mapBully {

    public Map<String, String> mapsBully(Map<String, String> map) {
        if (!map.containsKey("a")) {
            return map;
        }
        map.put("b",map.get("a"));
        map.put("a","");
        return map;
    }
}


