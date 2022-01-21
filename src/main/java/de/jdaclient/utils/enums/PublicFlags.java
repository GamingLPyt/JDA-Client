package de.jdaclient.utils.enums;

public enum PublicFlags {

    NONE(0),
    STAFF(1),
    PARTNER(2),
    HYPESQUAD(4),
    BUG_HUNTER_LEVEL_1(8),
    HYPESQUAD_ONLINE_HOUSE_1(64),
    HYPESQUAD_ONLINE_HOUSE_2(128),
    HYPESQUAD_ONLINE_HOUSE_3(256),
    PREMIUM_EARLY_SUPPORTER(512),
    TEAM_PSEUDO_USER(1024),
    BUG_HUNTER_LEVEL_2(16384),
    VERIFIED_BOT(65536),
    VERIFIED_DEVELOPER(1310872),
    CERTIFIED_MODERATOR(262144),
    BOT_HTTP_INTERACTIONS(524288);


    private final int id;

    PublicFlags(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static PublicFlags getFlagById(int id) {
        for (PublicFlags flag : values()) if (flag.getId() == id) return flag;
        return null;
    }
}
