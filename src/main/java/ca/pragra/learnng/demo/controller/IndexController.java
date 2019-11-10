package ca.pragra.learnng.demo.controller;

import ca.pragra.learnng.demo.domain.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class IndexController {

    private RestTemplate template;

    public IndexController(RestTemplate template) {
        this.template = template;
    }

    @GetMapping("/")
    public String getHome(Model model){
        UserDetails userDetails = template.getForObject("https://api.github.com/users/{username}", UserDetails.class,"arjunsharman06");
        model.addAttribute("userDetails", userDetails);
        return "index";
    }
}
