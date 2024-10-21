package com.example.messagingstompwebsocket.service;

import com.example.messagingstompwebsocket.HelloMessage;
import com.example.messagingstompwebsocket.domain.Greeting;
import com.example.messagingstompwebsocket.repository.GreetingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.util.HtmlUtils;

@Service
@RequiredArgsConstructor
public class GreetingService {

    private final GreetingRepository greetingRepository;

    @Transactional
    public Greeting greet(HelloMessage message) {
        return greetingRepository.addGreeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}