package com.example.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "product.images")
public class ProductImageProperties {

	private String uploadDirectory;

	private String publicUrl;

	private String defaultExtension;

}
