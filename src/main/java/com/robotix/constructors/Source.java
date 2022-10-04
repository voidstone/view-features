package com.robotix.constructors;

import java.util.ArrayList;

public class Source {

    private String name;
    private String token;
    private ArrayList<String> listOfFacets;

    public Source(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", token='" + token + '\'' +
                ", listOfFacets=" + listOfFacets +
                '}';
    }
}
