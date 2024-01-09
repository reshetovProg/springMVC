package org.springProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/index2")
    public String getIndex2(){
        return "index2";
    }
}
