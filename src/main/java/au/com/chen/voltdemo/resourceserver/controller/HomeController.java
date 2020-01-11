package au.com.chen.voltdemo.resourceserver.controller;


import au.com.chen.voltdemo.resourceserver.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home page";
    }

    @RequestMapping(value = "/private", method = RequestMethod.GET)
    public String privatePage() {
        return "private page";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin() {
        return "admin page";
    }

}
