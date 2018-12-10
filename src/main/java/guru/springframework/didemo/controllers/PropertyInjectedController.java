package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {


    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    //ako hoces kroz proerty da injectujes neki bean kroz interfejs mozes to da uradis ovako, injectujes interface i onda u property name odaberes ime beana, i spring boot ce to
    //znati da parsira ili naravno kroz queifier

//    public GreetingServiceImpl getGreetingService () {
//        return greetingService;
//    }

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }






}
