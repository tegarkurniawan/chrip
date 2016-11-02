package com.chrip.tegar.chrip;

/**
 * Created by tegar on 01/11/16.
 */

public class ChirpMessage {
    public enum Type {
        RECEIVED, SENT
    }

    private Type type;
    private String message;
    private String identifier;

    public ChirpMessage(Type type, String message, String identifier) {
        this.type = type;
        this.message = message;
        this.identifier = identifier;
    }

    public String getMessage() {
        return message;
    }

    public Type getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }
}
