package com.design.pattern.creational.factory;

import com.design.patterns.creational.factory.MapFactory;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class MapFactoryTest {
    MapFactory<String, Object> factoryMap = new MapFactory<>();

    @Test
    public void MapFactoryNullTest(){
        Map<String, Object> retrievedMap = factoryMap.getFromMapFactory(null);
        assertNull(retrievedMap);
    }

    @Test
    public void MapFactoryHashMapTest(){
        Map<String, Object> retrievedMap = factoryMap.getFromMapFactory(HashMap.class);
        assertTrue(retrievedMap instanceof HashMap);
    }

    @Test
    public void MapFactoryTreeMapTest(){
        Map<String, Object> retrievedMap = factoryMap.getFromMapFactory(TreeMap.class);
        assertTrue(retrievedMap instanceof TreeMap);
    }

}
