package de.jdaclient;

import de.jdaclient.utils.enums.DiscordCode;
import de.jdaclient.utils.enums.PublicFlags;

import java.awt.*;
import java.time.OffsetDateTime;

public interface JDAClient {

    /**
     * The ID that is connected with the User
     *
     * @return ID as {@link Long}
     */
    public Long getId();

    /**
     * The Username that is connected with the User
     *
     * @return Username as {@link String}
     */
    public String getUsername();

    /**
     * The Avatar that is connected with the User
     *
     * @return Avatar as {@link String}
     */
    public String getAvatar();

    /**
     * The Discriminator that is connected with the User
     *
     * @return Discriminator as {@link String}
     */
    public String getDiscriminator();

    /**
     * The Creation-Time of the given User
     *
     * @return Creation-Time as {@link OffsetDateTime}
     */
    public OffsetDateTime getCreationTime();

    /**
     * The Flag that is connected with the User
     *
     * @return Flag as {@link PublicFlags}
     */
    public PublicFlags getPublicFlags();

    /**
     * The Banner that is connected with the User
     *
     * @return Banner as {@link String}
     */
    public String getBanner();

    /**
     * The Color of the Banner that is connected with the User
     *
     * @return Color of the Banner as {@link String}
     */
    public String getBannerColor();

    /**
     * The Accent-Color of the Banner that is connected with the User
     *
     * @return Accent-Color of the Banner as {@link Integer}
     */
    public int getAccentColor();

    /**
     *
     * @return Discord response Code with Message as Enum {@link DiscordCode}
     */
    public DiscordCode getApiCode();
}
