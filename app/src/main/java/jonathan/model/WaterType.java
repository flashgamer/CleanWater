package jonathan.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jonathan on 12/5/2016.
 */

public enum WaterType {
    BOTTLED("Bottled"),
    WELL("Well"),
    STREAM("Stream"),
    LAKE("Lake"),
    SPRING("Spring"),
    OTHER("Other");

    private String myType;
    private WaterType(String type) {
        myType = type;
    }

    public String getMyType() {
        return myType;
    }

    private static final Map<String, WaterType> map;

    static{
        map = new HashMap<String, WaterType>();
        for(WaterType w: WaterType.values()) {
            map.put(w.getMyType(), w);
        }
    }
    @Override
    public String toString() {
        return myType;
    }
    public static WaterType findByKey(String s) {
        return map.get(s);
    }
}
