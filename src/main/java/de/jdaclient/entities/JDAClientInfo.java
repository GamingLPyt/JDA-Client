package de.jdaclient.entities;

import de.jdaclient.JDAClient;
import de.jdaclient.utils.enums.DiscordCode;

import java.awt.*;
import java.time.OffsetDateTime;

public class JDAClientInfo implements JDAClient {

    private Long id;
    private String username;
    private String avatar;
    private String discriminator;
    private OffsetDateTime creationTime;
    private int publicFlags;
    private String banner;
    private Color bannerColor;
    private Color accentColor;
    private DiscordCode apiCode;

    public JDAClientInfo() {
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getAvatar() {
        return "https://cdn.discordapp.com/avatars/" + getId() + "/" + avatar + ".png";
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    @Override
    public OffsetDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public int getPublicFlags() {
        return publicFlags;
    }

    public void setPublicFlags(int publicFlags) {
        this.publicFlags = publicFlags;
    }

    @Override
    public String getBanner() {
        return banner == null ? null : "https://cdn.discordapp.com/banners/" + getId() + "/" + banner + ".png";
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    @Override
    public Color getBannerColor() {
        return bannerColor;
    }

    public void setBannerColor(Color bannerColor) {
        this.bannerColor = bannerColor;
    }

    @Override
    public Color getAccentColor() {
        return accentColor;
    }

    public void setAccentColor(Color accentColor) {
        this.accentColor = accentColor;
    }

    @Override
    public DiscordCode getApiCode() {
        return apiCode;
    }

    public void setApiCode(DiscordCode apiCode) {
        this.apiCode = apiCode;
    }
}
