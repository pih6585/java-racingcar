package game;

import java.util.Collection;
import java.util.Collections;

public class Utils {

    public int stringLength(String value) {
        return value.length();
    }

    public String[] stringToStringArray(String value) {
        return value.split(",");
    }

    public String stringByTrim(String value) {
        return value.trim();
    }

    public int stringToInt(String value) {
        return Integer.parseInt(value);
    }

    public String stringBufferToString(StringBuffer value) {
        return value.toString();
    }

    public int MapInMaxValue(Collection<Integer> collections) {
        return (Collections.max(collections));
    }

    public String stringToSubString(String value,int firstIndex,int lastIndex){
        return value.substring(firstIndex,lastIndex);
    }
}
