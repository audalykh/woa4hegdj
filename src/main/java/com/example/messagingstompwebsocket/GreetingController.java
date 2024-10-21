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

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) {
		return greetingService.greet(message);
	}

}
