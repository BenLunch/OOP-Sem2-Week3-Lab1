package ie.atu.oopsem2week3lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World";
    }
}
