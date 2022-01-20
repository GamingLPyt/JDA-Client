package de.jdaclient.utils.enums;

public enum DiscordCode {

    OK("Okay", 200),
    UNAUTHORIZED("401: Unauthorized", 0),
    UNKNOWN_USER("Unknown User", 10013);

    private String message;
    private int code;

    DiscordCode(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public static DiscordCode getFromCode(int code) {
        for(DiscordCode discordCode : values()) {
            if(discordCode.getCode() == code) return discordCode;
        }

        return  null;
    }
}
