package de.jdaclient.utils.enums;

import de.jdaclient.exceptions.InvalidTokenException;
import de.jdaclient.exceptions.UnknownUserException;

public enum DiscordCode {

    OK("Okay", 200, null),
    UNAUTHORIZED("401: Unauthorized", 0, InvalidTokenException.class),
    UNKNOWN_USER("Unknown User", 10013, UnknownUserException.class);

    private String message;
    private int code;
    private Class<? extends Exception> exception;

    DiscordCode(String message, int code, Class<? extends Exception> exception) {
        this.message = message;
        this.code = code;
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public Exception getException() {
        if (this.exception == InvalidTokenException.class) {
            return new InvalidTokenException(String.format("The specified user token is not valid | Discord >> message: %s <|> code: %s", message, code));
        } else if (this.exception == UnknownUserException.class) {
            return new UnknownUserException(String.format("The specified user token is not valid | Discord >> message: %s <|> code: %s", message, code));
        }

        return null;
    }

    public static DiscordCode getFromCode(int code) {
        for (DiscordCode discordCode : values()) {
            if (discordCode.getCode() == code) return discordCode;
        }

        return null;
    }
}
