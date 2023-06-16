import java.util.Map;
import java.util.Objects;

public class mapAB2s {
    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a")&&map.containsKey("b")&& Objects.equals(map.get("a"), map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

}
