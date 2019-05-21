import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @ResponseBody
    @RequestMapping("/welcome")
    public String print() {
        return "Hello World";
    }
}
