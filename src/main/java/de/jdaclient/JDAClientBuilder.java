package de.jdaclient;

import com.google.gson.JsonObject;
import de.jdaclient.entities.JDAClientInfo;
import de.jdaclient.utils.JSONParser;

import java.awt.*;

public class JDAClientBuilder {

    protected Long id = null;
    protected String apiVersion = null;
    protected String token = null;
    protected JDAClient jdaClient = null;

    public JDAClientBuilder() {}

    public JDAClient build() throws Exception {
        JDAClientInfo jdaClientInfo = new JDAClientInfo();

        assert id != null;
        assert apiVersion != null;
        assert token != null;

        JsonObject jsonObject = JSONParser.getJson("https://discord.com/api/" + this.apiVersion + "/users/", this.token);

        jdaClientInfo.setId(this.id);
        jdaClientInfo.setUsername(jsonObject.get("username").getAsString());
        jdaClientInfo.setAvatar(jsonObject.get("avatar").getAsString());
        jdaClientInfo.setDiscriminator(jsonObject.get("discriminator").getAsString());
        jdaClientInfo.setFlag(jsonObject.get("flag").getAsInt());
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
