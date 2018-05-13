package com.example.websocketdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketConfigurer {

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry arg0) {
		// TODO Auto-generated method stub

	}

	public void registerStompEndPoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/ws").withSockJS();
	}

	public void configureMessageBroker(MessageBrokerRegistry registry) {
		registry.setApplicationDestinationPrefixes("/app");
		registry.enableSimpleBroker("/topic");
	}
}
