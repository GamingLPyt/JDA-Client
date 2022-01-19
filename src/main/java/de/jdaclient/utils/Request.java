package de.jdaclient.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Request {

    public static String getApiVersion() throws Exception {
        URL url = new URL("https://discord.com");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String line;
        String html = null;

        while ((line = br.readLine()) != null) {
            html += line + "\n";
        }

        html = html.split("API_VERSION")[1];
        html = html.split("WEBAPP_ENDPOINT")[0];
        html = html.replace("\'", "");
        html = html.substring(2, 3);

        return html;
    }

    public static JsonObject getJson(String url, String token) throws Exception {
        URL url1 = new URL(url);
        HttpURLConnection urlConnection = (HttpURLConnection) url1.openConnection();

        urlConnection.setRequestMethod("GET");
        urlConnection.setRequestProperty("Content-Type", "application/json");
        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.182 Safari/537.36 Edg/88.0.705.74");
        urlConnection.setRequestProperty("Authorization", token);
        urlConnection.connect();

        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(new InputStreamReader((InputStream) urlConnection.getContent()));
        return jsonElement.getAsJsonObject();
    }
}
