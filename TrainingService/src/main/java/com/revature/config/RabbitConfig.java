package com.revature.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configures the RabbitMQ listener.
 */
@Configuration
public class RabbitConfig {

	@Bean
	MessageConverter msgConverter() {
		return new Jackson2JsonMessageConverter();
	}

}
