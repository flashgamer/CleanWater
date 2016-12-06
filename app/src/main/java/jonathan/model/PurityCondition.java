package jonathan.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jonathan on 12/5/2016.
 */

public enum PurityCondition {
    SAFE("Safe"),
    TREATABLE("Treatable"),
    UNSAFE("Unsafe");

    private String myType;
    private PurityCondition(String type) {
        myType = type;
    }

    public String getMyType() {
        return myType;
    }

    private static final Map<String, PurityCondition> map;

    static{
        map = new HashMap<String, PurityCondition>();
        for(PurityCondition w: PurityCondition.values()) {
            map.put(w.getMyType(), w);
        }
    }

    public static PurityCondition findByKey(String s) {
        return map.get(s);
    }
}
