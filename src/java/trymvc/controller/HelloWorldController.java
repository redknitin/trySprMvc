package trymvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// http://localhost:8180/trySprMvc/helloworld/a

/**
 *
 * @author nitin
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/a")
    public String hello(
            @RequestParam(value="name", required=false, defaultValue="World")
            String name, 
            Model model
    ) {
        model.addAttribute("name", name);
        return "helloview";
    }
    
    @RequestMapping("/hello.htm")
    public String jello() { return "helloview"; }
}
