package com.design.patterns.creational.factory;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFactory<K, V> {

    public <T> Map<K, V> getFromMapFactory(Class<T> mapType)  {
        if(mapType == null) return null;
        String mapName = mapType.getSimpleName();
        switch (mapName) {
            case "HashMap" : return new HashMap<>();
            case "LinkedHashMap" : return new LinkedHashMap<>();
            case "TreeMap": return new TreeMap<>();
            default: return null;
        }
    }
}
