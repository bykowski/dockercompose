package pl.bykowski.springbootapiclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class CarClient {

    private RestTemplate restTemplate;

    public CarClient() {
        this.restTemplate = new RestTemplate();
    }

    @GetMapping("/gui")
    public String get(Model model) {
        ResponseEntity<Car[]> exchange = restTemplate.exchange("http://host.docker.internal:8080/car",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                Car[].class);

        Car[] body = exchange.getBody();

        model.addAttribute("id", body[0].getId());
        model.addAttribute("mark", body[0].getMark());
        return "gui";

    }

}
