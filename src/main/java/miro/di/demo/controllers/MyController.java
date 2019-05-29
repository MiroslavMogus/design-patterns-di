package miro.di.demo.controllers;

import org.springframework.stereotype.Controller;
import static java.lang.System.out;

@Controller
public class MyController  {

    public String helloDi() {
        out.println("Hello from DI!");

        return "di";
    }
}
