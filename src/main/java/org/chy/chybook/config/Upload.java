package org.chy.chybook.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author CHY
 * @since 2024-11-01
 */
@Data
@Component
@ConfigurationProperties(prefix = "chybook.upload")
public class Upload {
    private String coverImg;
    private String chapterText;
    private String chapterImg;
    private String userImg;
}
