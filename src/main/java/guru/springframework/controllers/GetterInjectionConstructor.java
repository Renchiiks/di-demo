package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectionConstructor {
    private GreetingService greetingService;

    @Autowired
    public GreetingService setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService) {
        return this.greetingService = greetingService;
    }
}
