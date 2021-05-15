/**
 * 
 */
package com.shahzad.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import lombok.Data;

/**
 * @author shahzad.hussain
 *
 */
@Data
@Service
@ConfigurationProperties("region")
public class AppProperties {

	private String name;
}