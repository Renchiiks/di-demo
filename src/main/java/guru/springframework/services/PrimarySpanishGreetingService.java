package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class PrimarySpanishGreetingService  implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }


    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
