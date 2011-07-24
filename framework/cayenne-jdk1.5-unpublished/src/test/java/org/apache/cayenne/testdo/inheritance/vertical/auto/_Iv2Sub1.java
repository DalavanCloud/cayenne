package org.apache.cayenne.testdo.inheritance.vertical.auto;

import java.util.List;

import org.apache.cayenne.testdo.inheritance.vertical.Iv2Root;
import org.apache.cayenne.testdo.inheritance.vertical.Iv2Sub2;

/**
 * Class _Iv2Sub1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Iv2Sub1 extends Iv2Root {

    public static final String IV2SUB2S_PROPERTY = "iv2sub2s";

    public static final String ID_PK_COLUMN = "ID";

    public void addToIv2sub2s(Iv2Sub2 obj) {
        addToManyTarget("iv2sub2s", obj, true);
    }
    public void removeFromIv2sub2s(Iv2Sub2 obj) {
        removeToManyTarget("iv2sub2s", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Iv2Sub2> getIv2sub2s() {
        return (List<Iv2Sub2>)readProperty("iv2sub2s");
    }


}
