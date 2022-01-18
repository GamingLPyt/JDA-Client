package de.jdaclient.entities;

import de.jdaclient.JDAClient;

import java.awt.*;

public class JDAClientSelfInfo implements JDAClient {

    private Long id;
    private String username;
    private String avatar;
    private String discriminator;
    private int publicFlags;
    private int flags;
    private int purchasedFlags;
    private int premiumUsageFlags;
    private String banner;
    private Color bannerColor;
    private Color accentColor;
    private String bio;
    private String locale;
    private boolean nsfwAllowed;
    private boolean mfaEnabled;
    private int premiumType;
    private String email;
    private boolean verified;
    private String phone;

    public JDAClientSelfInfo() {}

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

    public int getPublicFlags() {
        return publicFlags;
    }

    public void setPublicFlags(int publicFlags) {
        this.publicFlags = publicFlags;
    }

    @Override
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
}
