package com.robotix.setAttributes;

public class JsonConfig implements Config {
    private String url;

    private String state;
    private String method;
    private Settings settings;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public String getSettings() {
        return settings.getSettings();
    }

    public void setState(String state) {
        this.state = state;
    }
}
