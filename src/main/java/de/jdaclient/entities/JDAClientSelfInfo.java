package de.jdaclient.entities;

import de.jdaclient.JDAClient;
import de.jdaclient.utils.PictureUtil;
import de.jdaclient.utils.enums.DiscordCode;
import de.jdaclient.utils.enums.PictureType;
import de.jdaclient.utils.enums.PublicFlags;

import java.time.OffsetDateTime;

public class JDAClientSelfInfo implements JDAClient {

    private Long id;
    private String username;
    private String avatar;
    private String discriminator;
    private OffsetDateTime creationTime;
    private PublicFlags publicFlags;
    private int flags;
    private int purchasedFlags;
    private int premiumUsageFlags;
    private String banner;
    private String bannerColor;
    private int accentColor;
    private String bio;
    private String locale;
    private boolean nsfwAllowed;
    private boolean mfaEnabled;
    private int premiumType;
    private String email;
    private boolean verified;
    private String phone;
    private DiscordCode apiCode;

    public JDAClientSelfInfo() {
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

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public int getPurchasedFlags() {
        return purchasedFlags;
    }

    public void setPurchasedFlags(int purchasedFlags) {
        this.purchasedFlags = purchasedFlags;
    }

    public int getPremiumUsageFlags() {
        return premiumUsageFlags;
    }

    public void setPremiumUsageFlags(int premiumUsageFlags) {
        this.premiumUsageFlags = premiumUsageFlags;
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public boolean isNsfwAllowed() {
        return nsfwAllowed;
    }

    public void setNsfwAllowed(boolean nsfwAllowed) {
        this.nsfwAllowed = nsfwAllowed;
    }

    public boolean isMfaEnabled() {
        return mfaEnabled;
    }

    public void setMfaEnabled(boolean mfaEnabled) {
        this.mfaEnabled = mfaEnabled;
    }

    public int getPremiumType() {
        return premiumType;
    }

    public void setPremiumType(int premiumType) {
        this.premiumType = premiumType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public DiscordCode getApiCode() {
        return apiCode;
    }

    public void setApiCode(DiscordCode apiCode) {
        this.apiCode = apiCode;
    }
}
