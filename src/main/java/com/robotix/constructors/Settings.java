package com.robotix.constructors;

public class Settings {

    private String ProtocolType;
    private String address;
    private String password;
    private Boolean is_active;

    public Settings(String protocolType) {
        ProtocolType = protocolType;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "ProtocolType='" + ProtocolType + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", is_active=" + is_active +
                '}';
    }
}
