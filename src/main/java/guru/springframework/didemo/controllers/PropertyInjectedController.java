package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {


    @Autowired
    public GreetingServiceImpl greetingService;

//    public GreetingServiceImpl getGreetingService () {
//        return greetingService;
//    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }






}
