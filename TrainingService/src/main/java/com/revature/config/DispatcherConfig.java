package com.revature.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Auto-configuration for identifying controllers.
 */
@Configuration
@ComponentScan("com.revature")
@EnableWebMvc
public class DispatcherConfig {

}
