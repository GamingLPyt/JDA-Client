package de.jdaclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import de.jdaclient.entities.JDAClientInfo;
import de.jdaclient.entities.JDAClientSelfInfo;
import de.jdaclient.exceptions.InvalidTokenException;
import de.jdaclient.exceptions.UnknownUserException;
import de.jdaclient.utils.DiscordUtil;
import de.jdaclient.utils.Request;
import de.jdaclient.utils.enums.DiscordCode;

import java.awt.*;

public class JDAClientBuilder {

    // The UserID of the user you want to get
    protected Long id = null;

    // The API-Version of Discord you want to use
    protected String apiVersion = Request.getApiVersion();

    // Your user token
    protected String token = null;

    // Will be created
    protected JDAClient jdaClient = null;

    public JDAClientBuilder() throws Exception {
    }

    // Building the JDAClient from the JDAClientSelfInfo
    public JDAClient buildSelfUser() throws Exception {
        JDAClientSelfInfo jdaClientInfo = new JDAClientSelfInfo();

        assert apiVersion != null;
        assert token != null;

        JsonObject jsonObject = Request.getJson("https://discord.com/api/v" + this.apiVersion + "/users/@me", this.token);

        // Setting up the JDAClient for the given User
        JsonElement code = jsonObject.get("code");
        JsonElement id = jsonObject.get("id");
        JsonElement username = jsonObject.get("username");
        JsonElement avatar = jsonObject.get("avatar");
        JsonElement discriminator = jsonObject.get("discriminator");
        JsonElement public_flags = jsonObject.get("public_flags");
        JsonElement flags = jsonObject.get("flags");
        JsonElement purchased_flags = jsonObject.get("purchased_flags");
        JsonElement banner = jsonObject.get("banner");
        JsonElement banner_color = jsonObject.get("banner_color");
        JsonElement accent_color = jsonObject.get("accent_color");
        JsonElement bio = jsonObject.get("bio");
        JsonElement locale = jsonObject.get("locale");
        JsonElement nsfw_allowed = jsonObject.get("nsfw_allowed");
        JsonElement mfa_enabled = jsonObject.get("mfa_enabled");
        JsonElement premium_type = jsonObject.get("premium_type");
        JsonElement email = jsonObject.get("email");
        JsonElement verified = jsonObject.get("verified");
        JsonElement phone = jsonObject.get("phone");

        jdaClientInfo.setApiCode(code.isJsonNull() ? DiscordCode.OK : DiscordCode.getFromCode(code.getAsInt()));

        if (jdaClientInfo.getApiCode() == DiscordCode.OK) {
            jdaClientInfo.setId(id.isJsonNull() ? null : id.getAsLong());
            jdaClientInfo.setUsername(username.isJsonNull() ? null : username.getAsString());
            jdaClientInfo.setAvatar(avatar.isJsonNull() ? null : avatar.getAsString());
            jdaClientInfo.setDiscriminator(discriminator.isJsonNull() ? null : discriminator.getAsString());
            jdaClientInfo.setCreationTime(DiscordUtil.getCreationDate(jdaClientInfo.getId()));
            jdaClientInfo.setPublicFlags(public_flags.isJsonNull() ? null : public_flags.getAsInt());
            jdaClientInfo.setFlags(flags.isJsonNull() ? null : flags.getAsInt());
            jdaClientInfo.setPurchasedFlags(purchased_flags.isJsonNull() ? null : purchased_flags.getAsInt());
            jdaClientInfo.setBanner(banner.isJsonNull() ? null : banner.getAsString());
            jdaClientInfo.setBannerColor(banner_color.isJsonNull() ? null : Color.decode(banner_color.getAsString()));
            jdaClientInfo.setAccentColor(accent_color.isJsonNull() ? null : Color.decode(accent_color.getAsString()));
            jdaClientInfo.setBio(bio.isJsonNull() ? null : bio.getAsString());
            jdaClientInfo.setLocale(locale.isJsonNull() ? null : locale.getAsString());
            jdaClientInfo.setNsfwAllowed(nsfw_allowed.isJsonNull() ? null : nsfw_allowed.getAsBoolean());
            jdaClientInfo.setMfaEnabled(mfa_enabled.isJsonNull() ? null : mfa_enabled.getAsBoolean());
            jdaClientInfo.setPremiumType(premium_type.isJsonNull() ? null : premium_type.getAsInt());
            jdaClientInfo.setEmail(email.isJsonNull() ? null : email.getAsString());
            jdaClientInfo.setVerified(verified.isJsonNull() ? null : verified.getAsBoolean());
            jdaClientInfo.setPhone(phone.isJsonNull() ? null : phone.getAsString());
        } else if (jdaClientInfo.getApiCode() == DiscordCode.UNAUTHORIZED) {
            throw new InvalidTokenException("The specified user token is not valid | Discord >> message: " + jdaClientInfo.getApiCode().getMessage() + " <|> code: " + jdaClientInfo.getApiCode().getCode());
        } else if (jdaClientInfo.getApiCode() == DiscordCode.UNKNOWN_USER) {
            throw new UnknownUserException("The user you are looking for was not found | Discord >> message: " + jdaClientInfo.getApiCode().getMessage() + " <|> code: " + jdaClientInfo.getApiCode().getCode());
        }

        return jdaClientInfo;
    }

    // Building the JDAClient from the JDAClientInfo
    public JDAClient buildUser() throws Exception {
        JDAClientInfo jdaClientInfo = new JDAClientInfo();

        // Looking for id, apiVersion, token is null
        assert id != null;
        assert apiVersion != null;
        assert token != null;

        JsonObject jsonObject = Request.getJson("https://discord.com/api/v" + this.apiVersion + "/users/" + this.id, this.token);

        // Setting up the JDAClient for the given User
        JsonElement code = jsonObject.get("code");
        JsonElement id = jsonObject.get("id");
        JsonElement username = jsonObject.get("username");
        JsonElement avatar = jsonObject.get("avatar");
        JsonElement discriminator = jsonObject.get("discriminator");
        JsonElement public_flags = jsonObject.get("public_flags");
        JsonElement banner = jsonObject.get("banner");
        JsonElement banner_color = jsonObject.get("banner_color");
        JsonElement accent_color = jsonObject.get("accent_color");

        jdaClientInfo.setApiCode(code.isJsonNull() ? DiscordCode.OK : DiscordCode.getFromCode(code.getAsInt()));

        if (jdaClientInfo.getApiCode() == DiscordCode.OK) {
            jdaClientInfo.setId(id.isJsonNull() ? null : id.getAsLong());
            jdaClientInfo.setUsername(username.isJsonNull() ? null : username.getAsString());
            jdaClientInfo.setAvatar(avatar.isJsonNull() ? null : avatar.getAsString());
            jdaClientInfo.setDiscriminator(discriminator.isJsonNull() ? null : discriminator.getAsString());
            jdaClientInfo.setCreationTime(DiscordUtil.getCreationDate(jdaClientInfo.getId()));
            jdaClientInfo.setPublicFlags(public_flags.isJsonNull() ? null : public_flags.getAsInt());
            jdaClientInfo.setBanner(banner.isJsonNull() ? null : banner.getAsString());
            jdaClientInfo.setBannerColor(banner_color.isJsonNull() ? null : Color.decode(banner_color.getAsString()));
            jdaClientInfo.setAccentColor(accent_color.isJsonNull() ? null : Color.decode(accent_color.getAsString()));
        } else if (jdaClientInfo.getApiCode() == DiscordCode.UNAUTHORIZED) {
            throw new InvalidTokenException("The specified user token is not valid | Discord >> message: " + jdaClientInfo.getApiCode().getMessage() + " <|> code: " + jdaClientInfo.getApiCode().getCode());
        } else if (jdaClientInfo.getApiCode() == DiscordCode.UNKNOWN_USER) {
            throw new UnknownUserException("The user you are looking for was not found | Discord >> message: " + jdaClientInfo.getApiCode().getMessage() + " <|> code: " + jdaClientInfo.getApiCode().getCode());
        }

        return jdaClientInfo;
    }

    public JDAClientBuilder setId(String id) {
        this.id = Long.parseLong(id);
        return this;
    }

    public JDAClientBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public JDAClientBuilder setToken(String token) {
        this.token = token;
        return this;
    }
}
