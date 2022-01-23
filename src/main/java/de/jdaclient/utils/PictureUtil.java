package de.jdaclient.utils;

import de.jdaclient.utils.enums.PictureType;

public class PictureUtil {

    public static String getDiscordPicture(Long id, String pictureID, PictureType pictureType) {
        if (pictureID == null) return null;
        return String.format("https://cdn.discordapp.com/%s/" + id + "/" + pictureID + ".%s", pictureType.getType(), isGif(pictureID) ? "gif" : "png");
    }

    public static boolean isGif(String pictureID) {
        return pictureID.startsWith("a_");
    }
}
