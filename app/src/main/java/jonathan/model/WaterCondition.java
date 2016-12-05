package jonathan.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jonathan on 12/5/2016.
 */

public enum WaterCondition {
    WASTE("Waste"),
    TREATABLE_CLEAR("Treatable-Clear"),
    TREATABLE_MUDDY("Treatable-Muddy"),
    POTABLE("Potable");

    private String myCondition;
    private WaterCondition(String condition) {
        myCondition = condition;
    }

    public String getMyCondition() {
        return myCondition;
    }

    private static final Map<String, WaterCondition> map;

    static{
        map = new HashMap<String, WaterCondition>();
        for(WaterCondition w: WaterCondition.values()) {
            map.put(w.getMyCondition(), w);
        }
    }

    public static WaterCondition findByKey(String s) {
        return map.get(s);
    }
}

