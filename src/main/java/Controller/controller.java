package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class controller {
    @RequestMapping(value = "/")
    public String test(){
        return "index";
    }
}
