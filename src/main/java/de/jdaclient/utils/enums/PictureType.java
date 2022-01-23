package de.jdaclient.utils.enums;

public enum PictureType {

    AVATAR(0, "avatars"),
    BANNER(1, "banners");

    private final int id;
    private final String type;

    PictureType(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
