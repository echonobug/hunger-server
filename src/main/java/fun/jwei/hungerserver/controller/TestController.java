package fun.jwei.hungerserver.controller;

import fun.jwei.hungerserver.model.SwiperImg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @ResponseBody
    @GetMapping("/test")
    public SwiperImg test(){
        SwiperImg swiperImg = new SwiperImg();
        swiperImg.setId(1);
        swiperImg.setSrc("hello");
        return swiperImg;
    }
}
