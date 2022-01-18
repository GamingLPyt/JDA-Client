package de.jdaclient.utils;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class DiscordUtil {

    /**
     * This class comes from the original Discord JDA
     * (https://github.com/DV8FromTheWorld/JDA/blob/master/src/main/java/net/dv8tion/jda/api/utils/TimeUtil.java)
     */

    public static final long DISCORD_EPOCH = 1420070400000L;
    public static final long TIMESTAMP_OFFSET = 22;
    private static final DateTimeFormatter dtFormatter = DateTimeFormatter.RFC_1123_DATE_TIME;


    public static OffsetDateTime getCreationDate(String id) {
        return getCreationDate(Long.parseLong(id));
    }

    public static OffsetDateTime getCreationDate(Long id) {
        long timestamp = (id >>> TIMESTAMP_OFFSET) + DISCORD_EPOCH;
        Calendar gmt = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmt.setTimeInMillis(timestamp);
        return OffsetDateTime.ofInstant(gmt.toInstant(), gmt.getTimeZone().toZoneId());
    }

    public static long getDiscordTimestamp(long millisTimestamp) {
        return (millisTimestamp - DISCORD_EPOCH) << TIMESTAMP_OFFSET;
    }

    public static String getDateTimeString(OffsetDateTime time) {
        return time.format(dtFormatter);
    }
}
