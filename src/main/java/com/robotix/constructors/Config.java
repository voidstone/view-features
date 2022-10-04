package com.robotix.constructors;




public class Config {

    private Settings settings;
    private Source source;
    private String name;

    public Config(Settings settings, Source source, String name) {
        this.settings = settings;
        this.source = source;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Config{" +
                "settings=" + settings +
                ", source=" + source +
                ", name='" + name + '\'' +
                '}';
    }
}
