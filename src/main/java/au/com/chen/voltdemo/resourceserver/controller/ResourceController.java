package au.com.chen.voltdemo.resourceserver.controller;


import au.com.chen.voltdemo.resourceserver.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/resource")
public class ResourceController {

    @Autowired
    ProducerService producerService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("message") String message) {
        producerService.send(message);

        return "Message sent to the Kafka Topic user Successfully";
    }

}
