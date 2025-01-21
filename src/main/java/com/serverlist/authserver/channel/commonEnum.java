package com.serverlist.authserver.channel;

public enum commonEnum {
    master("master"),
    slave("slave");

    private final String value;

    commonEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
