package de.jdaclient;

import com.google.gson.JsonObject;
import de.jdaclient.entities.JDAClientInfo;
import de.jdaclient.entities.JDAClientSelfInfo;
import de.jdaclient.utils.JSONParser;

import java.awt.*;

public class JDAClientBuilder {

    // The UserID of the user you want to get
    protected Long id = null;

    // The API-Version of Discord you want to use
    protected String apiVersion = null;

    // Your user token
    protected String token = null;

    // Will be created
    protected JDAClient jdaClient = null;

    public JDAClientBuilder() {}

    // Building the JDAClient from the JDAClientSelfInfo
    public JDAClient buildSelfUser() throws Exception {
        JDAClientSelfInfo jdaClientInfo = new JDAClientSelfInfo();

        assert apiVersion != null;
        assert token != null;

        JsonObject jsonObject = JSONParser.getJson("https://discord.com/api/" + this.apiVersion + "/users/@me", this.token);

        // Setting up the JDAClient for the given User
        jdaClientInfo.setId(jsonObject.get("id").getAsLong());
        jdaClientInfo.setUsername(jsonObject.get("username").getAsString());
        jdaClientInfo.setAvatar(jsonObject.get("avatar").getAsString());
        jdaClientInfo.setDiscriminator(jsonObject.get("discriminator").getAsString());
        jdaClientInfo.setPublicFlags(jsonObject.get("public_flags").getAsInt());
        jdaClientInfo.setFlags(jsonObject.get("flags").getAsInt());
        jdaClientInfo.setPurchasedFlags(jsonObject.get("purchased_flags").getAsInt());
        jdaClientInfo.setPremiumUsageFlags(jsonObject.get("premium_usage_flags").getAsInt());
        jdaClientInfo.setBanner(jsonObject.get("banner").getAsString());
        jdaClientInfo.setBannerColor(Color.decode(jsonObject.get("banner_color").getAsString()));
        jdaClientInfo.setAccentColor(Color.decode(jsonObject.get("accent_color").getAsString()));
        jdaClientInfo.setBio(jsonObject.get("bio").getAsString());
        jdaClientInfo.setLocale(jsonObject.get("locale").getAsString());
        jdaClientInfo.setNsfwAllowed(jsonObject.get("nsfw_allowed").getAsBoolean());
        jdaClientInfo.setMfaEnabled(jsonObject.get("mfa_enabled").getAsBoolean());
        jdaClientInfo.setPremiumType(jsonObject.get("premium_type").getAsInt());
        jdaClientInfo.setEmail(jsonObject.get("email").getAsString());
        jdaClientInfo.setVerified(jsonObject.get("verified").getAsBoolean());
        jdaClientInfo.setPhone(jsonObject.get("phone").getAsString());

        return jdaClientInfo;
    }

    // Building the JDAClient from the JDAClientInfo
    public JDAClient buildUser() throws Exception {
        JDAClientInfo jdaClientInfo = new JDAClientInfo();

        // Looking for id, apiVersion, token is null
        assert id != null;
        assert apiVersion != null;
        assert token != null;

        JsonObject jsonObject = JSONParser.getJson("https://discord.com/api/" + this.apiVersion + "/users/" + this.id, this.token);

        // Setting up the JDAClient for the given User
        jdaClientInfo.setId(jsonObject.get("id").getAsLong());
        jdaClientInfo.setUsername(jsonObject.get("username").getAsString());
        jdaClientInfo.setAvatar(jsonObject.get("avatar").getAsString());
        jdaClientInfo.setDiscriminator(jsonObject.get("discriminator").getAsString());
        jdaClientInfo.setFlags(jsonObject.get("flags").getAsInt());
        jdaClientInfo.setBanner(jsonObject.get("banner").getAsString());
        jdaClientInfo.setBannerColor(Color.decode(jsonObject.get("banner_color").getAsString()));
        jdaClientInfo.setAccentColor(Color.decode(jsonObject.get("accent_color").getAsString()));

        return jdaClientInfo;
    }

    public void setId(String id) {
        this.id = Long.parseLong(id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
