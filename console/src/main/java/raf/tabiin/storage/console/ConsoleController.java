package raf.tabiin.storage.console;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Controller
public class ConsoleController {

    @GetMapping("/")
    public String console() {
        return "greeting";
    }
    private String hiMessage =
            "https://github.com/Raf0707/RafConsole/blob/master/README.md";

    @RequestMapping(value = "/console", method = RequestMethod.GET)
    public String testConsole() {
        return hiMessage;
    }





}
