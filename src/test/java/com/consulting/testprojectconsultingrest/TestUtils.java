package com.consulting.testprojectconsultingrest;

import java.util.LinkedHashMap;
import java.util.Map;

public final class TestUtils {
    private TestUtils() {}

    public static Map<Character, Integer> createMapABCCC() {
        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('c', 3);
        map.put('a', 1);
        map.put('b', 1);

        return map;
    }
}
