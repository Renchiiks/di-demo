package guru.springframework.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello";
    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
