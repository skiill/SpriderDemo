package com.xsj.api;

import com.xsj.service.SpriderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("sprider")
@RestController
public class SpriderController {

    @Autowired
    SpriderService spriderService;



    @GetMapping("gethtml")
    public String getHtml(String url){
        String html = spriderService.getHtml(url);
        return html;
    }
}
