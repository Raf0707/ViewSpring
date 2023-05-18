package raf.tabiin.storage.console.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConsoleController {
    private String[] requestMessage = {

            "Console API Done! \n",
            "Let's Start! ",
            "Welcome to Raf Console Application! \n",
            "\n",
            "Hi guys and As - Salamu Aleykum! \n",
            "Try to deploy my application on Heroku! \n",
            "Follow the instructions and do everything carefully! \n"
    };

    private String hiMessage =
            """
                        Console API Done! 
                        Let's Start! 
                        Welcome to Raf Console Application! 
                             
                        Hi guys and As-Salamu Aleykum! 
                        Try to deploy my application on Heroku! 
                        Follow the instructions and do everything carefully! 
            """;
    @RequestMapping(value = "/console", method = RequestMethod.GET)
    public String testConsole() {
        return hiMessage;
    }

}
