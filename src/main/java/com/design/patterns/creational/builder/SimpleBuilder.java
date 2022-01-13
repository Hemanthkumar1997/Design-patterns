package com.design.patterns.creational.builder;

import java.util.Map;

public class SimpleBuilder {
    private int val;
    private String name;
    private Map<Integer, String> map;

    public SimpleBuilder() {}

    public SimpleBuilder(int val, String name, Map<Integer, String> map){
        this.val = val;
        this.name = name;
        this.map = map;
    }

    public SimpleBuilder val(int val){
        this.val = val;
        return this;
    }

    public SimpleBuilder name(String name){
        this.name = name;
        return this;
    }

    public SimpleBuilder map(Map<Integer, String> map){
        this.map = map;
        return this;
    }

    public int getVal() {
        return val;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, String> getMap() {
        return map;
    }
}
