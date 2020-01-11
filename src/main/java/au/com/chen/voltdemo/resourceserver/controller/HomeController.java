package au.com.chen.voltdemo.resourceserver.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/home")
    public String home() {
        return "home page";
    }

    @GetMapping(value = "/private")
    public String privatePage() {
        return "private page";
    }

    @GetMapping(value = "/admin")
    public String admin() {
        return "admin page";
    }

    @GetMapping("/private-data")
    public String privateData() {
        return "private data";
    }

    @GetMapping("/admin-data")
    public String adminData() {
        return "admin data";
    }

}
