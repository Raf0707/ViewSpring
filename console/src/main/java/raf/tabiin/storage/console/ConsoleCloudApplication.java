package raf.tabiin.storage.console;

import org.apache.logging.log4j.message.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import raf.tabiin.storage.console.controller.ConsoleController;

@SpringBootApplication
public class ConsoleCloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsoleCloudApplication.class, args);
	}
}
