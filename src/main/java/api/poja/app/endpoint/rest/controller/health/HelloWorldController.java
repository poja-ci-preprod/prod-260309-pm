package api.poja.app.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
  @GetMapping("/hello-world")
  public String helloWorld() {
    return "Hello world from Poja!";
  }
}
