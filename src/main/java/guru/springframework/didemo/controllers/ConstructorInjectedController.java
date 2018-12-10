package guru.springframework.didemo.controllers;


import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    private GreetingService greetingService;


    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    //ovde dodajes ovaj qualifier zato sto ima tri beana koji implemetiraju interface GreetingService, i bukvalno onda ne zna koji bean da injectuje
    //zato mu kazes naziv beana koji treba da se injectuje, a rekli smo da je konvencija da nazive bean-a spring boot dodeljuje kao naziv klase samo stavi
    //prvlo slovo malo.

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
