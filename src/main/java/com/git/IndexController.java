package com.git;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("/welcome")
    public String print() {
        return "Hello World";
    }
}
