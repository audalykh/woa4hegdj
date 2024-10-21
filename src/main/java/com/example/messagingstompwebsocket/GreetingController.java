package com.example.messagingstompwebsocket;

import com.example.messagingstompwebsocket.domain.Greeting;
import com.example.messagingstompwebsocket.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class GreetingController {

	private final GreetingService greetingService;

	// "слушатель" сообщений на топике /app/hello
	@MessageMapping("/hello")
	// послать сообщение на UI через web-socket подписчику, который слушает топик /topic/greetings
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) {
		return greetingService.greet(message);
	}
}
