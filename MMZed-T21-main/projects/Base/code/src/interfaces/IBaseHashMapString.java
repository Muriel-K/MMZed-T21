package code.src.interfaces;

import java.util.HashMap;

public interface IBaseHashMapString {
    static final HashMap baseHash = new HashMap();

    String getValue(String key);
    String[] getKeys();
    void set(String value);
    void set(String key,String value);
    JSONObject getJSON(IBaseHashMapString);

    Boolean isExists(String key);

}
