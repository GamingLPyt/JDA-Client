package de.jdaclient;

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
     * @return Flag as {@link Integer}
     */
    public int getPublicFlags();

    /**
     * The Banner that is connected with the User
     *
     * @return Banner as {@link String}
     */
    public String getBanner();

    /**
     * The Color of the Banner that is connected with the User
     *
     * @return Color of the Banner as {@link Color}
     */
    public Color getBannerColor();

    /**
     * The Accent-Color of the Banner that is connected with the User
     *
     * @return Accent-Color of the Banner as {@link Color}
     */
    public Color getAccentColor();
}
