package code.src.classes;

import code.src.interfaces.IBaseHashMapString;

public class BaseHashMapKeys implements IBaseHashMapString {
    //public HashMap baseKeys = new HashMap();

    BaseHashMapKeys() {
        IBaseHashMapString.baseKeys.put("__SYSTEM__", "value");

    }

}
