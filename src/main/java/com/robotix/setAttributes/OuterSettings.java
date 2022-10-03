package com.robotix.setAttributes;

public class OuterSettings implements Settings {

    private String settings;

    public void setSettings(String settings) {
        this.settings = settings;
    }

    @Override
    public String getSettings() {
        return "Возвращаем какие то настройки для дальнейшей работы " + settings;
    }
}
