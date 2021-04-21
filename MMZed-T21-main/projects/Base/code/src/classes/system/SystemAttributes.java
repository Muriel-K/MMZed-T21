package code.src.classes.system;

import code.src.interfaces.IAttributes;
import code.src.interfaces.IBaseHashMapString;

import java.util.HashMap;

public class SystemAttributes implements IAttributes
{
    Boolean isExists(String key)
    {

    }

    String[] get(String key)
    {

    }
    String getKeys();
    void set(String value);
    void set(String key,String value);
    JSONObject getJSON(IBaseHashMapString);

    SystemAttributes()
    {

    }

}
