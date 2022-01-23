package de.jdaclient.entities;

import de.jdaclient.JDAClient;
import de.jdaclient.utils.PictureUtil;
import de.jdaclient.utils.enums.DiscordCode;
import de.jdaclient.utils.enums.PictureType;
import de.jdaclient.utils.enums.PublicFlags;

import java.time.OffsetDateTime;

public class JDAClientInfo implements JDAClient {

    private Long id;
    private String username;
    private String avatar;
    private String discriminator;
    private OffsetDateTime creationTime;
    private PublicFlags publicFlags;
    private String banner;
    private String bannerColor;
    private int accentColor;
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
        return PictureUtil.getDiscordPicture(getId(), avatar, PictureType.AVATAR);
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
    public PublicFlags getPublicFlags() {
        return publicFlags;
    }

    public void setPublicFlags(PublicFlags publicFlags) {
        this.publicFlags = publicFlags;
    }

    @Override
    public String getBanner() {
        return PictureUtil.getDiscordPicture(getId(), banner, PictureType.BANNER);
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    @Override
    public String getBannerColor() {
        return bannerColor;
    }

    public void setBannerColor(String bannerColor) {
        this.bannerColor = bannerColor;
    }

    @Override
    public int getAccentColor() {
        return accentColor;
    }

    public void setAccentColor(int accentColor) {
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
