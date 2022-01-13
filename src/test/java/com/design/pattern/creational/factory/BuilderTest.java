package com.design.pattern.creational.factory;

import com.design.patterns.creational.builder.SimpleBuilder;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class BuilderTest {

    @Test
    public void builderPatternTest() {
        SimpleBuilder simpleBuilder = new SimpleBuilder()
                .val(1)
                .map(new HashMap<>())
                .name("junitTest");
        assertNotNull(simpleBuilder.getName());
        assertNotNull(simpleBuilder.getMap());
        assertNotEquals(0, simpleBuilder.getVal());
    }
}
