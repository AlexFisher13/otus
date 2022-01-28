package ru.otus.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@ConfigurationProperties("database.client.age")
@Getter
@Setter
public class DataBaseProperties {
    private int defaultClientAge;
}
