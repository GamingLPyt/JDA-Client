package de.jdaclient.entities;

import de.jdaclient.JDAClient;

import java.awt.*;

public class JDAClientInfo implements JDAClient {

    private Long id;
    private String username;
    private String avatar;
    private String discriminator;
    private int flag;
    private String banner;
    private Color bannerColor;
    private Color accentColor;

    public JDAClientInfo() {}

    private JDAClientInfo(Long id, String username, String avatar, String discriminator, int flag, String banner, Color bannerColor, Color accentColor) {
        this.id = id;
        this.username = username;
        this.avatar = avatar;
        this.discriminator = discriminator;
        this.flag = flag;
        this.banner = banner;
        this.bannerColor = bannerColor;
        this.accentColor = accentColor;
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
        return avatar;
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
    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String getBanner() {
        return banner;
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
}
