package com.phegondev.PhegonHotel.Config;

import com.cloudinary.Cloudinary;
import lombok.AccessLevel;
import lombok.Value;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Configuration
public class CloudinaryConfig {

    String cloudName = "dy7iobhtz";
    String apiKey = "193982956782892";
    String apiSecret = "2FrGvxBdYCAkDBnzuF5kwbwnhgw";

    @Bean
    public Cloudinary cloudinary() {
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", cloudName);
        config.put("api_key", apiKey);
        config.put("api_secret", apiSecret);
        return new Cloudinary(config);
    }
}
