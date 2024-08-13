package com.dts.core.syntax;

import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] as) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(10, "San");
        hm.put(11, "Tul");
        hm.put(12, "jai");
        hm.put(null, "False");
        hm.put(null, "false");
        System.out.println(hm);
        System.out.println(hm.get(10));
        System.out.println(hm.containsKey(10));
        System.out.println(hm.containsValue("test"));
        System.out.println(hm.isEmpty());
        System.out.println(hm.remove(10));
        System.out.println(hm);

        for (Integer num : hm.keySet()) {
            System.out.println(hm.get(num));
        }
    }

}
