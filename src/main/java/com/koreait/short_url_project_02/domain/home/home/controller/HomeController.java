package com.koreait.short_url_project_02.domain.home.home.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Value("${custom.site.name}")
    private String customSiteName;

    @Value("${custom.secret.key}")
    private String secretKey;

    @GetMapping("/")
    @ResponseBody
    public String home() {
<<<<<<< HEAD
        return "123Main Page!!! " + customSiteName;
=======
        return "123455678Main Page!!! " + customSiteName;
>>>>>>> 64b4c24 (자동배포 테스트)
    }

    @GetMapping("/secretKey")
    @ResponseBody
    public String secretKey() {
        return "secretKey :  " + secretKey;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 64b4c24 (자동배포 테스트)
