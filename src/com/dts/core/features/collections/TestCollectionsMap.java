package com.dts.core.features.collections;

import java.util.HashMap;

public class TestCollectionsMap {

    public static void main(String[] as) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "sanjeeva");
        map.put(10, "test");
        map.put(11, "test");
        System.out.println(map);
    }
}
