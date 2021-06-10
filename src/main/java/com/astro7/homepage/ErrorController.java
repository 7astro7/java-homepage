
/*
package com.astro7.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
public class ErrorController {

    @GetMapping(path = "/error")
    public String handle(HttpServletRequest request) {
       HashMap<String, Object> map = new HashMap<String, Object>();
       map.put("status", request.getAttribute("javax.servlet.error.status_code"));
       map.put("reason", request.getAttribute("javax.servlet.error.message"));
       return "tightboi";
    }
}
*/
